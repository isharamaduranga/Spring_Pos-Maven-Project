/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/2/2023
 * Time        : 10:30 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemService service;

    @GetMapping
    public ResponseUtil getAllItems(){
        ArrayList<ItemDTO> allItems = service.getAllItems();
        return new ResponseUtil("200","Success.",allItems);
    }

    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO dto){
        service.addItem(dto);
        return new ResponseUtil("200", dto.getCode()+" Successfully Saved..",null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto){
        service.updateItem(dto);
        return new ResponseUtil("200", dto.getCode()+" Successfully Updated..",null);
    }

    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code){
        service.deleteItem(code);
        return new ResponseUtil("200", code+" Successfully Deleted ..!",null);
    }

}
