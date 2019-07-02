package com.maiworld.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbEvaluation implements Serializable{
    private Long id;

    private Long sid;

    private Long cid;

    private Long nid;

    private String commentee;

    private Integer star;

    private String content;

    private String status;

    private Date created;   
    
    private String cname;
    
    private String sname;
    
    private String status1;
    
    private String title;
    
    private String browseNum;
    
    private String commentsNum;
    
    private String likeNum;
    
    private String classification;
 

    
    @Override
	public String toString() {
		return "TbEvaluation [id=" + id + ", sid=" + sid + ", cid=" + cid + ", nid=" + nid + ", commentee=" + commentee
				+ ", star=" + star + ", content=" + content + ", status=" + status + ", created=" + created + ", cname="
				+ cname + ", sname=" + sname + ", status1=" + status1 + ", title=" + title + ", browseNum=" + browseNum
				+ ", commentsNum=" + commentsNum + ", likeNum=" + likeNum + ", classification=" + classification + "]";
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStatus1() {
		return status1;
	}

	public void setStatus1(String status1) {
		this.status1 = status1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrowseNum() {
		return browseNum;
	}

	public void setBrowseNum(String browseNum) {
		this.browseNum = browseNum;
	}

	public String getCommentsNum() {
		return commentsNum;
	}

	public void setCommentsNum(String commentsNum) {
		this.commentsNum = commentsNum;
	}

	public String getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(String likeNum) {
		this.likeNum = likeNum;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
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

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public String getCommentee() {
        return commentee;
    }

    public void setCommentee(String commentee) {
        this.commentee = commentee == null ? null : commentee.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}