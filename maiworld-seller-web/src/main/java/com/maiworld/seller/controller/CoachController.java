package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maiworld.pojo.TbCoach;
import com.maiworld.seller.service.CoachService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/coach")
public class CoachController {

	
	@Reference
	private CoachService coachService;
	
	@RequestMapping("/findAll")
	public List<TbCoach> findAll(){
		return coachService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return coachService.findPage(page, rows);
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbCoach coach){
		try{
			coachService.add(coach);
			return new Result(true, "增加成功");
		}catch(Exception e ){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbCoach coach){
		try{
			coachService.update(coach);
			return new Result(true, "修改成功");
			
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping("/findOne")
	public TbCoach findOne( Long cid){
		return coachService.findOne(cid);
	}
	
	@RequestMapping("/delete")
	public Result delete(Long[] cids){
		try{
			coachService.delete(cids);
			return new Result(true, "删除成功");
		}catch(Exception e ){
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	@RequestMapping("/search")	
	public PageResult search(@RequestBody TbCoach coach ,int page, int rows){
		return coachService.findPage(coach, page, rows);
	}
	
	
	@RequestMapping("/updateAuthentication")
	public Result updateAuthentication(Long cid , String authentication){
		try{
			coachService.updateAuthentication(cid, authentication);
			return new Result(true, "成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
}
