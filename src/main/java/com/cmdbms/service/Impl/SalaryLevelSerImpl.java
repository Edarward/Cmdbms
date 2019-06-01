package com.cmdbms.service.Impl;

import com.cmdbms.mapper.StaffsalaryMapper;
import com.cmdbms.model.Staffsalary;
import com.cmdbms.service.SalaryLevelSer;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryLevelSerImpl implements SalaryLevelSer {

    @Autowired
    private StaffsalaryMapper staffsalaryMapper;

    public int insertOne(Staffsalary staffsalary){

        return staffsalaryMapper.insert(staffsalary);
    }

    public int updateOne(Staffsalary staffsalary){

        return staffsalaryMapper.updateByPrimaryKey(staffsalary);
    }

    public List selectOne(){
        return staffsalaryMapper.selectAll();
    }

    public int deleteOne(int id){

        return staffsalaryMapper.deleteByPrimaryKey(id);
    }

}
