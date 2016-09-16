package io.github.miaoxinguo.sbs.dao;

import io.github.miaoxinguo.sbs.entity.Account;
import java.util.List;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated 2016-09-16 19:10:01
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated 2016-09-16 19:10:01
     */
    Account selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated 2016-09-16 19:10:01
     */
    List<Account> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated 2016-09-16 19:10:01
     */
    int updateByPrimaryKey(Account record);
}