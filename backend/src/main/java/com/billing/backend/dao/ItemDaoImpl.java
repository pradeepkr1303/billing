package com.billing.backend.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billing.backend.entity.Item;
import com.billing.backend.repository.ItemRepository;

@Repository
public class ItemDaoImpl implements ItemDao {
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public Item saveItem(Item item) {
		Item savedItem;
		savedItem = itemRepository.save(item);
		return savedItem;
	}

	@Override
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<Item>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}
}
