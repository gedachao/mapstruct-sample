package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description: Cat
 * @Author: gedachao
 * @Date: 2020-10-07 15:39
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    private String catName;
    private String address;
    private Date birthday;
    private Master master;
}
