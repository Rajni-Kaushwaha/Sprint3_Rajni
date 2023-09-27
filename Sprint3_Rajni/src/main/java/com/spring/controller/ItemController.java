package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Item;
import com.spring.service.ItemService;


@RestController
public class ItemController 
{
	
	@Autowired
	ItemService itemRepo;
	
	@PostMapping("/api/createItem")
	Item createItem(@RequestBody Item item)
	{
		return itemRepo.createItem(item);
	}
	
	@GetMapping("list")
	public List<Item> ListOfItemList()
	{
		return itemRepo.showList();
	}
	
	@DeleteMapping("delete/{id}")
		void deleteNewItem(@PathVariable int id)
		{
			 itemRepo.deleteItem(id);
		}
	
	@PutMapping("update/{id}")
	Item updateItem(@PathVariable int id, @RequestBody Item item)
	{
		return itemRepo.updateitem(id, item);
	}
	
	

}
