package com.cmdbms.mapper;

import com.cmdbms.model.Quitcheck;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface QuitcheckMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Quitcheck record);


    Quitcheck selectByPrimaryKey(Integer id);


    List<Quitcheck> selectAll();


    int updateByPrimaryKey(Quitcheck record);

    Timestamp selApplTimeByClaIdAndStuId(int classId,int studentId);

    int selQuitCourIdByClaIdAndStuId(int classId,int studentId);
}