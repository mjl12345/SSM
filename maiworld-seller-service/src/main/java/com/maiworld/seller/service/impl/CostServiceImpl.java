package com.maiworld.seller.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.mapper.TbCostMapper;
import com.maiworld.pojo.TbCost;
import com.maiworld.pojo.TbCostExample;
import com.maiworld.pojo.TbCostExample.Criteria;
import com.maiworld.seller.service.CostService;

import entity.PageResult;

@Service
public class CostServiceImpl implements CostService {

	
	@Autowired
	private TbCostMapper tbCostMapper;
	
	@Override
	public List<TbCost> findAll() {
	
		return tbCostMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbCost> page = (Page<TbCost>) tbCostMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbCost cost) {
	
		tbCostMapper.insert(cost);

	}

	@Override
	public void update(TbCost cost) {

		tbCostMapper.updateByPrimaryKey(cost);
	}

	@Override
	public TbCost findOne(Long id) {
		
		return tbCostMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			tbCostMapper.deleteByPrimaryKey(id);
		}

	}

	@Override
	public PageResult findPage(TbCost cost, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
			TbCostExample example = new TbCostExample();
				Criteria create = example.createCriteria();
		
			if(cost!=null){
				if(cost.getStatus()!=null && cost.getStatus().length()>0){
					create.andStatusLike("%"+cost.getStatus()+"%");
				}
			}
			Page<TbCost> page = (Page<TbCost>) tbCostMapper.selectByExample(example );
			return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public PageResult studentList(int pageNum, int pageSize) {
		 PageHelper.startPage(pageNum, pageSize);
 
		 List<Map<String, Object>> studentList = tbCostMapper.studentList();
		 //System.out.print("=====================================================:"+studentList);
		
		 
		// List<TbCost> studentList = tbCostMapper.studentList();
		
		// Page<TbCost> page = (Page <TbCost>) studentList;
		 Page<Map<String, Object>> page = (Page <Map<String, Object>>) studentList;
//		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(studentList);
//		System.out.println(pageInfo.toString());
		return new PageResult(page.getTotal(), page.getResult());
	}

}
