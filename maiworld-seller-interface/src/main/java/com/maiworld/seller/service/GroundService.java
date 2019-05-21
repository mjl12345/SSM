package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.pojo.TbGround;

import entity.PageResult;

/**
 * 培训场地详情
 * @author Administrator
 *
 */
public interface GroundService {

	/**
	 * 返回所有数据
	 * @return
	 */
	public List<TbGround> findAll();
	/**
	 * 分页
	 * @param pageNum显示当前页
	 * @param pageSize 每页显示记录数
	 * @return
	 */
	public PageResult findPage(int pageNum , int pageSize);
	/**
	 * 增加
	 * @param ground
	 */
	public void add(TbGround ground);
	
	/**
	 * 修改
	 * @param ground
	 */
	public void update(TbGround ground);
	
	/**
	 *	根据ID查询实体
	 * @param id
	 * @return
	 */
	public TbGround fingOne(Long id);
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);
	
	/**
	 * 查询+分页
	 * @param ground
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(TbGround  ground , int pageNum, int pageSize);
	
}
