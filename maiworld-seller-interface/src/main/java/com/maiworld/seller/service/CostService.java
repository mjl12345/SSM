package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.pojo.TbCost;

import entity.PageResult;

public interface CostService {

	public List<TbCost> findAll();
	
	public PageResult findPage(int pageNum, int pageSize);
	
	public void add(TbCost cost);
	
	public void update(TbCost cost);
	
	public TbCost findOne(Long id);
	
	public void delete(Long[] ids);
	
	public PageResult findPage(TbCost cost , int pageNum, int pageSize);

	//public List<TbCost> studentList(TbCostExample example);

	public PageResult studentList(int pageNum, int pageSize);
	
//	public List<Map> studentList();
	
}
