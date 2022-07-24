package com.qa.ims.persistence.dao;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;

public class OrderDAOTest {

	private final OrderDAO DAO = new OrderDAO();
	
	

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

	@Test	
	public void createTest() {
	    HashMap<Long, Integer> items = new HashMap<Long, Integer>();
        Order order1 = new Order(1L, 1, 20d,items);
        items.put((long) 1, 5); 
        Assert.assertEquals(order1, DAO.create(order1));
    }
	
	
}
