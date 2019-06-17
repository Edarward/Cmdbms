package com.cmdbms.service;

import java.util.List;

public interface ClubManagerSer {

    /**
     * Description: 显示全部社团名称
     * Author: Edarward
     * Date: 2019/6/17
     */
    List<Object> clubNameList(Integer clubStatus);
}
