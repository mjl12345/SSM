package com.maiworld.seller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.mapper.TbSealSchoolMapper;
import com.maiworld.pojo.TbSealSchool;
import com.maiworld.pojo.TbSealSchoolExample;
import com.maiworld.pojo.TbSealSchoolExample.Criteria;
import com.maiworld.seller.service.SealSchoolService;

import entity.PageResult;

@Service
public class SealSchoolServiceImpl implements SealSchoolService {

	@Autowired
	private TbSealSchoolMapper tbSealSchoolMapper;
	
	@Override
	public List<TbSealSchool> findAll() {
		
		return tbSealSchoolMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbSealSchool> page = (Page<TbSealSchool>) tbSealSchoolMapper.selectByExample(null);
		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbSealSchool sealSchool) {
		tbSealSchoolMapper.insert(sealSchool);

	}

	@Override
	public void update(TbSealSchool sealSchool) {
		tbSealSchoolMapper.updateByPrimaryKey(sealSchool);

	}

	@Override
	public TbSealSchool findOne(Long id) {
		
		return tbSealSchoolMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			tbSealSchoolMapper.deleteByPrimaryKey(id);
		}

	}

	@Override
	public PageResult findPage(TbSealSchool sealSchool, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		TbSealSchoolExample example = new TbSealSchoolExample();
		Criteria create = example.createCriteria();
		
		if(sealSchool!=null){
			if(sealSchool.getStatus()!=null &&  sealSchool.getStatus().length()>0){
					create.andStatusLike("%"+sealSchool.getStatus()+"%");		
			}if(sealSchool.getContact()!=null && sealSchool.getContact().length()>0){
				create.andContactLike("%"+sealSchool.getContact()+"%");				
			}if(sealSchool.getName()!=null && sealSchool.getName().length()>0){
				create.andNameLike("%"+sealSchool.getName()+"%");
			}						
		}
		Page<TbSealSchool> page = (Page<TbSealSchool>) tbSealSchoolMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}
