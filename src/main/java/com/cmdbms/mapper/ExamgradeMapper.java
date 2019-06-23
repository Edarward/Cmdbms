package com.cmdbms.mapper;

import com.cmdbms.model.Examgrade;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ExamgradeMapper {

    int deleteByPrimaryKey(@Param("id") Integer id);


    int insert(@Param(value = "id")Integer id,
               @Param(value = "gradeStuId")Integer gradeStuId,
               @Param(value = "gradeSubId")Integer gradeSubId,
               @Param(value = "gradeSubName")String gradeSubName,
               @Param(value = "gradeMajor")String gradeMajor,
               @Param(value = "gradeYear")Integer gradeYear);


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


    List<Examgrade> selectstugrade(@Param(value = "gradeStuId")Integer gradeStuId,
                                   @Param(value = "gradeReview")Integer gradeReview);

    //学生管理用
    List<Examgrade> selectgrade(@Param(value = "gradeStuId")Integer gradeStuId,
                                @Param(value = "gradeMajor")String gradeMajor,
                                @Param(value = "gradeYear")Integer gradeYear);
}