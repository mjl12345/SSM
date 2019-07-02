package com.maiworld.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maiworld.api.dto.CoachDTO;
import com.maiworld.api.vo.ResultVO;
import com.maiworld.seller.service.CoachService;

@RestController
@RequestMapping("/coach")
public class CoachController {
	
		@Reference
		private CoachService coachService;

		@RequestMapping("/findOne")
		public ResultVO<CoachDTO> findOne(String openid){
		
		
		return coachService.findOne(openid);
	}
	
}
