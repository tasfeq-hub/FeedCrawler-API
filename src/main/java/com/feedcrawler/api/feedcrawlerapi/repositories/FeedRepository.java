package com.feedcrawler.api.feedcrawlerapi.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.feedcrawler.api.feedcrawlerapi.models.Feed;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Integer>{

	// static param
	//@Query(value = "SELECT * FROM feeds WHERE feed_provider = 'EONLINE' ", nativeQuery = true)
	
	// dynamic param
	@Query(
		value = "SELECT * FROM feeds WHERE feed_provider = ?1",
		nativeQuery = true
	)
	public List<Feed> getAllFeedsByProvider(String feed_provider);
	
}
