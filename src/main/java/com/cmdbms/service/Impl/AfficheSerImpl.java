package com.cmdbms.service.Impl;

import com.cmdbms.mapper.AffichenoticeMapper;
import com.cmdbms.model.Affichenotice;
import com.cmdbms.service.AfficheSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AfficheSerImpl implements AfficheSer {
    @Autowired
    private AffichenoticeMapper affichenoticeMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Affichenotice> selectNotice(Integer notStatetype){
        List<Affichenotice> affichenoticeList = affichenoticeMapper.selectByPrimaryKey(notStatetype);
        return affichenoticeList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertNotice(Affichenotice affichenotice){
        Integer record = affichenoticeMapper.insert(affichenotice);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateNotice(Integer notId, String notType, String notContent,String notWriter, String notReleaser, Integer notState, Integer notStatetype){

        switch (notState){
            case 1:
                notStatetype = 1;
                break;
            case 2:
                notStatetype = 1;
                break;
            case 3:
                notStatetype = 2;
                break;
            case 4:
                notStatetype = 3;
                break;
            case 5:
                notStatetype = 3;
                break;
             default:
                 break;

        }
        Integer record = affichenoticeMapper.updateByPrimaryKey(notId,notType,notContent,notWriter,notReleaser,notState,notStatetype);
        return record.toString();
    }
}
