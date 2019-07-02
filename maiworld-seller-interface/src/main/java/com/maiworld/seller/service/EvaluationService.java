package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.pojo.TbEvaluation;

import entity.PageResult;

/**
 * 评论表接口
 * @author Administrator
 *
 */
public interface EvaluationService {

	
	public List<TbEvaluation> findAll();
	
	public PageResult findPage(int pageNum, int pageSize);
	
	public void add(TbEvaluation evaluation);
	
	public void update(TbEvaluation evaluation);
	
	public TbEvaluation findOne(Long id);
	
	public void delete(Long[] ids);
	
	public PageResult findPage(TbEvaluation evaluation, int pageNum, int pageSize);
	
	public PageResult evaluationList(int pageNum, int pageSize );
	
}
