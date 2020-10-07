import converter.Cat2DtoConverter;
import domain.Cat;
import domain.Master;
import dto.CatDTO;

import java.util.Date;

/**
 * @Description: Demo
 * @Author: gedachao
 * @Date: 2020-10-07 16:28
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {

        Master master = new Master("jdc", "suzhou");
        Cat cat = new Cat("Tom", "comic", new Date(), master);
        CatDTO catDTO = Cat2DtoConverter.INSTANCE.cat2CatDTO(cat);
        System.out.println(catDTO);

    }
}
