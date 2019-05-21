package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maiworld.pojo.TbSealSchool;
import com.maiworld.seller.service.SealSchoolService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/sealSchool")
public class SealSchoolController {

	@Reference
	private SealSchoolService sealSchoolService;
	
	@RequestMapping("/findAll")
	public List<TbSealSchool> findAll(){
		
		return sealSchoolService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		
		return sealSchoolService.findPage(page, rows);
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbSealSchool sealSchool){
		try{
			sealSchoolService.add(sealSchool);
			return new Result(true, "增加成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbSealSchool sealSchool){
		try{
			sealSchoolService.update(sealSchool);
			return new Result(true, "修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping("/findOne")
	public TbSealSchool findOne(Long id){
		
		return sealSchoolService.findOne(id);
	}

	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try{
			sealSchoolService.delete(ids);
			return new Result(true, "删除成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "删除失败");
		}	
	}
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbSealSchool sealSchool ,int page, int rows){
		
		return sealSchoolService.findPage(sealSchool, page ,rows);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
