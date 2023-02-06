/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/5/2023
 * Time        : 2:35 PM
 * Year        : 2023
 */

package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Orders {
    @Id
    private String oid;

    //Out=verse
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name ="customerID",referencedColumnName = "id",nullable = false)
    private Customer cusID;
    private LocalDate date;

    //Inverse (someone save order already manage and if that order has orderDetails data auto Manage orderDetails)
    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;


}
