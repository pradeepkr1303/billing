package com.billing.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billing.backend.dto.ResponseDto;
import com.billing.backend.entity.Item;
import com.billing.backend.service.ItemService;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private ResponseDto  responseDto;
	
	@GetMapping("/getAllItems")
	public ResponseDto getAllItems() {
		List<Item> items = itemService.getAllItems();
		
		try {
			if(items != null && items.size() > 0) {
				responseDto.setResponseCode(HttpStatus.OK);
				responseDto.setResponseMessage("Total items : " + items.size());
				responseDto.setData(items);
			} else {
				responseDto.setResponseCode(HttpStatus.NO_CONTENT);
				responseDto.setResponseMessage("No orders available.");
				responseDto.setData(items);
			}
		} catch (Exception e) {
			responseDto.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
			responseDto.setResponseMessage("Internal Server error");
			responseDto.setData(e);
		}
		
		return responseDto;
	}
	
	@PostMapping("/saveItem")
	public ResponseDto saveItem(@RequestBody Item item) {
		Item itemSaved = new Item();
		itemSaved = itemService.saveItem(item);
		
		try {
			if(itemSaved != null) {
				responseDto.setResponseCode(HttpStatus.OK);
				responseDto.setResponseMessage("Item saved successfully with the ID: " + item.getId());
				responseDto.setData(itemSaved);
			} else {
				responseDto.setResponseCode(HttpStatus.NO_CONTENT);
				responseDto.setResponseMessage("Error in saving order");
				responseDto.setData(item);
			}
		} catch (Exception e) {
			responseDto.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
			responseDto.setResponseMessage("Internal Server error");
			responseDto.setData(e);
		}
		
		return responseDto;
	}

}
