package com.cmdbms.mapper;

import com.cmdbms.model.Examstuarrange;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamstuarrangeMapper {

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("stuexamStuId") Integer stuexamStuId);


    int insert(Examstuarrange record);


    Examstuarrange selectByPrimaryKey(@Param("id") Integer id, @Param("stuexamStuId") Integer stuexamStuId);


    List<Examstuarrange> selectAll();


    int updateByPrimaryKey(Examstuarrange record);
}