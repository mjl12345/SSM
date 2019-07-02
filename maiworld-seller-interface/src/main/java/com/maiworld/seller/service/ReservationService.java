package com.maiworld.seller.service;

import java.util.List;

import com.maiworld.pojo.TbReservation;

import entity.PageResult;

public interface ReservationService {

	
	public List<TbReservation> findAll();
		
	public PageResult findPage(int pageNum, int pageSize);
	
	public void add(TbReservation reservation);
	
	public void update(TbReservation reservation);
	
	public TbReservation findOne(Long id);
	
	public void delete(Long[] ids);
	
	public PageResult findPage(TbReservation reservation , int pageNum, int pageSize);
	
	/*public PageResult reservationList(int pageNum, int pageSize);*/
	
	public PageResult reservationList(TbReservation reservation, int pageNum, int pageSize);
	
}
