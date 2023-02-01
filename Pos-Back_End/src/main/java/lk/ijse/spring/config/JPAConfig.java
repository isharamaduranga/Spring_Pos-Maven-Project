/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/1/2023
 * Time        : 10:10 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import lk.ijse.spring.repo.CustomerRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement // aspect (Manage all my Transactions automatically using Transaction Manager)
@EnableJpaRepositories(basePackageClasses = {CustomerRepo.class}) //link dao classes

public class JPAConfig {

    @Bean
   public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds , JpaVendorAdapter jpa){
       LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
       bean.setPackagesToScan("lk.ijse.spring.entity");
       bean.setDataSource(ds);
       bean.setJpaVendorAdapter(jpa);
       return bean;
   }

   @Bean
   public DataSource dataSource(){
       //we use this data source only for testing purposes (Development)
       //if we are in (Production) we can use a DBCP pool
       DriverManagerDataSource ds = new DriverManagerDataSource();
       ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
       ds.setUrl("jdbc:mysql://localhost:3306/maven_pos?createDatabaseIfNotExist=true");
       ds.setUsername("root");
       ds.setPassword("1234");
       return ds;
   }

   @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
       HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
       va.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
       va.setDatabase(Database.MYSQL);
       va.setGenerateDdl(true);
       va.setShowSql(true);
       return va;
   }

   @Bean
   public PlatformTransactionManager transactionManager (EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
   }
}
