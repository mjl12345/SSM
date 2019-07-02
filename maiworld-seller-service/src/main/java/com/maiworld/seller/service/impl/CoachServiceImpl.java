package com.maiworld.seller.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maiworld.api.dto.CoachDTO;
import com.maiworld.api.vo.ResultVO;
import com.maiworld.mapper.TbCoachMapper;
import com.maiworld.mapper.TbEvaluationMapper;
import com.maiworld.pojo.TbCoach;
import com.maiworld.pojo.TbCoachExample;
import com.maiworld.pojo.TbCoachExample.Criteria;
import com.maiworld.pojo.TbEvaluation;
import com.maiworld.pojo.TbEvaluationExample;
import com.maiworld.seller.service.CoachService;

import entity.PageResult;

@Service
public class CoachServiceImpl implements CoachService {

	@Autowired
	private TbCoachMapper tbCoachMapper;
	
	@Autowired
	private TbEvaluationMapper tbEvaluationMapper;
	
	@Override
	public List<TbCoach> findAll() {
		
		return tbCoachMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbCoach> page = (Page<TbCoach>) tbCoachMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
	@Override
	public void add(TbCoach coach) {
		coach.setAuthentication("1");
		coach.setAuthentication("0");	//状态
		coach.setCreated(new Date());   //创建时间
		
		tbCoachMapper.insert(coach);

	}

	@Override
	public void update(TbCoach coach) {
		tbCoachMapper.updateByPrimaryKey(coach);

	}

	@Override
	public TbCoach findOne(Long cid) {
		return tbCoachMapper.selectByPrimaryKey(cid);
		
	}

	@Override
	public void delete(Long[] cids) {
		for(Long cid:cids){
			tbCoachMapper.deleteByPrimaryKey(cid);
		}
		

	}

	@Override
	public PageResult findPage(TbCoach coach, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		TbCoachExample example = new TbCoachExample();
		Criteria create = example.createCriteria();
			if(coach!=null){
				if(coach.getName()!=null && coach.getName().length()>0){
					create.andNameLike("%"+coach.getName()+"%");
				}if(coach.getPhone()!=null && coach.getPhone().length()>0){
					create.andPhoneLike("%"+coach.getPhone()+"%");
				}if(coach.getAuthentication()!=null && coach.getAuthentication().length()>0){
					create.andAuthenticationLike("%"+coach.getAuthentication()+"%");
				}
			}
		
		Page<TbCoach> page = (Page<TbCoach>) tbCoachMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void updateAuthentication(Long cid, String authentication) {
		TbCoach coach = tbCoachMapper.selectByPrimaryKey(cid);
		coach.setAuthentication(authentication);
		tbCoachMapper.updateByPrimaryKey(coach);
		
	}

	@Override
	public ResultVO<CoachDTO> findOne(String openid) {
		ResultVO<CoachDTO> result=new ResultVO<>();
		CoachDTO coachDto=new CoachDTO();
		if(openid==null && openid==""){
		    result.setCode(0);
		    result.setMsg("没有此教练的信息");
		    result.setData(null);
		    return result;
		}
		  TbCoach selectByOpenid = tbCoachMapper.selectByOpenid(openid);
		  if(selectByOpenid==null){
			    result.setCode(0);
			    result.setMsg("没有此教练的信息");
			    result.setData(null);
			    return result;
		  }
		  coachDto.setCoach(selectByOpenid);
		  TbEvaluationExample example = new TbEvaluationExample();
			com.maiworld.pojo.TbEvaluationExample.Criteria criteria = example.createCriteria();
			criteria.equals(selectByOpenid.getCid());
			List<TbEvaluation> selectByExample = tbEvaluationMapper.selectByExample(example);
			
			coachDto.setComment(selectByExample);
			result.setCode(0);
		    result.setMsg("没有此教练的信息");
		    result.setData(coachDto);
		    return result;
		
	}

}
