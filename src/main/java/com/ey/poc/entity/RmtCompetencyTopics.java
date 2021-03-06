package com.ey.poc.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * RmtCompetencyTopics generated by hbm2java
 */
@Entity
@Table(name="RMT_COMPETENCY_TOPICS",schema="dbo")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="topicId" ,resolver = DedupingObjectIdResolver.class)
public class RmtCompetencyTopics implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long topicId;
	private RmtSubCompetency rmtSubCompetency;
	private String topicName;
	private Boolean isactive;
	private Set<RmtCompetencySubTopics> rmtCompetencySubTopicses = new HashSet<RmtCompetencySubTopics>(0);

	public RmtCompetencyTopics() {
	}

	public RmtCompetencyTopics(RmtSubCompetency rmtSubCompetency, String topicName) {
		this.rmtSubCompetency = rmtSubCompetency;
		this.topicName = topicName;
	}

	public RmtCompetencyTopics(RmtSubCompetency rmtSubCompetency, String topicName, Boolean isactive,
			Set<RmtCompetencySubTopics> rmtCompetencySubTopicses) {
		this.rmtSubCompetency = rmtSubCompetency;
		this.topicName = topicName;
		this.isactive = isactive;
		this.rmtCompetencySubTopicses = rmtCompetencySubTopicses;
	}
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TOPIC_ID")
	public Long getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SUB_COMPETENCY_ID")
	public RmtSubCompetency getRmtSubCompetency() {
		return this.rmtSubCompetency;
	}

	public void setRmtSubCompetency(RmtSubCompetency rmtSubCompetency) {
		this.rmtSubCompetency = rmtSubCompetency;
	}
	@Column(name="TOPIC_NAME")
	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	@Column(name="ISACTIVE")
	public Boolean getIsactive() {
		return this.isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	@JsonManagedReference @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true ) @JoinColumn(name="TOPIC_ID" )
	public Set<RmtCompetencySubTopics> getRmtCompetencySubTopicses() {
		return this.rmtCompetencySubTopicses;
	}

	public void setRmtCompetencySubTopicses(Set<RmtCompetencySubTopics> rmtCompetencySubTopicses) {
		this.rmtCompetencySubTopicses = rmtCompetencySubTopicses;
	}

}
