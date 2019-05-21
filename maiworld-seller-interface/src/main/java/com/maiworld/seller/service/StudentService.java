package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.pojo.TbStudent;

import entity.PageResult;

public interface StudentService {
	
	public List<TbStudent> findAll();
	
	public PageResult findPage(int pageNum, int pageSize);
	
	public void add(TbStudent student);
	
	public void update(TbStudent student);
	
	public TbStudent findOne(Long sid);
	
	public void delete (Long [] sids);
	
	public PageResult findPage(TbStudent student ,int pageNum ,int pageSize);
	
	
	
}
