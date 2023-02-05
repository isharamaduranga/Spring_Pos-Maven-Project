/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/5/2023
 * Time        : 2:43 PM
 * Year        : 2023
 */

package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@IdClass(OrderItem_PK.class)
public class OrderDetails {
    @Id
    private String oid;
    @Id
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    //Out-Verse
    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;

    //Out-verse
    @ManyToOne
    @JoinColumn(name = "itemCode",referencedColumnName = "code",insertable = false,updatable = false)
    private Item items;

}
