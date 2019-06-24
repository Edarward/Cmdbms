package com.cmdbms.service.Impl;

import com.cmdbms.mapper.AffichenoticeMapper;
import com.cmdbms.mapper.AfficheusercommentMapper;
import com.cmdbms.model.Affichenotice;
import com.cmdbms.model.Afficheusercomment;
import com.cmdbms.service.AfficheSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AfficheSerImpl implements AfficheSer {
    @Autowired
    private AffichenoticeMapper affichenoticeMapper;

    @Autowired
    private AfficheusercommentMapper afficheusercommentMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Affichenotice> selectNotice(Integer notStatetype){
        List<Affichenotice> affichenoticeList = affichenoticeMapper.selectByPrimaryKey(notStatetype);
        return affichenoticeList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Affichenotice> selectNoticetwo(String  notWriter){
        Integer notStatetype = 1;
        List<Affichenotice> affichenoticeList = affichenoticeMapper.selectNoticetwo(notWriter,notStatetype);
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
            case 1://保存
                notStatetype = 1;
                break;
            case 2://审核未通过
                notStatetype = 1;
                break;
            case 3://未审核
                notStatetype = 2;
                break;
            case 4://未发布
                notStatetype = 3;
                break;
            case 5://发布
                notStatetype = 4;
                break;
             default:
                 break;

        }
        Integer record = affichenoticeMapper.updateByPrimaryKey(notId,notType,notContent,notWriter,notReleaser,notState,notStatetype);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteNotice(Integer notId){
        Integer record = affichenoticeMapper.deleteByPrimaryKey(notId);
        return record;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertCom(Integer userComId,Integer notId,Integer userId,String userComCon){
        Integer record = afficheusercommentMapper.insert(userComId,notId,userId,userComCon);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteCom(Integer notId){
        Integer record = afficheusercommentMapper.deleteByPrimaryKey(notId);
        return record;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Afficheusercomment> selectCom(Integer notId){
        List<Afficheusercomment> afficheusercommentList = afficheusercommentMapper.selectByPrimaryKey(notId);
        return afficheusercommentList;
    }
}
