package com.maiworld.mapper;

import com.maiworld.pojo.TbCorrectTable;
import com.maiworld.pojo.TbCorrectTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCorrectTableMapper {
    int countByExample(TbCorrectTableExample example);

    int deleteByExample(TbCorrectTableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCorrectTable record);

    int insertSelective(TbCorrectTable record);

    List<TbCorrectTable> selectByExample(TbCorrectTableExample example);

    TbCorrectTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCorrectTable record, @Param("example") TbCorrectTableExample example);

    int updateByExample(@Param("record") TbCorrectTable record, @Param("example") TbCorrectTableExample example);

    int updateByPrimaryKeySelective(TbCorrectTable record);

    int updateByPrimaryKey(TbCorrectTable record);
}