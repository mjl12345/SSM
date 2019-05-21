package com.maiworld.mapper;

import com.maiworld.pojo.TbReleaseNews;
import com.maiworld.pojo.TbReleaseNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReleaseNewsMapper {
    int countByExample(TbReleaseNewsExample example);

    int deleteByExample(TbReleaseNewsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbReleaseNews record);

    int insertSelective(TbReleaseNews record);

    List<TbReleaseNews> selectByExample(TbReleaseNewsExample example);

    TbReleaseNews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbReleaseNews record, @Param("example") TbReleaseNewsExample example);

    int updateByExample(@Param("record") TbReleaseNews record, @Param("example") TbReleaseNewsExample example);

    int updateByPrimaryKeySelective(TbReleaseNews record);

    int updateByPrimaryKey(TbReleaseNews record);
}