package com.maiworld.mapper;

import com.maiworld.pojo.TbCost;
import com.maiworld.pojo.TbCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCostMapper {
    int countByExample(TbCostExample example);

    int deleteByExample(TbCostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCost record);

    int insertSelective(TbCost record);

    List<TbCost> selectByExample(TbCostExample example);

    TbCost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCost record, @Param("example") TbCostExample example);

    int updateByExample(@Param("record") TbCost record, @Param("example") TbCostExample example);

    int updateByPrimaryKeySelective(TbCost record);

    int updateByPrimaryKey(TbCost record);
}