package com.cmdbms.service;

import com.cmdbms.model.Examretake;

import java.util.List;

public interface RetakeSer {
    String insertRetake(Examretake examretake);

    String updateRetake(Examretake examretake);

    String deleteRetake(Integer id);

    List selectRetake(Integer exuseThrough);

    List selectRetaketwo(Integer exuseStuId);
}
