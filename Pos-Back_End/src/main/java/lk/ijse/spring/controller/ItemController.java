/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/2/2023
 * Time        : 10:30 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @GetMapping
    public ResponseUtil getAllItems(){

    }

    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO dto){

    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto){

    }

    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code){

    }

}
