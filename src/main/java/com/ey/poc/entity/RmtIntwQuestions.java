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
@Table(name="RMT_INTW_QUESTIONS",schema="dbo")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id" ,scope =RmtIntwQuestions.class,resolver = DedupingObjectIdResolver.class )
public class RmtIntwQuestions implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private RmtCompetencySubTopics rmtCompetencySubTopics;
	private String question;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private String choice5;
	private String correctanswer;
	private Boolean isactive;
	private String createdBy;
	private Date createDate;
	private String updatedBy;
	private Date lastUpdatedTime;

	public RmtIntwQuestions() {
	}

	public RmtIntwQuestions(RmtCompetencySubTopics rmtCompetencySubTopics, String question, String correctanswer,
			String createdBy, Date createDate, String updatedBy, Date lastUpdatedTime) {
		this.rmtCompetencySubTopics = rmtCompetencySubTopics;
		this.question = question;
		this.correctanswer = correctanswer;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.updatedBy = updatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public RmtIntwQuestions(RmtCompetencySubTopics rmtCompetencySubTopics, String question, String choice1,
			String choice2, String choice3, String choice4, String choice5, String correctanswer, Boolean isactive,
			String createdBy, Date createDate, String updatedBy, Date lastUpdatedTime) {
		this.rmtCompetencySubTopics = rmtCompetencySubTopics;
		this.question = question;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.choice5 = choice5;
		this.correctanswer = correctanswer;
		this.isactive = isactive;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.updatedBy = updatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SUB_TOPIC_ID")
	public RmtCompetencySubTopics getRmtCompetencySubTopics() {
		return this.rmtCompetencySubTopics;
	}

	public void setRmtCompetencySubTopics(RmtCompetencySubTopics rmtCompetencySubTopics) {
		this.rmtCompetencySubTopics = rmtCompetencySubTopics;
	}
	@Column(name="QUESTION")
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	@Column(name="CHOICE1")
///
	public String getChoice1() {
		return this.choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	@Column(name="CHOICE2")
	public String getChoice2() {
		return this.choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	@Column(name="CHOICE3")
	public String getChoice3() {
		return this.choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}
	@Column(name="CHOICE4")
	public String getChoice4() {
		return this.choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}
	@Column(name="CHOICE5")
	public String getChoice5() {
		return this.choice5;
	}

	public void setChoice5(String choice5) {
		this.choice5 = choice5;
	}
	@Column(name="CORRECTANSWER")
	public String getCorrectanswer() {
		return this.correctanswer;
	}

	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}
	
	@Column(name="ISACTIVE")
	public Boolean getIsactive() {
		return this.isactive;
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