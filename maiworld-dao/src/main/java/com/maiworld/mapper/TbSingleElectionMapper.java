package com.maiworld.mapper;

import com.maiworld.pojo.TbSingleElection;
import com.maiworld.pojo.TbSingleElectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSingleElectionMapper {
    int countByExample(TbSingleElectionExample example);

    int deleteByExample(TbSingleElectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSingleElection record);

    int insertSelective(TbSingleElection record);

    List<TbSingleElection> selectByExample(TbSingleElectionExample example);

    TbSingleElection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSingleElection record, @Param("example") TbSingleElectionExample example);

    int updateByExample(@Param("record") TbSingleElection record, @Param("example") TbSingleElectionExample example);

    int updateByPrimaryKeySelective(TbSingleElection record);

    int updateByPrimaryKey(TbSingleElection record);
}