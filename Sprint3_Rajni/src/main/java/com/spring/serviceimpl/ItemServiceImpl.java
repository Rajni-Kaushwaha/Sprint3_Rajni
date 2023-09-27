package com.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Item;
import com.spring.repository.ItemRepo;
import com.spring.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepo item1;
	
	@Override
	public Item createItem(Item item)
	{
		return item1.save(item);
	}
	
	public Item createItem(int id)
	{
		return item1.findById(id).orElse(null);
	}

	@Override
	public List<Item> showList()
	{
		
		return item1.findAll();
	}
	
	public void deleteItem(int id)
	{
		item1.deleteById(id);
	}

	@Override
	public Item updateitem(int id, Item item) {
		Item i = item1.findById(id).get();
		i.setName(item.getName());
		i.setDescription(item.getDescription());
		i.setPrice(item.getPrice());
		Item i1 = item1.save(i);
		return i1;
	}

	

	
	
}
