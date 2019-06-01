package com.cmdbms.service;

import com.cmdbms.model.Staffmsg;

import java.util.List;

public interface StaffMsgSer {

    int insertOne(Staffmsg staffmsg);

    int updateOne(Staffmsg staffmsg);

    List selectOne();

    List selectInfoSelf(int id);

    int deleteOne(int id);


}
