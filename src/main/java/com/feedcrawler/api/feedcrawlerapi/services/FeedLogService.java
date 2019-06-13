package com.feedcrawler.api.feedcrawlerapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.feedcrawler.api.feedcrawlerapi.models.FeedLog;
import com.feedcrawler.api.feedcrawlerapi.repositories.FeedLogRepository;

@Component
public class FeedLogService {

	@Autowired
	private FeedLogRepository feedLogRepository;
	
	public FeedLog checkUpdatePossibility() {
		return this.feedLogRepository.findLatestLogRecord();
	}
}
