package com.cmdbms.mapper;

import com.cmdbms.model.Examgrade;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ExamgradeMapper {

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("gradeStuId") Integer gradeStuId);


    int insert(@Param(value = "id")Integer id,
               @Param(value = "gradeStuId")Integer gradeStuId,
               @Param(value = "gradeSubId")Integer gradeSubId,
               @Param(value = "gradeSubName")String gradeSubName);


    Examgrade selectByPrimaryKey(@Param("id") Integer id, @Param("gradeStuId") Integer gradeStuId);


    List<Examgrade> selectAll();


    int updateByPrimaryKey(@Param(value = "id")Integer id,
                           @Param(value = "gradeStuId")Integer gradeStuId,
                           @Param(value = "gradeStu")Integer gradeStu,
                           @Param(value = "gradeLimit") Date gradeLimit,
                           @Param(value = "gradeJudge")Integer gradeJudge,
                           @Param(value = "gradeViolate")Integer gradeViolate,
                           @Param(value = "gradeReview")Integer gradeReview);

    List<Integer> selectgradeSub(@Param(value = "id")Integer id,
                                @Param(value = "gradeStuId")Integer gradeStuId);

    List<String> selectgradeSubName(@Param(value = "id")Integer id,
                                    @Param(value = "gradeStuId")Integer gradeStuId);
}