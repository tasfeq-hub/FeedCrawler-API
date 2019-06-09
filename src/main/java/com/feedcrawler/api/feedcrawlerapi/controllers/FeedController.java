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
	
}
