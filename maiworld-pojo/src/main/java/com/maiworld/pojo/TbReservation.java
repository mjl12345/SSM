package com.maiworld.pojo;

import java.io.Serializable;
import java.util.List;

public class TbReservation    implements Serializable{
    private Long id;

    private Long sid;

    private Long cid;

    private Long releId;

    private String checkStatus;

    private String status;
    
   // private List<TbStudent> student;	//学员
    
  //  private List<TbCoach> coach;		//教练
    
//学员
    private String sname;		//学员姓名
    
    private String sex1;		//性别
    
    private String phone;		//手机号

    private String cardId;		//身份证号

    private String isVip;		//学员身份
    
    private String status1;		//所属分校
//教练
    
    private String cname;			//姓名   

    private String plateNumber;			//车牌号
    
    private String phone2;			//手机号
    
    private String status2;			//所属校区
    
    private String indoor; 			//室内外
    
//教练发布信息表
    
    private String period;			//教学时间段
    
    private String subject;			//科目类型
    
    private String vehicleType;		//培训车型
    
    

	

	@Override
	public String toString() {
		return "TbReservation [id=" + id + ", sid=" + sid + ", cid=" + cid + ", releId=" + releId + ", checkStatus="
				+ checkStatus + ", status=" + status + ", sname=" + sname + ", sex1=" + sex1 + ", phone=" + phone
				+ ", cardId=" + cardId + ", isVip=" + isVip + ", status1=" + status1 + ", cname=" + cname
				+ ", plateNumber=" + plateNumber + ", phone2=" + phone2 + ", status2=" + status2 + ", indoor=" + indoor
				+ ", period=" + period + ", subject=" + subject + ", vehicleType=" + vehicleType + "]";
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getStatus2() {
		return status2;
	}

	public void setStatus2(String status2) {
		this.status2 = status2;
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
		this.checkStatus = checkStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex1() {
		return sex1;
	}

	public void setSex1(String sex1) {
		this.sex1 = sex1;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getIsVip() {
		return isVip;
	}

	public void setIsVip(String isVip) {
		this.isVip = isVip;
	}

	public String getStatus1() {
		return status1;
	}

	public void setStatus1(String status1) {
		this.status1 = status1;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getIndoor() {
		return indoor;
	}

	public void setIndoor(String indoor) {
		this.indoor = indoor;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
    

	
}