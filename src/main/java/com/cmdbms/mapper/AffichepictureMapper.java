package com.cmdbms.mapper;

import com.cmdbms.model.Affichepicture;
import java.util.List;

public interface AffichepictureMapper {

    int deleteByPrimaryKey(Integer picId);


    int insert(Affichepicture record);


    Affichepicture selectByPrimaryKey(Integer picId);


    List<Affichepicture> selectAll();


    int updateByPrimaryKey(Affichepicture record);
}