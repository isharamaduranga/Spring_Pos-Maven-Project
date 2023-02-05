/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/5/2023
 * Time        : 1:59 PM
 * Year        : 2023
 */

package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrdersDTO {
    private String oid;
    private String cusID;
    private LocalDate date;

    //For define orderDetails json array into backend
    private ArrayList<OrderDetailsDTO> orderDetails;
}
