package com.cmdbms.mapper;

import com.cmdbms.model.Electric;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ElectricMapper {

    int deleteByPrimaryKey(Integer eleId);


    int insert(Electric record);


    List<Electric> selectByPrimaryKey(@Param(value = "elePlace")Integer elePlace,
                                      @Param(value = "eleMonth")Integer eleMonth,
                                      @Param(value = "eleYear")Integer eleYear,
                                      @Param(value = "elePlaceType")String elePlaceType);


    List<Electric> selectAll();


    int updateByPrimaryKey(Electric record);
}