package com.maiworld.mapper;

import com.maiworld.pojo.TbIncorrectTable;
import com.maiworld.pojo.TbIncorrectTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbIncorrectTableMapper {
    int countByExample(TbIncorrectTableExample example);

    int deleteByExample(TbIncorrectTableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbIncorrectTable record);

    int insertSelective(TbIncorrectTable record);

    List<TbIncorrectTable> selectByExample(TbIncorrectTableExample example);

    TbIncorrectTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbIncorrectTable record, @Param("example") TbIncorrectTableExample example);

    int updateByExample(@Param("record") TbIncorrectTable record, @Param("example") TbIncorrectTableExample example);

    int updateByPrimaryKeySelective(TbIncorrectTable record);

    int updateByPrimaryKey(TbIncorrectTable record);
}