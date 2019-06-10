package com.feedcrawler.api.feedcrawlerapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.feedcrawler.api.feedcrawlerapi.models.Feed;
import com.feedcrawler.api.feedcrawlerapi.services.FeedService;


@RestController
public class FeedController {

	@Autowired
	private FeedService feedService;
	
	/* Retrieve all web feeds */
	@GetMapping("/feeds")
	public List<Feed> retrieveAllFeeds(){
		return feedService.getAllFeeds();
	}
	
	/* Retrieve all web feeds from EONLINE */
	@GetMapping("/eonline-feeds")
	public List<Feed> getEonlineFeeds(){
		return feedService.getAllFeedsByProvider("EONLINE");
	}
	
	/* Retrieve all web feeds from NYT */
	@GetMapping("/nyt-feeds")
	public List<Feed> getNytFeeds(){
		return feedService.getAllFeedsByProvider("NYT");
	}
	
	/* Retrieve all web feeds from SKYNEWS */
	@GetMapping("/skynews-feeds")
	public List<Feed> getSkyNewsFeeds(){
		return feedService.getAllFeedsByProvider("SKYNEWS");
	}
	
	/* Retrieve all web feeds from SSPORTS24 */
	@GetMapping("/ssports-feeds")
	public List<Feed> getSSportsFeeds(){
		return feedService.getAllFeedsByProvider("SSPORTS24");
	}
	
	/* Retrieve all web feeds from FEEDFORALL */
	@GetMapping("/feedforall-feeds")
	public List<Feed> getFeedForAllFeeds(){
		return feedService.getAllFeedsByProvider("FEEDFORALL");
	}
	
}
