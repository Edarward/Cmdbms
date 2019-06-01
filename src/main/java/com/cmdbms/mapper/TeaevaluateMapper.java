package com.cmdbms.mapper;

import com.cmdbms.model.Teaevaluate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeaevaluateMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Teaevaluate record);

    Teaevaluate selectByPrimaryKey(Integer id);

    String selTeaNameById(int id);

    List<Teaevaluate> selectAllById(int teacherId);

    List<Teaevaluate> selectAll();

    int updateByPrimaryKey(Teaevaluate record);

    int deleteByTeaId(int teaId);
}