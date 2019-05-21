package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import com.maiworld.pojo.TbStudent;
import com.maiworld.seller.service.StudentService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Reference
	private StudentService studentService;
	
	@RequestMapping("/findAll")
	public List<TbStudent> findAll(){
		return studentService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
			return studentService.findPage(page, rows);
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbStudent student){
		try{
			studentService.add(student);
			return new Result(true, "增加成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbStudent student){
		try{
			studentService.update(student);
			return new Result(true, "修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping("/findOne")
	public TbStudent findOne(Long sid){
		
		return studentService.findOne(sid);
	}
	
	@RequestMapping("/delete")
	public Result delete(Long [] sids){
		try{
			studentService.delete(sids);
			return new Result(true, "删除成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "删除失败");
			
		}
	}
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbStudent student, int page, int rows){
		
		return studentService.findPage(student, page, rows); 
	}
	
}




