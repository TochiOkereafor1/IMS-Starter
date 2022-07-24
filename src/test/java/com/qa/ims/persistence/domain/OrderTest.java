package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest {
	
	
//	private long Quantity; 
//	private Integer itemId;
	//private HashMap<Long, Integer> items = new HashMap<Long, Integer>();

	
	
	 @Test
	    public void orderTest() {
		    HashMap<Long, Integer> items = new HashMap<Long, Integer>();
	        Order order1 = new Order(1L, 1, 20d,items);
	        items.put((long) 1, 5); 
	        Assert.assertEquals(Long.valueOf(1), order1.getOrderId());
	    }
	 
	 @Test
	    public void ordertwoTest() {
		    HashMap<Long, Integer> items = new HashMap<Long, Integer>();
	        Order order2 = new Order(1, 20d,items);
	        items.put((long) 1, 5); 
	        assertEquals(Long.valueOf(1), order2.getOrderId());
	    }
	 
	 @Test
	    public void orderthreeTest() {
	        Order order3 = new Order(1L, 20d);
	        assertEquals(Long.valueOf(1L), order3.getOrderId());
	        assertEquals(Double.valueOf(20D), order3.getOrderId());
	    }
	 
	 @Test
	    public void orderfourTest() {
		    HashMap<Long, Integer> items = new HashMap<Long, Integer>();
	        Order order4 = new Order(1, items, 20d);
	        items.put((long) 1, 5); 
	        assertEquals(Long.valueOf(1), order4.getOrderId());
	    }
	 
	 
	 
	 

	
}
