package com.lin.pet.dao;

import com.lin.pet.entity.Order;
import com.lin.pet.entity.dto.output.OrderDetailDTO;
import com.lin.pet.entity.dto.output.OrderSampleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface OrderMapper {
    /** 
     * 根据ID删除
     * @param orderId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long orderId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(Order record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(Order record);

    /** 
     * 根据ID查询
     * @param orderId 主键ID
     * @return 返回查询的结果
     */
    Order selectByPrimaryKey(Long orderId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(Order record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(Order record);

    List<OrderSampleDTO> selectByUserId(Long userId);

    OrderDetailDTO selectByOrderId(Long orderId);
}