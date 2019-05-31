package com.lin.pet.dao;

import com.lin.pet.entity.Reply;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface ReplyMapper {
    /** 
     * 根据ID删除
     * @param replyId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long replyId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(Reply record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(Reply record);

    /** 
     * 根据ID查询
     * @param replyId 主键ID
     * @return 返回查询的结果
     */
    Reply selectByPrimaryKey(Long replyId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(Reply record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(Reply record);
}