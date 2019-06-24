package com.cmdbms.mapper;

import com.cmdbms.model.Clubmessage;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubmessageMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubmessage record);


    Clubmessage selectByPrimaryKey(Integer id);


    List<Clubmessage> selectAll();


    int updateByPrimaryKey(Clubmessage record);

    /**
     * Description: 返回参加该活动的人数
     * Author: Edarward
     */
    int ActCount(Integer clubActivityId);

    /**
     * Description: 下架留言
     * Author: Edarward
     */
    int clubMessageDown(Integer Id);

    /**
     * Description: 查询留言
     * Author: Edarward
     */
    List<Clubmessage> selClubMessage(Integer clubActivityId);

    /**
     * Description: 某学生参加的活动
     * Author: Edarward
     */
    List<Clubmessage> selClubByStuId(Integer studentId);
}