package com.cmdbms.mapper;

import com.cmdbms.model.Afficheusercomment;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AfficheusercommentMapper {

    int deleteByPrimaryKey(Integer userComId);


    int insert(Afficheusercomment record);


    Afficheusercomment selectByPrimaryKey(Integer userComId);


    List<Afficheusercomment> selectAll();


    int updateByPrimaryKey(Afficheusercomment record);
}