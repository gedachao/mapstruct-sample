package test;

import converter.Cat2DtoConverter;
import domain.Cat;
import domain.Master;
import dto.CatDTO;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.util.Date;

/**
 * @Description: ConverterTest
 * @Author: gedachao
 * @Date: 2020-10-07 16:09
 * @Version 1.0
 */
public class ConverterTest {
    @Test
    public void test1() {
        Cat2DtoConverter converter = Mappers.getMapper(Cat2DtoConverter.class);
        Master master = new Master("jdc", "suzhou");
        Cat cat = new Cat("Tom", "comic", new Date(), master);
        CatDTO catDTO = converter.cat2CatDTO(cat);
        System.out.println(catDTO.getCatName());


    }
}
