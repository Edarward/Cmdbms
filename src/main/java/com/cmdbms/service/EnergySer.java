package com.cmdbms.service;

import com.cmdbms.model.Water;

public interface EnergySer {
    String insertOne(Water water);
    int delwater(Integer id);
    String updatewater(Water water);
}
