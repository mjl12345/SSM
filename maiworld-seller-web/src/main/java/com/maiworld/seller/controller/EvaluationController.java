package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maiworld.pojo.TbEvaluation;
import com.maiworld.seller.service.EvaluationService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {

	@Reference
	private EvaluationService evaluationService;
	
	
	@RequestMapping("/findAll")
	public List<TbEvaluation> findAll(){
		return evaluationService.findAll();
	}
	
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows){
		return evaluationService.findPage(page, rows);
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbEvaluation evaluation){
		try{
			evaluationService.add(evaluation);
			return new Result(true, "增加成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbEvaluation evaluation){
		try{
			evaluationService.update(evaluation);
			return new Result(true, "修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping("/findOne")
	public TbEvaluation findOne(Long id){
		return evaluationService.findOne(id);
	}
	
	@RequestMapping("/delete")
	public  Result delete(Long[] ids){
		try{
			evaluationService.delete(ids);
			return new Result(true, "删除成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbEvaluation evaluation, int page, int rows ){
		return evaluationService.findPage(evaluation, page, rows);
	}
	
	
	
	@RequestMapping("/evaluationList")
	public PageResult evaluationList(int page, int rows){
		return evaluationService.evaluationList(page, rows);
	}
	
}
