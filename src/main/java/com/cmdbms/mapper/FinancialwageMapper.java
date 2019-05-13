package com.cmdbms.mapper;

import com.cmdbms.model.Financialwage;
import java.util.List;

public interface FinancialwageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_wage
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int deleteByPrimaryKey(Integer teaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_wage
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int insert(Financialwage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_wage
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    Financialwage selectByPrimaryKey(Integer teaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_wage
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    List<Financialwage> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_wage
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int updateByPrimaryKey(Financialwage record);
}