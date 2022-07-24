package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.qa.ims.persistence.dao.ItemDAO;

import nl.jqno.equalsverifier.EqualsVerifier;

public class ItemTest {

	
	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Item.class).verify();
	}
	@Test
	public void itemTest() {
        Item items = new Item("Bottle", 20.0D);
        assertEquals("Bottle", items.getItemName());
        assertEquals(20.0, items.getItemValue(), 5);
    }
	
	
	@Test
    public void itemTestOne() {
        Item itemOne = new Item(1L, "Bottle",20.0);
        assertEquals(Long.valueOf(1), itemOne.getItemId());
        assertEquals("Bottle", itemOne.getItemName());
        assertEquals(20.0, itemOne.getItemValue(), 5);

    }
	
	
	@Test
	public void setItemIdTest() {
	        Item itemTwo = new Item();
	        itemTwo.setItemId(1L);
	        assertEquals(Long.valueOf(1L), itemTwo.getItemId());
	}
	
	@Test
	public void setItemNameTest() {
	        Item itemThree = new Item();
	        itemThree.setItemName("Bottle");
	        assertEquals("Bottle", itemThree.getItemName());
	}
	 
	 @Test
    public void setItemValueTest() {
	        Item itemFour = new Item();
	        itemFour.setItemValue(20.0);
	        assertEquals(20.0, itemFour.getItemValue(), 5);
	}
	 
	 
	 @Test
	public void toStringTest() {
	        Item itemFive = new Item(1L, "Bottle", 20.0);
	        String expectedOutput = "Item Id: 1, Item name: Bottle, Item Price: 20.0";
	        assertEquals(expectedOutput, itemFive.toString());
	}	
	
}
