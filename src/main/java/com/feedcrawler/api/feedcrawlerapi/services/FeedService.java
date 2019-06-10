package com.feedcrawler.api.feedcrawlerapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import com.feedcrawler.api.feedcrawlerapi.models.Feed;
import com.feedcrawler.api.feedcrawlerapi.repositories.FeedRepository;


@Component
public class FeedService {

	@Autowired
	private FeedRepository feedRepository;
	
	public List<Feed> getAllFeeds(){
		return feedRepository.findAll();
	}
	
	public List<Feed> getAllFeedsByProvider(String provider){
		return feedRepository.getAllFeedsByProvider(provider);
	}
	
}
