package com.cmdbms.mapper;

import com.cmdbms.model.Affichepicture;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AffichepictureMapper {

    int deleteByPrimaryKey(Integer picId);


    int insert(Affichepicture record);


    Affichepicture selectByPrimaryKey(Integer picId);


    List<Affichepicture> selectAll();


    int updateByPrimaryKey(Affichepicture record);
}