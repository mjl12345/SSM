package com.maiworld.seller.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.mapper.TbStudentMapper;
import com.maiworld.pojo.TbStudent;
import com.maiworld.pojo.TbStudentExample;
import com.maiworld.pojo.TbStudentExample.Criteria;
import com.maiworld.seller.service.StudentService;

import entity.PageResult;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private TbStudentMapper tbStudentMapper;
	
	@Override
	public List<TbStudent> findAll() {
		
		return tbStudentMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbStudent> page = (Page<TbStudent>) tbStudentMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbStudent student) {
		student.setCreated(new Date());
		tbStudentMapper.insert(student);

	}

	@Override
	public void update(TbStudent student) {
		tbStudentMapper.updateByPrimaryKey(student);

	}

	@Override
	public TbStudent findOne(Long sid) {
		
		return tbStudentMapper.selectByPrimaryKey(sid);
	}

	@Override
	public void delete(Long[] sids) {
		for(Long sid:sids){
			tbStudentMapper.deleteByPrimaryKey(sid);
		}

	}

	@Override
	public PageResult findPage(TbStudent student, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		TbStudentExample example = new TbStudentExample();		
		Criteria create = example.createCriteria();
			if(student!= null){
				if(student.getName()!=null && student.getName().length()>0){
					create.andNameLike("%"+student.getName()+"%");
				}if(student.getStatus()!=null && student.getStatus().length()>0){
					create.andStatusLike("%"+student.getStatus()+"%");					
				}if(student.getStudyStatus()!=null && student.getStudyStatus().length()>0){
					create.andStudyStatusLike("%"+student.getStudyStatus()+"%");
				}
			}
			Page<TbStudent> page = (Page<TbStudent>) tbStudentMapper.selectByExample(example);
			return new PageResult(page.getTotal(), page.getResult());
	}

}
