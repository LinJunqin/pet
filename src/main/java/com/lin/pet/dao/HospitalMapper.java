package com.lin.pet.dao;

import com.lin.pet.entity.Hospital;
import com.lin.pet.entity.dto.output.HospitalDetailDTO;
import com.lin.pet.entity.dto.output.HospitalSimpleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author linjunqin
 * @date 2019-05-21
 */
@Mapper
public interface HospitalMapper {
    /** 
     * 根据ID删除
     * @param hospitalId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Long hospitalId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(Hospital record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insertSelective(Hospital record);

    /** 
     * 根据ID查询
     * @param hospitalId 主键ID
     * @return 返回查询的结果
     */
    Hospital selectByPrimaryKey(Long hospitalId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKeySelective(Hospital record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(Hospital record);

    List<HospitalSimpleDTO> selectByKey(@Param("key") String key);

    List<HospitalSimpleDTO> selectByType(@Param("type") Byte type);

    HospitalDetailDTO selectByHospitalId(Long hospitalId);
}