package com.cmdbms.mapper;

import com.cmdbms.model.Clubappraising;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubappraisingMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubappraising record);


    Clubappraising selectByPrimaryKey(Integer id);


    List<Clubappraising> selectAll();


    int updateByPrimaryKey(Clubappraising record);

    /**
     * Description: 通过学年查询评优记录
     * Author: Edarward
     */
    List<Clubappraising> selByTerm(@Param(value = "term")Integer term);

    /**
     * Description: 通过学年查询修改评优状态
     * Param: 1  开始评优
     *        2  评优审核
     *        3  评优结束
     *        4  发布结果
     * Author: Edarward
     */
    int updateClubApp(@Param(value = "status")Integer status,@Param(value = "year")Integer year);

}