package com.spring.service;

import java.util.List;

import com.spring.entities.Item;

public interface ItemService {
	
	Item createItem(Item item);

	List<Item> showList();

	void deleteItem(int id);

	//Item ShowItem(int id);
	
	Item updateitem(int id, Item item);

	

	

	

}
