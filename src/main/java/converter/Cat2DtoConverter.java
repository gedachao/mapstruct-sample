package converter;

import domain.Cat;
import dto.CatDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Description: Cat2DtoConverter
 * @Author: gedachao
 * @Date: 2020-10-07 16:01
 * @Version 1.0
 */

@Mapper
public interface Cat2DtoConverter {
    Cat2DtoConverter INSTANCE = Mappers.getMapper(Cat2DtoConverter.class);

    @Mapping(source = "catName", target = "catName")
    @Mapping(source = "address", target = "catAddress")
    @Mapping(source = "cat.master.name", target = "masterName")
    CatDTO cat2CatDTO(Cat cat);


}
