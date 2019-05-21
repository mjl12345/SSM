package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.pojo.TbSealSchool;

import entity.PageResult;

public interface SealSchoolService {

	
	public List<TbSealSchool> findAll();
	
	public PageResult findPage(int pageNum, int pageSize);
	
	public void add(TbSealSchool sealSchool);
	
	public void update(TbSealSchool sealSchool);
	
	public TbSealSchool findOne(Long id);
	
	public void delete(Long [] ids);
	
	public PageResult findPage(TbSealSchool sealSchool , int pageNum, int pagrSize);
	
	
	
	
	
	
	
	
	
}
