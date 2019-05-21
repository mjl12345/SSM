package com.maiworld.mapper;

import com.maiworld.pojo.TbNews;
import com.maiworld.pojo.TbNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNewsMapper {
    int countByExample(TbNewsExample example);

    int deleteByExample(TbNewsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbNews record);

    int insertSelective(TbNews record);

    List<TbNews> selectByExampleWithBLOBs(TbNewsExample example);

    List<TbNews> selectByExample(TbNewsExample example);

    TbNews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByExample(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByPrimaryKeySelective(TbNews record);

    int updateByPrimaryKeyWithBLOBs(TbNews record);

    int updateByPrimaryKey(TbNews record);
}