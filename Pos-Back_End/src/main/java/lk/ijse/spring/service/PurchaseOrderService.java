package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.OrdersDTO;

import java.util.ArrayList;

public interface PurchaseOrderService {
    public void purchaseOrder(OrdersDTO dto);
    ArrayList<OrdersDTO> getAllOrders();
}
