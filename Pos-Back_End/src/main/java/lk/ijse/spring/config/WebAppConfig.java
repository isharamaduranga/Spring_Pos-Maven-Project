/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 1/31/2023
 * Time        : 2:43 PM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import lk.ijse.spring.advice.AppWideExceptionHandler;
import lk.ijse.spring.controller.CustomerController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = {CustomerController.class, AppWideExceptionHandler.class})
@EnableWebMvc
public class WebAppConfig {

}
