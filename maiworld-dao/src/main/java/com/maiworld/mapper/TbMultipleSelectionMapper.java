package com.maiworld.mapper;

import com.maiworld.pojo.TbMultipleSelection;
import com.maiworld.pojo.TbMultipleSelectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMultipleSelectionMapper {
    int countByExample(TbMultipleSelectionExample example);

    int deleteByExample(TbMultipleSelectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbMultipleSelection record);

    int insertSelective(TbMultipleSelection record);

    List<TbMultipleSelection> selectByExample(TbMultipleSelectionExample example);

    TbMultipleSelection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMultipleSelection record, @Param("example") TbMultipleSelectionExample example);

    int updateByExample(@Param("record") TbMultipleSelection record, @Param("example") TbMultipleSelectionExample example);

    int updateByPrimaryKeySelective(TbMultipleSelection record);

    int updateByPrimaryKey(TbMultipleSelection record);
}