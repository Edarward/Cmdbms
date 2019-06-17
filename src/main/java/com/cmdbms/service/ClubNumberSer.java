package com.cmdbms.service;

import java.text.ParseException;
import java.util.List;

public interface ClubNumberSer {

    /**
     * Description: 根据学号查询该学生在所有社团的信息
     * Author: Edarward
     * Date: 2019/6/13
     */
    List<Object> numberList (Integer studentId) throws ParseException;

    /**
     * Description: 修改学生所在社团或者
     * Author: Edarward
     * Date: 2019/6/13
     */
    int updateClubNumber (Integer id,Integer clubId,Integer clubPositionId);
}
