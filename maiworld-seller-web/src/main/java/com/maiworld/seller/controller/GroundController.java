package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maiworld.pojo.TbGround;
import com.maiworld.seller.service.GroundService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/ground")
public class GroundController {

	@Reference
	private GroundService groundService;
	
	@RequestMapping("/findAll")
	public List<TbGround> findAll(){
		return groundService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return groundService.findPage(page, rows);
		
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbGround ground){
		try{
			groundService.add(ground);
			return new Result(true, "增加成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	@RequestMapping("/update")
	public Result update(@RequestBody TbGround ground){
		try{
			groundService.update(ground);
			return new Result(true, "修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "修改失败");
		}		
	}
	
	@RequestMapping("/findOne")	
	public TbGround findOne(Long id){
		return groundService.fingOne(id);
	}
	
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try{
			groundService.delete(ids);
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
	public PageResult search(@RequestBody TbGround ground, int page, int rows  ){
		return groundService.findPage(ground, page, rows);		
	}
	
	
}
