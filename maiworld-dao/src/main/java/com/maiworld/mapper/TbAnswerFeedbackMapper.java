package com.maiworld.mapper;

import com.maiworld.pojo.TbAnswerFeedback;
import com.maiworld.pojo.TbAnswerFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAnswerFeedbackMapper {
    int countByExample(TbAnswerFeedbackExample example);

    int deleteByExample(TbAnswerFeedbackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbAnswerFeedback record);

    int insertSelective(TbAnswerFeedback record);

    List<TbAnswerFeedback> selectByExample(TbAnswerFeedbackExample example);

    TbAnswerFeedback selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbAnswerFeedback record, @Param("example") TbAnswerFeedbackExample example);

    int updateByExample(@Param("record") TbAnswerFeedback record, @Param("example") TbAnswerFeedbackExample example);

    int updateByPrimaryKeySelective(TbAnswerFeedback record);

    int updateByPrimaryKey(TbAnswerFeedback record);
}