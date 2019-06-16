package com.feedcrawler.api.feedcrawlerapi.controllers;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.feedcrawler.api.feedcrawlerapi.models.Feed;
import com.feedcrawler.api.feedcrawlerapi.models.FeedLog;
import com.feedcrawler.api.feedcrawlerapi.services.FeedLogService;
import com.feedcrawler.api.feedcrawlerapi.services.FeedService;


@RestController
public class FeedController {

	@Autowired
	private FeedService feedService;
	
	@Autowired
	private FeedLogService feedLogService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
	
	/* Retrieve all web feeds from Washington Times */
	@GetMapping("/wt-feeds")
	public List<Feed> getWtFeeds(){
		return feedService.getAllFeedsByProvider("WT");
	}
	
	/* Feeds update request from client */
	@GetMapping("/update-feeds")
	public boolean checkUpdate(){
		FeedLog logData= this.feedLogService.checkUpdatePossibility();
		Date date = new Date();
		Timestamp currentTimestamp = new Timestamp(date.getTime());
		long milliseconds = (currentTimestamp.getTime() - logData.getCreated_at().getTime());
	    int seconds = (int) milliseconds / 1000;
	    int hours = seconds / 3600;
	    int minutes = (seconds % 3600) / 60;
		
	    logger.info("{}",minutes);
		
		if(minutes>10) {
			String command = "curl -X GET http://localhost/FeedCrawler-Server/";
			try {
				Process process = Runtime.getRuntime().exec(command);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true; // feed update possible
		}else {
			return false; // feed update not possible
		}
	}
	
}
