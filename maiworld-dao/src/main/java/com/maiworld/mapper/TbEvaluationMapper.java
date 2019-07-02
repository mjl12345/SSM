package com.maiworld.mapper;

import com.maiworld.pojo.TbEvaluation;
import com.maiworld.pojo.TbEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEvaluationMapper {
    int countByExample(TbEvaluationExample example);

    int deleteByExample(TbEvaluationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbEvaluation record);

    int insertSelective(TbEvaluation record);

    List<TbEvaluation> selectByExample(TbEvaluationExample example);

    TbEvaluation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbEvaluation record, @Param("example") TbEvaluationExample example);

    int updateByExample(@Param("record") TbEvaluation record, @Param("example") TbEvaluationExample example);

    int updateByPrimaryKeySelective(TbEvaluation record);

    int updateByPrimaryKey(TbEvaluation record);
    
    List<TbEvaluation> evaluationList();
}