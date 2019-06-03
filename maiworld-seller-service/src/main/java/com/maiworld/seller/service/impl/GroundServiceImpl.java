package com.maiworld.seller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.mapper.TbGroundMapper;
import com.maiworld.pojo.TbGround;
import com.maiworld.pojo.TbGroundExample;
import com.maiworld.pojo.TbGroundExample.Criteria;
import com.maiworld.seller.service.GroundService;

import entity.PageResult;

@Service
public class GroundServiceImpl implements GroundService {

	@Autowired
	private TbGroundMapper groundMapper;
	
	/**
	 * 返回所有
	 */
	@Override
	public List<TbGround> findAll() {
		
		return groundMapper.selectByExample(null);
	}
	/**
	 * 分页
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);	//分页
		Page<TbGround> page = (Page<TbGround>) groundMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}
	/**
	 * 添加
	 */
	@Override
	public void add(TbGround ground) {
		groundMapper.insert(ground);

	}
	/**
	 * 修改
	 */
	@Override
	public void update(TbGround ground) {
		groundMapper.updateByPrimaryKey(ground);

	}
	/**
	 * 根据ID查询实体
	 */
	@Override
	public TbGround fingOne(Long id) {
		
		return groundMapper.selectByPrimaryKey(id);
	}
	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			groundMapper.deleteByPrimaryKey(id);
		}

	}

	@Override
	public PageResult findPage(TbGround ground, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
			
			TbGroundExample example = new TbGroundExample();
			Criteria create = example.createCriteria();
			
			if(ground!=null){
				if(ground.getName()!=null && ground.getName().length()>0){					
					create.andNameLike("%"+ground.getName()+"%");
					
				}if(ground.getAddress()!=null && ground.getAddress().length()>0){					
					create.andAddressLike("%"+ground.getAddress()+"%");
				}
			}		
		Page<TbGround> page = (Page<TbGround>) groundMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}
