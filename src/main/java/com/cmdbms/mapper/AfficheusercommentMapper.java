package com.cmdbms.mapper;

import com.cmdbms.model.Afficheusercomment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AfficheusercommentMapper {

    int deleteByPrimaryKey(Integer userComId);


    int insert(@Param(value = "userComId")Integer userComId,
               @Param(value = "notId")Integer notId,
               @Param(value = "userId")Integer userId,
               @Param(value = "userComCon")String userComCon);


    List<Afficheusercomment> selectByPrimaryKey(Integer userComId);


    List<Afficheusercomment> selectAll();


    int updateByPrimaryKey(Afficheusercomment record);
}