package com.cmdbms.mapper;

import com.cmdbms.model.Stock;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockMapper {

    int deleteByPrimaryKey(Integer stockId);


    int insert(Stock record);


    List<Stock> selectByPrimaryKey(@Param(value = "stockEquipment")String stockEquipment);


    List<Stock> selectAll();


    int updateByPrimaryKey(Stock record);
}