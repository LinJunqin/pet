package com.lin.pet.dao;

import com.lin.pet.entity.Goods;
import com.lin.pet.entity.dto.output.GoodsDetailDTO;
import com.lin.pet.entity.dto.output.GoodsSampleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface GoodsMapper {
    /** 
     * 根据ID删除
     * @param goodsId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long goodsId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(Goods record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(Goods record);

    /** 
     * 根据ID查询
     * @param goodsId 主键ID
     * @return 返回查询的结果
     */
    Goods selectByPrimaryKey(Long goodsId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(Goods record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(Goods record);

    List<GoodsSampleDTO> selectSampleAll();

    GoodsDetailDTO selectByGoodsId(Long goodsId);

    List<GoodsSampleDTO> selectSampleAllByKey(@Param("key") String key);
}