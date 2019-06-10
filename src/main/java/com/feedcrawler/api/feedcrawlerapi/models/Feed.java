package com.feedcrawler.api.feedcrawlerapi.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feeds")
public class Feed {

	@Id
	private int id;
	
	private String title;
	
	
	private String link;
	
	private String published_at;
	
	private Date created_at;
	
	@Column(name = "feed_provider")
	private String feed_provider;

	public Feed() {
		
	}
	
	public Feed(int id, String title, String link, String published_at, Date created_at, String feed_provider) {
		super();
		this.id = id;
		this.title = title;
		this.link = link;
		this.published_at = published_at;
		this.created_at = created_at;
		this.feed_provider = feed_provider;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPublished_at() {
		return published_at;
	}

	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getFeed_provider() {
		return feed_provider;
	}

	public void setFeed_provider(String feed_provider) {
		this.feed_provider = feed_provider;
	}

	@Override
	public String toString() {
		return "Feed [id=" + id + ", title=" + title + ", link=" + link + ", published_at=" + published_at
				+ ", created_at=" + created_at + ", feed_provider=" + feed_provider + "]";
	}
	
	
}
