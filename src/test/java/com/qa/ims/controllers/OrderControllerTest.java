package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.CustomerController;
import com.qa.ims.controller.ItemController;
import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrderDAO DAO;

	@InjectMocks
	private OrderController orderController;

	@Test
	public void testCreate() {
		HashMap<Long, Integer> items = new HashMap<Long, Integer>();
        Order orderOne = new Order(1L, 1, 20d,items);
        items.put((long) 1, 5); 
        Assert.assertEquals(orderOne, DAO.create(orderOne));

//		Mockito.when(utils.getLong()).thenReturn(ITEM_NAME);
//		Mockito.when(utils.getDouble()).thenReturn(ITEM_VALUE);
//		Mockito.when(DAO.create(created)).thenReturn(created);
//
//		assertEquals(created, controller.create());
//
//		Mockito.verify(utils, Mockito.times(1)).getString();
//		Mockito.verify(utils, Mockito.times(1)).getDouble();
//		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

//	@Test
//	public void testReadAll() {
//		List<Item> items = new ArrayList<>();
//		items.add(new Item (1L, "pencil", 4.00));
//
//		Mockito.when(dao.readAll()).thenReturn(items);
//
//		assertEquals(items, controller.readAll());
//
//		Mockito.verify(dao, Mockito.times(1)).readAll();
//	}



}
