package com.maiworld.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbCost implements Serializable{
    private Long id;

    private Long sid;

    private Double cost;

    private Date created;

    private String status;
    
    private TbStudent student;
 
    
	public TbCost() {
		super();
	}


	@Override
	public String toString() {
		return "TbCost [id=" + id + ", sid=" + sid + ", cost=" + cost + ", created=" + created + ", status=" + status
				+ ", student=" + student + "]";
	}



	public TbCost(Long id, Long sid, Double cost, Date created, String status, TbStudent student) {
		super();
		this.id = id;
		this.sid = sid;
		this.cost = cost;
		this.created = created;
		this.status = status;
		this.student = student;
	}



	public TbStudent getStudent() {
		return student;
	}



	public void setStudents(TbStudent student) {
		this.student = student;
	}



	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}