package com.billing.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.backend.dao.ItemDao;
import com.billing.backend.entity.Item;

@Service("ItemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public Item saveItem(Item item) {
		item.setCreatedDate(new Date());
		return itemDao.saveItem(item);
	}

	@Override
	public List<Item> getAllItems() {
		return itemDao.getAllItems();
	}

}
