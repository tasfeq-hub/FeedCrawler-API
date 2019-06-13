package com.feedcrawler.api.feedcrawlerapi.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feed_log")
public class FeedLog {

	@Id
	private int id;
	
	private Date created_at;
	
	private Date updated_at;
	
	public FeedLog() {
		
	}

	public FeedLog(int id, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "FeedLog [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
}
