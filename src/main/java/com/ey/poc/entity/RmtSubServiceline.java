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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * RmtSubServiceline generated by hbm2java
 */
@Entity
@Table(name="RMT_SUB_SERVICELINE",schema="dbo")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="subServicelineId",resolver = DedupingObjectIdResolver.class)
public class RmtSubServiceline implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer subServicelineId;
	private String subServicelineName;
	private Set<RmtCompetency> rmtCompetencies = new HashSet<RmtCompetency>();

	public RmtSubServiceline() {
	}

	public RmtSubServiceline(String subServicelineName) {
		this.subServicelineName = subServicelineName;
	}

	public RmtSubServiceline(String subServicelineName, Set<RmtCompetency> rmtCompetencies) {
		this.subServicelineName = subServicelineName;
		this.rmtCompetencies = rmtCompetencies;
	}
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@javax.persistence.Id
	@Column(name="SUB_SERVICELINE_ID")
	public Integer getSubServicelineId() {
		return this.subServicelineId;
	}

	public void setSubServicelineId(Integer subServicelineId) {
		this.subServicelineId = subServicelineId;
	}
	@Column(name="SUB_SERVICELINE_NAME")
	public String getSubServicelineName() {
		return this.subServicelineName;
	}

	public void setSubServicelineName(String subServicelineName) {
		this.subServicelineName = subServicelineName;
	}
	
	@JsonManagedReference @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL) @JoinColumn(name="SSL_UNIT_CODE" )
	public Set<RmtCompetency> getRmtCompetencies() {
		return this.rmtCompetencies;
	}

	public void setRmtCompetencies(Set<RmtCompetency> rmtCompetencies) {
		this.rmtCompetencies = rmtCompetencies;
	}

}