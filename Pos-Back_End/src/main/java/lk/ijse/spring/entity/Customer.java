/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/1/2023
 * Time        : 11:12 AM
 * Year        : 2023
 */

package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;
}
