package com.myapp.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.model.Trade;

public interface TradeRepository extends JpaRepository<Trade, Long>{

	List<Trade> findAll();
	
}
