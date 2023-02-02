package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemService {

    void addItem(ItemDTO dto);

    void deleteItem(String code);

    void updateItem(ItemDTO dto);

    ArrayList<ItemDTO> getAllItems();
}
