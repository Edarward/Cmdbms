package com.cmdbms.service;

import java.util.List;

public interface ArrangeCourseSer {
    int insertOne(Argcoure course);

    List selectOne();

    int updateOne(Argcoure course);

    int deleteOne(int id);
}
