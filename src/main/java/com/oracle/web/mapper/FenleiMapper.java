package com.oracle.web.mapper;

import com.oracle.web.bean.Fenlei;
import java.util.List;

public interface FenleiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Tue May 07 17:10:48 CST 2019
     */
    int deleteByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Tue May 07 17:10:48 CST 2019
     */
    int insert(Fenlei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Tue May 07 17:10:48 CST 2019
     */
    Fenlei selectByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Tue May 07 17:10:48 CST 2019
     */
    List<Fenlei> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Tue May 07 17:10:48 CST 2019
     */
    int updateByPrimaryKey(Fenlei record);
}