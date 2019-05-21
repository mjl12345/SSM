package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maiworld.pojo.TbUser;
import com.maiworld.seller.service.UserService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/user")
public class UserController {

	@Reference
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<TbUser> findAll(){
		return userService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page , int rows){
		return userService.findPage(page, rows);
	}
	
	@RequestMapping("/add")
	public Result add( @RequestBody TbUser user){
		try{
			userService.add(user);
			return new Result(true, "增加成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbUser user){
		try{
			userService.update(user);
			return new Result(true, "修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "修改失败");
		}		
	}
	
	@RequestMapping("/findOne")	
	public TbUser findOne(Long id){
		return userService.findOne(id);
	}
	
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try{
			userService.delete(ids);
			return new Result(true, "删除成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
		
	}
	
	/**
	 * 查询+分页
	 * @param 
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbUser user, int page, int rows  ){
		return userService.findPage(user, page, rows);		
	}
	
}
