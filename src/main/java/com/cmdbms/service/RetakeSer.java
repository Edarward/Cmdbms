package com.cmdbms.service;

import com.cmdbms.model.Examretake;

import java.util.List;

public interface RetakeSer {
    String insertRetake(Examretake examretake);

    String updateRetake(Examretake examretake);

    List selectRetake(Integer exuseThrough);
}
