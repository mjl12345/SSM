package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.pojo.TbUser;

import entity.PageResult;

public interface UserService {

	/**
	 * 返回数据
	 * @return
	 */
	public List<TbUser> findAll();
	
	public PageResult findPage(int pageNum, int pageSize);	
	
	public void add(TbUser user);
	
	public void update(TbUser user);
	
	public TbUser findOne(Long id);
	
	public void delete(Long [] ids);
	
	public PageResult findPage(TbUser user ,int pageNum, int pageSize);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

