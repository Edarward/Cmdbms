package com.cmdbms.service;

import java.text.ParseException;
import java.util.List;

public interface ClubNumberSer {

    /**
     * Description: 根据学号查询该学生在所有社团的信息
     * Author: Edarward
     */
    List<Object> numberList (Integer studentId) throws ParseException;

    /**
     * Description: 修改学生所在社团或者
     * Author: Edarward
     */
    int updateClubNumber (Integer id,Integer clubId,Integer clubPositionId);

    /**
     * Description: 入社（退社）申请显示
     * Param: appState   0为退社申请   1为入社申请
     * Author: Edarward
     */
    List<Object> applicationList (Integer appState);

    /**
     * Description: 入社（退社）审核
     * Param: appState   0为退社申请   1为入社申请
     * Author: Edarward
     */
    int auditing(Integer appState,Integer Id);

    List<Object> auditingList(Integer studentId) throws ParseException;

    int joinApp(Integer studentId,Integer clubId);

    int exitApp(Integer studentId,Integer clubId);

}
