package com.lin.pet.dao;

import com.lin.pet.entity.Preorder;
import com.lin.pet.entity.dto.output.PreorderSampleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface PreorderMapper {
    /** 
     * 根据ID删除
     * @param preorderId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long preorderId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(Preorder record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(Preorder record);

    /** 
     * 根据ID查询
     * @param preorderId 主键ID
     * @return 返回查询的结果
     */
    Preorder selectByPrimaryKey(Long preorderId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(Preorder record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(Preorder record);

    List<PreorderSampleDTO> selectDetailByUserId(Long userId);
}