package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString()); 
		}
		return orders; 
	}

	
	@Override
	public Order create() {
		LOGGER.info("Please enter customer Id");
		int customer_id = utils.getInteger();
		System.out.println(customer_id);
		LOGGER.info("Please enter your Order Quantity");
		int orderQuantity = utils.getInteger();
		LOGGER.info("Please enter a total price");
		Double totalOrderPrice =utils.getDouble();
		LOGGER.info("Please enter an Item id");
		int itemId =utils.getInteger();
		Order order = orderDAO.create(new Order(customer_id, orderQuantity, totalOrderPrice, itemId)); 
		
		LOGGER.info("Order created");
		return order;
	}

	
	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter the quantity");
		int orderQuantity = utils.getInteger();

		LOGGER.info("Please enter the total price");
		Double totalOrderPrice = utils.getDouble();
		
		Order order = orderDAO.update(new Order(orderId, orderQuantity, totalOrderPrice));
		LOGGER.info("Order Updated");
		return order;
	}
	
	

	
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long orderId = utils.getLong();
		 
		int order = orderDAO.delete(orderId);
		LOGGER.info("order deleted");
		return order;
	}
	
	public Order addToOrder() {
		LOGGER.info("Please enter customer Id");
		int customer_id = utils.getInteger();
		System.out.println(customer_id);
		LOGGER.info("Please enter an Item id");
		int itemId =utils.getInteger();
		LOGGER.info("Please enter your Order Quantity");
		LOGGER.info("Order created");
		boolean choice;
		
		// do you want to add another item 
		// y or n
		// if choice == y 789
		//if choice ==N 
		
		int orderQuantity = utils.getInteger();
		Order order = orderDAO.create(new Order(customer_id, orderQuantity, itemId)); 
		
		LOGGER.info("Order created");
		return order;
	}

	

}
