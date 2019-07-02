package com.maiworld.mapper;

import com.maiworld.pojo.TbCoach;
import com.maiworld.pojo.TbCoachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCoachMapper {
    int countByExample(TbCoachExample example);

    int deleteByExample(TbCoachExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(TbCoach record);

    int insertSelective(TbCoach record);

    List<TbCoach> selectByExample(TbCoachExample example);

    TbCoach selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") TbCoach record, @Param("example") TbCoachExample example);

    int updateByExample(@Param("record") TbCoach record, @Param("example") TbCoachExample example);

    int updateByPrimaryKeySelective(TbCoach record);

    int updateByPrimaryKey(TbCoach record);
    
    TbCoach selectByOpenid(String id);
}