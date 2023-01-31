/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 1/31/2023
 * Time        : 9:51 PM
 * Year        : 2023
 */

package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;
}
