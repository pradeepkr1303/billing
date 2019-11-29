package com.billing.backend.service;

import java.util.List;

import com.billing.backend.entity.Item;

public interface ItemService {
	public Item saveItem(Item item);
	public List<Item> getAllItems();
}
