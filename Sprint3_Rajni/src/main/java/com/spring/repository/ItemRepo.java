package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.Item;


public interface ItemRepo extends JpaRepository<Item, Integer> {

}
