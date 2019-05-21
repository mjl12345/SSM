package com.maiworld.seller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.mapper.TbUserMapper;
import com.maiworld.pojo.TbUser;
import com.maiworld.pojo.TbUserExample;
import com.maiworld.pojo.TbUserExample.Criteria;
import com.maiworld.seller.service.UserService;

import entity.PageResult;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper TbUserMapper;
	@Override
	public List<TbUser> findAll() {

		return TbUserMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		 Page<TbUser> page = (Page<TbUser>) TbUserMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbUser user) {
		//user.setStatus("0");
		TbUserMapper.insert(user);
		
	}

	@Override
	public void update(TbUser user) {
		TbUserMapper.updateByPrimaryKey(user);
		
	}

	@Override
	public TbUser findOne(Long id) {
		
		return TbUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			TbUserMapper.deleteByPrimaryKey(id);
		}
		
	}

	@Override
	public PageResult findPage(TbUser user, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		TbUserExample example = new TbUserExample();
		Criteria create = example.createCriteria();
		
		if(user!=null){
			if(user.getStatus()!=null && user.getStatus().length()>0){
				create.andStatusLike("%"+user.getStatus()+"%");
				
			}if(user.getUsername()!=null && user.getUsername().length()>0){
				create.andUsernameLike("%"+user.getUsername()+"%");
			}
		}
		Page<TbUser> page = (Page<TbUser>) TbUserMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}
