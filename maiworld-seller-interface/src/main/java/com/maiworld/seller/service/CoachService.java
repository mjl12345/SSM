package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.api.dto.CoachDTO;
import com.maiworld.api.vo.ResultVO;
import com.maiworld.pojo.TbCoach;

import entity.PageResult;

public interface CoachService {

	
	
	public List<TbCoach> findAll();
	
	public PageResult findPage(int pageNum, int pageSize);
	
	public void add(TbCoach coach);
	
	public void update(TbCoach coach);
	
	public TbCoach findOne(Long cid);
	
	public void delete(Long[] cids);
	
	public PageResult findPage( TbCoach coach , int pageNum , int pageSize);
	
	/**
	 * 更新状态
	 * @param cid
	 * @param authentication
	 */
	public void updateAuthentication(Long cid , String authentication);
	
	/**
	 * 查询教练详情
	 * @param openid
	 * @return
	 */
	public ResultVO<CoachDTO> findOne(String openid);
}
