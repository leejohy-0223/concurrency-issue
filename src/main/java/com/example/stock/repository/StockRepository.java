package com.example.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock.domain.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
