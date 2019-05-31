package com.lin.pet.dao;

import com.lin.pet.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface UserMapper {
    /** 
     * 根据ID删除
     * @param userId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long userId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(User record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(User record);

    /** 
     * 根据ID查询
     * @param userId 主键ID
     * @return 返回查询的结果
     */
    User selectByPrimaryKey(Long userId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(User record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(User record);

    User selectByPhone(@Param("phone") String phone);
}