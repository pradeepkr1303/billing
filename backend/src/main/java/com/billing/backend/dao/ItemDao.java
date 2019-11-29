package com.billing.backend.dao;

import java.util.List;

import com.billing.backend.entity.Item;

public interface ItemDao {
	public Item saveItem(Item item);
	public List<Item> getAllItems();

}
