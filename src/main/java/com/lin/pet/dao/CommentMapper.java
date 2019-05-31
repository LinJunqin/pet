package com.lin.pet.dao;

import com.lin.pet.entity.Comment;
import com.lin.pet.entity.dto.output.CommentDTO;
import com.lin.pet.entity.dto.output.ProjectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface CommentMapper {
    /** 
     * 根据ID删除
     * @param commentId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long commentId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(Comment record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(Comment record);

    /** 
     * 根据ID查询
     * @param commentId 主键ID
     * @return 返回查询的结果
     */
    Comment selectByPrimaryKey(Long commentId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(Comment record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(Comment record);

    Double selectByHospitalId(Long hospitalId);

    List<CommentDTO> selectDetailByHospitalId(Long hospitalId);
}