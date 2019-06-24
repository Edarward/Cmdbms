package com.cmdbms.service;

import com.cmdbms.model.Choocheck;
import com.cmdbms.model.Quitcheck;
import com.cmdbms.model.Quitcoure;

import java.text.ParseException;
import java.util.List;

public interface QuitChooseSer {

    int insertOne(Quitcoure quitcoure);

    List selectOne();


    int deleteOne(int id);

    int checkQuitInfo(Quitcheck quitcheck);


    List selectChoCheckInfo(int stuId) throws ParseException;
}
