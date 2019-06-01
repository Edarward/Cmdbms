package com.cmdbms.mapper;

import com.cmdbms.model.Water;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WaterMapper {

    int deleteByPrimaryKey(Integer watId);


    int insert(Water record);


    List<Water> selectByPrimaryKey(@Param(value = "watPlace") String watPlace,
                                   @Param(value = "watMonth") Integer watMonth,
                                   @Param(value = "watYear") Integer watYear,
                                   @Param(value = "watPlaceType") String watPlaceType);


    List<Water> selectAll();


    int updateByPrimaryKey(Water record);
}