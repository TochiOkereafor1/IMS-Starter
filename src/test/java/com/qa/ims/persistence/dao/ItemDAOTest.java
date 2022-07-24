package com.qa.ims.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {

	private final ItemDAO DAO = new ItemDAO();
	
	

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

	@Test	
	public void testCreate() {
		Item itemTwo = new Item(28L,"Bottle", 20.3D);
		Assert.assertEquals(itemTwo, DAO.create(itemTwo)); 
		//assertNull(DAO.create(null));
	}
	
	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(28L, "Bottle", 20.3D));
		Assert.assertEquals(expected, DAO.readAll());
	}
	
	@Test
    public void readLatestTest() {
        Item itemTwo =  new Item(28L, "Bottle", 20.3D);
        Assert.assertEquals(itemTwo, DAO.readLatest());
    }
	
	@Test
	public void testRead() {
		final long itemId = 28L;
		Assert.assertEquals(new Item(itemId, "Bottle",20.3D), DAO.read(itemId));
	}
	
//	@Test
//	public void testUpdate() {
//		final Item updated = new Item(24L, "Cup", 20.3D);
//		Assert.assertEquals(updated, DAO.update(updated));
//		//10.00D
//    }
	
//	@Test
//	public void testDelete() {
//		Assert.assertEquals(24L, DAO.delete(24L));
//	}
 
	
	 


	
	
}
