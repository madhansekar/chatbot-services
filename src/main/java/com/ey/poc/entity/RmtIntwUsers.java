package com.ey.poc.entity;
// Generated 18 Sep, 2019 4:22:05 AM by Hibernate Tools 5.3.10.Final

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * RmtIntwQuestions generated by hbm2java
 */
@Entity
@Table(name="RMT_INTW_USERS",schema="dbo")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="user_Id" ,scope =RmtIntwUsers.class,resolver = DedupingObjectIdResolver.class )
public class RmtIntwUsers implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long user_Id;
	private RmtSubServiceline rmtSubServiceline;
	private RmtCompetency rmtCompetency;
	private RmtSubCompetency rmtSubCompetency;
	private RmtCompetencyTopics rmtCompeteTopics;
	private RmtCompetencySubTopics rmtCompetencySubTopics;
	private RmtLevel rmtlevel;
	private RmtStatus rmtStatus;
	
	@JsonBackReference("user-status")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="STATUS_ID")
	public RmtStatus getRmtStatus() {
		return rmtStatus;
	}



	public void setRmtStatus(RmtStatus rmtStatus) {
		this.rmtStatus = rmtStatus;
	}



	public RmtIntwUsers( RmtSubServiceline rmtSubServiceline) {
		
	
		this.rmtSubServiceline = rmtSubServiceline;
		
	}
	


	@JsonBackReference(value="users") 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="LEVEL_ID")
	public RmtLevel getRmtlevel() {
		return rmtlevel;
	}




	public void setRmtlevel(RmtLevel rmtlevel) {
		this.rmtlevel = rmtlevel;
	}

	private String name;
	private String email;
	private int score ;
	private String phoneNumber;
	
	@Column(name="PHONE_NUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Column(name="SCORE")
	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}

	private Date intwDate;
	private Boolean isactive;
	
	private String createdBy;
	private Date createDate;
	private String updatedBy;
	private Date lastUpdatedTime;
	

	public RmtIntwUsers() {
	}

	

	
	
	
	
	
	@JsonBackReference("subtopic")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SUB_TOPIC_ID")
	public RmtCompetencySubTopics getRmtCompetencySubTopics() {
		return this.rmtCompetencySubTopics;
	}

	



	public void setRmtCompetencySubTopics(RmtCompetencySubTopics rmtCompetencySubTopics) {
		this.rmtCompetencySubTopics = rmtCompetencySubTopics;
	}


	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getUser_Id() {
		return user_Id;
	}



	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}



	@JsonBackReference("serviceline")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SUB_SERVICELINE_ID")
	public RmtSubServiceline getRmtSubServiceline() {
		return rmtSubServiceline;
	}




	public void setRmtSubServiceline(RmtSubServiceline rmtSubServiceline) {
		this.rmtSubServiceline = rmtSubServiceline;
	}



	@JsonBackReference("competency")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="COMPETENCY_ID")
	public RmtCompetency getRmtCompetency() {
		return rmtCompetency;
	}




	public void setRmtCompetency(RmtCompetency rmtCompetency) {
		this.rmtCompetency = rmtCompetency;
	}



	@JsonBackReference("subCompetency")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SUB_COMPETENCY_ID")
	public RmtSubCompetency getRmtSubCompetency() {
		return rmtSubCompetency;
	}




	public void setRmtSubCompetency(RmtSubCompetency rmtSubCompetency) {
		this.rmtSubCompetency = rmtSubCompetency;
	}



	@JsonBackReference("topicid")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TOPIC_ID")
	public RmtCompetencyTopics getRmtCompeteTopics() {
		return rmtCompeteTopics;
	}




	public void setRmtCompeteTopics(RmtCompetencyTopics rmtCompeteTopics) {
		this.rmtCompeteTopics = rmtCompeteTopics;
	}



	
	@Column(name="NAME")
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}



	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}



	@Column(name="INTW_DTAE")
	public Date getIntwDate() {
		return intwDate;
	}




	public void setIntwDate(Date intwDate) {
		this.intwDate = intwDate;
	}



	@Column(name="ISACTIVE")
	public Boolean getIsactive() {
		return isactive;
	}




	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}



	@Column(name="CREATED_BY")
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	@Column(name="CREATE_DATE")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name="UPDATED_BY")
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	@Column(name="LAST_UPDATED_TIME")
	public Date getLastUpdatedTime() {
		return this.lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}





	
	
}
