package com.cmdbms.service.Impl;


import com.cmdbms.mapper.*;
import com.cmdbms.model.*;
import com.cmdbms.service.EquipmentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class EquipmentSerImpl implements EquipmentSer {
    @Autowired
    private SpoilageMapper spoilageMapper;
    @Autowired
    private OutputMapper outputMapper;
    @Autowired
    private StockMapper stockMapper;
    @Autowired
    private PurchasingMapper purchasingMapper;
    @Autowired
    private CheckMapper checkMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public  List<Spoilage> selectSpo(){
        List<Spoilage> spoilageList= spoilageMapper.selectAll();
        return spoilageList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertSpo(Spoilage spoilage){
        Integer record=spoilageMapper.insert(spoilage);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateSpo(Spoilage spoilage){
        Integer record=spoilageMapper.updateByPrimaryKey(spoilage);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Output> selectOut(){
        List<Output> outputList= outputMapper.selectAll();
        return outputList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertOut(Output output){
        Integer record=outputMapper.insert(output);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Stock> selectStock(String stockEquipment){
        List<Stock> stockList= stockMapper.selectByPrimaryKey(stockEquipment);
        return stockList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertStock(Stock stock){
        Integer record=stockMapper.insert(stock);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateStock(Stock stock){
        Integer record=stockMapper.updateByPrimaryKey(stock);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteStock(Integer id){
        stockMapper.deleteByPrimaryKey(id);
        return id;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Purchasing> selectPur(Boolean purAuditing){
        List<Purchasing> purchasingList = purchasingMapper.selectByPrimaryKey(purAuditing);
        return purchasingList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertPur(Integer purId,String purEquipment, String purProName, String purTime, Integer purAmount,
                            BigDecimal purPrice, String purMan, Boolean purAuditing) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newPurTime = sdf.parse(purTime);
        Integer record = purchasingMapper.insert(purId,purEquipment,purProName,newPurTime,purAmount,purPrice,purMan,purAuditing);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Check> selectChe(){
        List<Check> checkList = checkMapper.selectAll();
        return checkList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertChe(Check check){
        Integer record = checkMapper.insert(check);
        return record.toString();
    }
}
