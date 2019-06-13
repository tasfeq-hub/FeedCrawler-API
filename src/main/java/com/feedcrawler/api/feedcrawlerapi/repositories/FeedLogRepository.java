package com.feedcrawler.api.feedcrawlerapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.feedcrawler.api.feedcrawlerapi.models.FeedLog;

@Repository
public interface FeedLogRepository extends JpaRepository<FeedLog, Integer>{

	@Query(
			value = "SELECT * FROM feed_log ORDER BY id DESC LIMIT 1 ",
			nativeQuery = true
	)
	public FeedLog findLatestLogRecord();
}
