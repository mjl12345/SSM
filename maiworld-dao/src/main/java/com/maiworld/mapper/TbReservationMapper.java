package com.maiworld.mapper;

import com.maiworld.pojo.TbReservation;
import com.maiworld.pojo.TbReservationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbReservationMapper {
    int countByExample(TbReservationExample example);

    int deleteByExample(TbReservationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbReservation record);

    int insertSelective(TbReservation record);

    List<TbReservation> selectByExample(TbReservationExample example);

    TbReservation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbReservation record, @Param("example") TbReservationExample example);

    int updateByExample(@Param("record") TbReservation record, @Param("example") TbReservationExample example);

    int updateByPrimaryKeySelective(TbReservation record);

    int updateByPrimaryKey(TbReservation record);
    
    List<Map<String, Object>> reservationList(TbReservationExample example);
    
    List<Map<String, Object>> reservationList();
}