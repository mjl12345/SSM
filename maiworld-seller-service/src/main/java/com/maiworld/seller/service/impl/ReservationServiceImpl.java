package com.maiworld.seller.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.mapper.TbReservationMapper;
import com.maiworld.pojo.TbReservation;
import com.maiworld.pojo.TbReservationExample;
import com.maiworld.pojo.TbReservationExample.Criteria;
import com.maiworld.seller.service.ReservationService;

import entity.PageResult;
@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private TbReservationMapper tbReservationMapper;
	
	
	@Override
	public List<TbReservation> findAll() {
		
		return tbReservationMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbReservation> page = (Page<TbReservation>) tbReservationMapper.selectByExample(null);
		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbReservation reservation) {
		tbReservationMapper.insert(reservation);

	}

	@Override
	public void update(TbReservation reservation) {
		tbReservationMapper.updateByPrimaryKey(reservation);

	}

	@Override
	public TbReservation findOne(Long id) {
		return tbReservationMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			tbReservationMapper.deleteByPrimaryKey(id);
		}
		
	}

	@Override
	public PageResult findPage(TbReservation reservation, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		TbReservationExample example = new TbReservationExample();
		Criteria create = example.createCriteria();
		if(reservation!=null){
			if(reservation.getCheckStatus()!=null && reservation.getCheckStatus().length()>0){
				create.andCheckStatusLike("%"+reservation.getCheckStatus()+"%");
			}if(reservation.getStatus()!=null && reservation.getStatus().length()>0){
				create.andStatusLike("%"+reservation.getStatus()+"%");
			}
		}
		Page<TbReservation> page = (Page<TbReservation>) tbReservationMapper.selectByExample(example);
		return new  PageResult( page.getTotal(), page.getResult());
	}

	@Override
	public PageResult selectList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
			List<Map<String, Object>> selectList = tbReservationMapper.selectList();
			//System.out.print("=============="+selectList);
			Page<Map<String, Object>> page = (Page<Map<String, Object>>) selectList;			
		return new PageResult(page.getTotal(), page.getResult());
	}

}
