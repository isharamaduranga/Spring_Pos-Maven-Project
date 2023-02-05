/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/5/2023
 * Time        : 11:58 AM
 * Year        : 2023
 */

package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.repo.OrderDetailsRepo;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.service.PurchaseOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private OrdersRepo ordersRepo;
    @Autowired
    private OrderDetailsRepo orderDetailsRepo;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private ItemRepo itemRepo;

    @Override
    public void purchaseOrder(OrdersDTO dto) {
        // Let's handle it in Spring way(dto convert entity)
        Orders orders = mapper.map(dto, Orders.class);

        //check order already available..
        if (ordersRepo.existsById(orders.getOid())){
            throw new RuntimeException("Order : "+orders.getOid()+ " Already Available .!!!");
        }
        /** save order and order details (because define order entity cascade type ALL) */

        ordersRepo.save(orders); // If an error occur all transactions will be rolled backend


        for (OrderDetails od : orders.getOrderDetails()) {
            /**  find and update item qty on hand ...  */
            Optional<Item> resp = itemRepo.findById(od.getItemCode());

            if (!resp.isPresent()) {
                throw new RuntimeException(od.getItemCode()+ ": Item Not Available !!!");
            }

            Item item = resp.get();
            item.setQtyOnHand((item.getQtyOnHand()- od.getQty()));
            itemRepo.save(item);

        }

    }
}
