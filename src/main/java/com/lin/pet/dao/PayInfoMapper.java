package com.lin.pet.dao;

import com.lin.pet.entity.PayInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface PayInfoMapper {
    /** 
     * 根据ID删除
     * @param payInfoId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long payInfoId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(PayInfo record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(PayInfo record);

    /** 
     * 根据ID查询
     * @param payInfoId 主键ID
     * @return 返回查询的结果
     */
    PayInfo selectByPrimaryKey(Long payInfoId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(PayInfo record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(PayInfo record);
}