package com.maiworld.mapper;

import com.maiworld.pojo.TbGround;
import com.maiworld.pojo.TbGroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGroundMapper {
    int countByExample(TbGroundExample example);

    int deleteByExample(TbGroundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGround record);

    int insertSelective(TbGround record);

    List<TbGround> selectByExample(TbGroundExample example);

    TbGround selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbGround record, @Param("example") TbGroundExample example);

    int updateByExample(@Param("record") TbGround record, @Param("example") TbGroundExample example);

    int updateByPrimaryKeySelective(TbGround record);

    int updateByPrimaryKey(TbGround record);
}