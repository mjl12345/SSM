package com.maiworld.seller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.mapper.TbEvaluationMapper;
import com.maiworld.pojo.TbEvaluation;
import com.maiworld.pojo.TbEvaluationExample;
import com.maiworld.pojo.TbEvaluationExample.Criteria;
import com.maiworld.seller.service.EvaluationService;

import entity.PageResult;

@Service
public class EvaluationServiceImpl implements EvaluationService {

	@Autowired
	private TbEvaluationMapper tbEvaluationMapper;
	
	@Override
	public List<TbEvaluation> findAll() {
		
		return tbEvaluationMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbEvaluation> page = (Page<TbEvaluation>) tbEvaluationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbEvaluation evaluation) {
		evaluation.setCommentee("0");
		evaluation.setCommentee("1");
		tbEvaluationMapper.insert(evaluation);

	}

	@Override
	public void update(TbEvaluation evaluation) {
		tbEvaluationMapper.updateByPrimaryKey(evaluation);

	}

	@Override
	public TbEvaluation findOne(Long id) {
		
		return tbEvaluationMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			 tbEvaluationMapper.deleteByPrimaryKey(id);
		}

	}

	@Override
	public PageResult findPage(TbEvaluation evaluation, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		TbEvaluationExample example = new TbEvaluationExample();
		Criteria create = example.createCriteria();
			
			if(evaluation!=null){
				if(evaluation.getContent()!=null && evaluation.getContent().length()>0){
					create.andContentLike("%"+evaluation.getContent()+"%");
				}if(evaluation.getStatus()!=null && evaluation.getStatus().length()>0){
					create.andStatusLike("%"+evaluation.getStatus()+"%");
				}if(evaluation.getCommentee()!=null && evaluation.getCommentee().length()>0){
					create.andCommenteeLike("%"+evaluation.getCommentee()+"%");
				}
			}
		Page<TbEvaluation> page = (Page<TbEvaluation>) tbEvaluationMapper.selectByExample(example );
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public PageResult evaluationList(int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);
		List<TbEvaluation> evaluationList = tbEvaluationMapper.evaluationList();

		Page<TbEvaluation> page = (Page<TbEvaluation>) evaluationList;
		return new PageResult(page.getTotal(), page.getResult());
	}

}
