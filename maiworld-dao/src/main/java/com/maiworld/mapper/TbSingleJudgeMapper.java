package com.maiworld.mapper;

import com.maiworld.pojo.TbSingleJudge;
import com.maiworld.pojo.TbSingleJudgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSingleJudgeMapper {
    int countByExample(TbSingleJudgeExample example);

    int deleteByExample(TbSingleJudgeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSingleJudge record);

    int insertSelective(TbSingleJudge record);

    List<TbSingleJudge> selectByExample(TbSingleJudgeExample example);

    TbSingleJudge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSingleJudge record, @Param("example") TbSingleJudgeExample example);

    int updateByExample(@Param("record") TbSingleJudge record, @Param("example") TbSingleJudgeExample example);

    int updateByPrimaryKeySelective(TbSingleJudge record);

    int updateByPrimaryKey(TbSingleJudge record);
}