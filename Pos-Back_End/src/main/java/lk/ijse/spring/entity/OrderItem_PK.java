/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/5/2023
 * Time        : 6:12 PM
 * Year        : 2023
 */

package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItem_PK implements Serializable {
    private String oid;
    private String itemCode;
}
