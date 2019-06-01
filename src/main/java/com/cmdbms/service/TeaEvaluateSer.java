package com.cmdbms.service;

import com.cmdbms.model.Teaevaluate;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeaEvaluateSer {

    List selectOne();

    List selectOneSelf(int staffId);

    int updateOne(Teaevaluate teaevaluate);

    int deleteOne(int id);

    int insertOne(Teaevaluate teaevaluate);

}
