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
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin //this will handle all the cross policy errors
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){
        service.addCustomer(dto);
        return new ResponseUtil("200",dto.toString()+" Successfully Added..",null);
    }

}
