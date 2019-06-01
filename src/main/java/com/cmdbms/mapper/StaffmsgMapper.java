package com.cmdbms.mapper;

import com.cmdbms.model.Staffmsg;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface StaffmsgMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Staffmsg record);

    Staffmsg selectByPrimaryKey(int id);

    List<Staffmsg> selectAll();

    int updateByPrimaryKey(Staffmsg record);

    int selectTeaId(String name);

    String selectNamefromId(int id);
    byte selectGenderfromId(int id);
    String selectIdCardfromId(int id);
    String selectEduBackgroundfromId(int id);
    String selectPhonefromId(int id);
    String selectMailfromId(int id);
    String selectAddressfromId(int id);
    String selectEntryTimefromId(int id);
    String selectPoliticalfromId(int id);
    Integer selectSalaryLevfromId(int id);
    Integer selectBrithday(int id);
    Integer selectId(int id);

}