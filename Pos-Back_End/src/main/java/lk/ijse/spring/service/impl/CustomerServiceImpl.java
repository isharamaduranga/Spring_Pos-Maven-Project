/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/1/2023
 * Time        : 11:21 AM
 * Year        : 2023
 */

package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void addCustomer(CustomerDTO dto) {
        repo.save(mapper.map(dto, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {
        repo.deleteById(id);
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        repo.save(mapper.map(dto,Customer.class));
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> customerList = repo.findAll();
      return  mapper.map(customerList,new TypeToken<ArrayList<CustomerDTO>>() {
      }.getType());
    }
}
