package com.maiworld.seller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.container.page.Page;
import com.maiworld.pojo.TbReservation;
import com.maiworld.seller.service.ReservationService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	
	
	@Reference
	private ReservationService reservationService;
	
	
	@RequestMapping("/findAll")
	public List<TbReservation> findAll(){
		
		return reservationService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rews){
		return reservationService.findPage(page, rews);
		
	}

	@RequestMapping("/add")
	public Result add(@RequestBody TbReservation reservation){
		try{
			reservationService.add(reservation);
			return new Result(true, "增加成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbReservation reservation){
		try{
			reservationService.update(reservation);
			return new Result(true, "修改成功");
		}catch(Exception e){
			 e.printStackTrace();
			 return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping("/findOne")
	public TbReservation findOne(Long id){
		return reservationService.findOne(id);
	}
	
	@RequestMapping("/delete")
	public Result delete(Long[] ids){
		try{
			reservationService.delete(ids);
			return new Result(true, "删除成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
	@RequestMapping("/search")
	public PageResult findPage(@RequestBody TbReservation reservation , int page, int rows){
		return reservationService.findPage(reservation, page, rows);
	}
	
	/*@RequestMapping("/reservationList")
	public PageResult reservationList(int page, int rows){
		PageResult reservationList = reservationService.reservationList(page, rows);
		return reservationList;
	}*/
	
	@RequestMapping("/reservationList")
	public PageResult reservationList(@RequestBody TbReservation reservation, int page, int rows){
		return reservationService.reservationList(reservation, page, rows);
	}

}
