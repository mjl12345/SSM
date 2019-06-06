package com.maiworld.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TbReservation  implements Serializable{
    private Long id;

    private Long sid;

    private Long cid;

    private Long releId;

    private String checkStatus;

    private String status;
    
    private List<Map<String, Object>> reseervation ;
    

    public List<Map<String, Object>> getReseervation() {
		return reseervation;
	}

	public void setReseervation(List<Map<String, Object>> reseervation) {
		this.reseervation = reseervation;
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

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getReleId() {
        return releId;
    }

    public void setReleId(Long releId) {
        this.releId = releId;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}