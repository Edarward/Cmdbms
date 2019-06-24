package com.cmdbms.service;

import java.text.ParseException;
import java.util.List;

public interface ClubManagerSer {

    /**
     * Description: 显示全部社团名称
     * Author: Edarward
     */
    List<Object> clubNameList(Integer clubStatus);

    /**
     * Description: 显示全部社团信息
     * Author: Edarward
     */
    List<Object> clubmanagerList(Integer clubStatus) throws ParseException;

    int clubStatus(Integer id,Integer clubStatus);

    /**
     * Description: 入社申请
     * Author: Edarward
     */
    int ClubCreateApp(String name,Integer number,Integer studentId);

    /**
     * Description: 退社申请
     * Author: Edarward
     */
    int clubDismissApp(Integer id,Integer studentId) throws Exception;
}
