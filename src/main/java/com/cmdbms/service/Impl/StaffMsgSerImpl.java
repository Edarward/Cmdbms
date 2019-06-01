package com.cmdbms.service.Impl;

import com.cmdbms.mapper.StaffmsgMapper;
import com.cmdbms.mapper.StaffsalaryMapper;
import com.cmdbms.mapper.TeaevaluateMapper;
import com.cmdbms.mapper.TraininginfoMapper;
import com.cmdbms.model.Staffmsg;
import com.cmdbms.model.Teaevaluate;
import com.cmdbms.model.Traininginfo;
import com.cmdbms.service.StaffMsgSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.sql.Timestamp;


@Service
public class StaffMsgSerImpl implements StaffMsgSer {

    @Autowired
    private StaffmsgMapper staffmsgMapper;

    @Autowired
    private TeaevaluateMapper teaevaluateMapper;

    @Autowired
    private TraininginfoMapper traininginfoMapper;

    @Autowired
    private StaffsalaryMapper staffsalaryMapper;

    public int insertOne(Staffmsg staffmsg){
        int id = staffmsg.getId();

        staffmsgMapper.insert(staffmsg);
        System.out.println("1111");
        //插入默认的评价
        Teaevaluate teaevaluate = new Teaevaluate();
        teaevaluate.setTeacherId(id);
        System.out.println(id);
        teaevaluate.setEvaluateLevel("B");
        if(teaevaluateMapper.insert(teaevaluate)!=0)
            System.out.println("新员工入职考评添加成功");
        else
            System.out.println("新员工入职考评添加失败");
        System.out.println("222222");
        //默认的入职培训
        Traininginfo traininginfo = new Traininginfo();
        traininginfo.setStaffId(id);
        traininginfo.setTraingInfo("入职培训");

        return traininginfoMapper.insert(traininginfo);
    }

    public int updateOne(Staffmsg staffmsg){
        int id = staffmsg.getId();
        System.out.println(id);
        Staffmsg updateRecord =selectStaffById(id);
        System.out.println("dsadasd");
        if (staffmsg.getAddress() == null)
            staffmsg.setAddress(updateRecord.getAddress());
        if(staffmsg.getSalaryLevel()==null)
            staffmsg.setSalaryLevel(updateRecord.getSalaryLevel());
        if(staffmsg.getBirthday()==null)
            staffmsg.setBirthday(updateRecord.getBirthday());
        if (staffmsg.getEduBackground() == null)
            staffmsg.setEduBackground(updateRecord.getEduBackground());
//        if (staffmsg.getEntryTime()==null)
//            staffmsg.setEntryTime(updateRecord.getEntryTime());
        if(staffmsg.getGender()==null)
            staffmsg.setGender(updateRecord.getGender());
        if(staffmsg.getIdCard()==null)
            staffmsg.setIdCard(updateRecord.getIdCard());
        if(staffmsg.getMail()==null)
            staffmsg.setMail(updateRecord.getMail());
        if (staffmsg.getPhone()==null)
            staffmsg.setPhone(updateRecord.getPhone());
        if (staffmsg.getPoliticalStatus()==null)
            staffmsg.setPoliticalStatus(updateRecord.getPoliticalStatus());
        return  staffmsgMapper.updateByPrimaryKey(staffmsg);
    }

    public List selectOne(){
        List resList = new ArrayList();
        for (int i =0;i<50;i++)
            if (staffmsgMapper.selectId(i)!=null) {
                selectById(i);
                resList.add(this.selectByIdguan(i));
            }
        return resList;
    }

    public List selectInfoSelf(int id){
        List reslist = new ArrayList();
        reslist.add(selectById(id));
        return reslist;
    }

    public int deleteOne(int id){
        teaevaluateMapper.deleteByTeaId(id);
        staffmsgMapper.deleteByPrimaryKey(id);
        return 0;
    }

    public int checkQuitInfo(Staffmsg staffmsg){
        return 0;
    }

    public Map selectById(int id){
        System.out.println("sdasasd");
        Map resMap = new HashMap();
        resMap.put("id", id);
        resMap.put("name",staffmsgMapper.selectNamefromId( id));
        System.out.println(staffmsgMapper.selectNamefromId( id));
        resMap.put("gender",staffmsgMapper.selectGenderfromId( id));
        resMap.put("birthday",staffmsgMapper.selectBrithday( id));
        resMap.put("idCard",staffmsgMapper.selectIdCardfromId( id));
        resMap.put("eduBackground",staffmsgMapper.selectEduBackgroundfromId( id));
        resMap.put("phone",staffmsgMapper.selectPhonefromId( id));
        resMap.put("mail",staffmsgMapper.selectMailfromId( id));
        resMap.put("address",staffmsgMapper.selectAddressfromId( id));
        resMap.put("entryTime",staffmsgMapper.selectEntryTimefromId(id));
        resMap.put("politicalStatus",staffmsgMapper.selectPoliticalfromId( id));
        resMap.put("salaryLevel",staffmsgMapper.selectSalaryLevfromId( id));
        String salaryAmount = staffsalaryMapper.selectAmountById(staffmsgMapper.selectSalaryLevfromId( id));
        resMap.put("salaryAmount",salaryAmount);
        System.out.println(staffmsgMapper.selectSalaryLevfromId( id));
        return resMap;
    }

    public Map selectByIdguan(int id){
        System.out.println("sdasasd");
        Map resMap = new HashMap();
        resMap.put("id", id);
        resMap.put("name",staffmsgMapper.selectNamefromId( id));
        resMap.put("gender",staffmsgMapper.selectGenderfromId( id));
        resMap.put("phone",staffmsgMapper.selectPhonefromId( id));
        resMap.put("politicalStatus",staffmsgMapper.selectPoliticalfromId( id));
        resMap.put("salaryLevel",staffmsgMapper.selectSalaryLevfromId( id));
        System.out.println("dasdasda");

        String salaryAmount = staffsalaryMapper.selectAmountById(staffmsgMapper.selectSalaryLevfromId( id));
        resMap.put("salaryAmount",salaryAmount);

        return resMap;
    }

    public Staffmsg selectStaffById(int id){
        Staffmsg resStaff = new Staffmsg();
        resStaff.setId(id);
        resStaff.setName(staffmsgMapper.selectNamefromId( id));
        resStaff.setIdCard(staffmsgMapper.selectIdCardfromId( id));
        resStaff.setGender(staffmsgMapper.selectGenderfromId(id));
        resStaff.setEduBackground(staffmsgMapper.selectEduBackgroundfromId( id));
        resStaff.setPhone(staffmsgMapper.selectPhonefromId( id));
        resStaff.setMail(staffmsgMapper.selectMailfromId( id));
        resStaff.setBirthday(staffmsgMapper.selectBrithday( id));
        resStaff.setAddress(staffmsgMapper.selectAddressfromId( id));
        resStaff.setPoliticalStatus(staffmsgMapper.selectPoliticalfromId( id));
        resStaff.setSalaryLevel(staffmsgMapper.selectSalaryLevfromId( id));
        return resStaff;
    }


}
