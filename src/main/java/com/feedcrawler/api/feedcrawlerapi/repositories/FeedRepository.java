package com.feedcrawler.api.feedcrawlerapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feedcrawler.api.feedcrawlerapi.models.Feed;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Integer>{

	
}
