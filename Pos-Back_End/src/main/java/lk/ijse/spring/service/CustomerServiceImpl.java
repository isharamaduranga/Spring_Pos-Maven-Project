/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/1/2023
 * Time        : 11:21 AM
 * Year        : 2023
 */

package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void addCustomer(CustomerDTO dto) {

    }

    @Override
    public void deleteCustomer(CustomerDTO dto) {

    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        return null;
    }
}
