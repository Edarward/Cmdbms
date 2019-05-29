package com.cmdbms.service;


import com.cmdbms.model.Teaarghis;
import com.cmdbms.model.Teaarrange;

import java.util.List;

public interface TeaArgHisSer {

    int insertTeaHis(Teaarghis teaarghis);

    List selectOne();

    int updateOne(Teaarghis teaarghis);

    int deleteOne(int id);
}
