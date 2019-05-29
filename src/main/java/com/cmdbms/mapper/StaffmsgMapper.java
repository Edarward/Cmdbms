package com.cmdbms.mapper;

import com.cmdbms.model.Staffmsg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffmsgMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Staffmsg record);

    Staffmsg selectByPrimaryKey(Integer id);

    List<Staffmsg> selectAll();

    int updateByPrimaryKey(Staffmsg record);

    int selectTeaId(String name);

    String selectNamefromId(int id);

}