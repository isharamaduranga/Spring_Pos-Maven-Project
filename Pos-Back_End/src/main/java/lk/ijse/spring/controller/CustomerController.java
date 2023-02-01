/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 1/31/2023
 * Time        : 9:57 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDTO dto){
        service.addCustomer(dto);
    }

}
