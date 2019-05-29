package com.cmdbms.service;

import com.cmdbms.model.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

public interface EquipmentSer {
    List selectSpo();

    String insertSpo(Spoilage spoilage);

    String updateSpo(Spoilage spoilage);

    List selectOut();

    String insertOut(Output output);

    List selectStock(String stockEquipment);

    String insertStock(Stock stock);

    String updateStock(Stock stock);

    int deleteStock(Integer id);

    List selectPur(Boolean purAuditing);

    String insertPur(Integer purId,String purEquipment, String purProName, String purTime, Integer purAmount,
                     BigDecimal purPrice, String purMan, Boolean purAuditing) throws ParseException;

    List selectChe();

    String insertChe(Check check);
}
