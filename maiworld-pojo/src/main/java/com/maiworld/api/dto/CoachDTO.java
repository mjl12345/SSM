package com.maiworld.api.dto;

import java.io.Serializable;
import java.util.List;

import com.maiworld.pojo.TbCoach;
import com.maiworld.pojo.TbEvaluation;

public class CoachDTO implements Serializable{
	
	private TbCoach coach;						//教练表
	
	private List<TbEvaluation> comment;			//评论表

	public TbCoach getCoach() {
		return coach;
	}

	public void setCoach(TbCoach coach) {
		this.coach = coach;
	}

	public List<TbEvaluation> getComment() {
		return comment;
	}

	public void setComment(List<TbEvaluation> comment) {
		this.comment = comment;
	}

	

}
