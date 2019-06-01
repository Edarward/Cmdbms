package com.cmdbms.service;

import com.cmdbms.model.Affichenotice;

import java.util.List;

public interface AfficheSer {
    List selectNotice(Integer notStatetype);

    String insertNotice(Affichenotice affichenotice);

    String updateNotice(Integer notId, String notType, String notWriter, String notReleaser, Integer notState, Integer notStatetype);
}
