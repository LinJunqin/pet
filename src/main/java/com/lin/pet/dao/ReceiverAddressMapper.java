package com.lin.pet.dao;

import com.lin.pet.entity.ReceiverAddress;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface ReceiverAddressMapper {
    /** 
     * 根据ID删除
     * @param receiverAddressId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long receiverAddressId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(ReceiverAddress record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(ReceiverAddress record);

    /** 
     * 根据ID查询
     * @param receiverAddressId 主键ID
     * @return 返回查询的结果
     */
    ReceiverAddress selectByPrimaryKey(Long receiverAddressId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(ReceiverAddress record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(ReceiverAddress record);
}