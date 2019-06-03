package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maiworld.pojo.TbCost;
import com.maiworld.seller.service.CostService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/cost")
public class CostController {

	@Reference
	private CostService costService;

	@RequestMapping("/findAll")
	public List<TbCost> findAll(){
		return costService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return costService.findPage(page, rows);
	} 
	
	@RequestMapping("/add")
	public Result add( @RequestBody TbCost cost){
		try{
			costService.add(cost);
			return new Result(true, "增加成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	@RequestMapping("/update")
	public Result update( @RequestBody TbCost cost){
		try{
			costService.update(cost);
			return new Result(true, "修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping("/findOne")
	public TbCost findOne(Long id){
		return costService.findOne(id);
	}
	
	@RequestMapping("/delete")
	public Result delete(Long[] ids){
		try{
			costService.delete(ids);
			return new Result(true, "删除成功");
		}catch(Exception e){
			 e.printStackTrace();
			 return new Result(false, "删除失败");
		}
	}
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbCost cost , int page, int rows){
		return costService.findPage(cost, page, rows);
	}
	
	
	@RequestMapping("/studentList")
	public  PageResult studentList(int page, int rows){
		PageResult studentList = costService.studentList(page, rows);
		return studentList;
	}



}
