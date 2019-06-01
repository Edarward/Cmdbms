package com.cmdbms.mapper;

import com.cmdbms.model.Purchasing;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface PurchasingMapper {

    int deleteByPrimaryKey(Integer purId);


    int insert(@Param(value = "purId")Integer purId,
               @Param(value = "purEquipment")String purEquipment,
               @Param(value = "purProName")String purProName,
               @Param(value = "purTime") Date purTime,
               @Param(value = "purAmount")Integer purAmount,
               @Param(value = "purPrice")BigDecimal purPrice,
               @Param(value = "purMan")String purMan,
               @Param(value = "purAuditing")Boolean purAuditing);


    List<Purchasing> selectByPrimaryKey(Boolean purAuditing);


    List<Purchasing> selectAll();


    int updateByPrimaryKey(Purchasing record);
}