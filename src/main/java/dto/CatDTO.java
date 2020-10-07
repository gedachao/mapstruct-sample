package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description: CatDTO
 * @Author: gedachao
 * @Date: 2020-10-07 15:56
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatDTO {
    private String catName;
    private String catAddress;
    private Date birthday;
    private String masterName;
}
