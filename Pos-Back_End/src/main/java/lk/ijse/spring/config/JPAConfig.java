/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/1/2023
 * Time        : 10:10 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

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
       DriverManagerDataSource ds = new DriverManagerDataSource();
       ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
       ds.setUrl("jdbc:mysql://localhost:3306/maven_pos?createDatabaseIfNotExist=true");
       ds.setUsername("root");
       ds.setPassword("1234");
       return ds;
   }
}
