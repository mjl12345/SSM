package com.maiworld.mapper;

import com.maiworld.pojo.TbSealSchool;
import com.maiworld.pojo.TbSealSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSealSchoolMapper {
    int countByExample(TbSealSchoolExample example);

    int deleteByExample(TbSealSchoolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSealSchool record);

    int insertSelective(TbSealSchool record);

    List<TbSealSchool> selectByExample(TbSealSchoolExample example);

    TbSealSchool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSealSchool record, @Param("example") TbSealSchoolExample example);

    int updateByExample(@Param("record") TbSealSchool record, @Param("example") TbSealSchoolExample example);

    int updateByPrimaryKeySelective(TbSealSchool record);

    int updateByPrimaryKey(TbSealSchool record);
}