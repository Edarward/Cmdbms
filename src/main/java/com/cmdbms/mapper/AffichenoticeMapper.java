package com.cmdbms.mapper;

import com.cmdbms.model.Affichenotice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AffichenoticeMapper {

    int deleteByPrimaryKey(Integer notId);


    int insert(Affichenotice record);


    List<Affichenotice> selectByPrimaryKey(Integer notStatetype);


    List<Affichenotice> selectNoticetwo(@Param(value = "notWriter")String  notWriter,
                                        @Param(value = "notStatetype")Integer notStatetype);


    List<Affichenotice> selectAll();


    int updateByPrimaryKey(@Param(value = "notId")Integer notId,
                           @Param(value = "notType")String notType,
                           @Param(value = "notContent") String notContent,
                           @Param(value = "notWriter") String notWriter,
                           @Param(value = "notReleaser")String notReleaser,
                           @Param(value = "notState")Integer notState,
                           @Param(value = "notStatetype")Integer notStatetype);
}