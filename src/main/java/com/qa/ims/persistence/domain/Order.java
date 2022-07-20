package com.qa.ims.persistence.domain;

public class Order {

	private Long orderId;
	private int customer_id;
	private int orderQuantity;
	private Double totalOrderPrice;
	private int itemId; 

	


	public Order(Long orderId, int customer_id, int orderQuantity, Double totalOrderPrice, int itemId) {
		this.orderId = orderId;
		this.customer_id = customer_id;
		this.orderQuantity = orderQuantity;
		this.totalOrderPrice = totalOrderPrice;
		this.itemId = itemId;
	}
	
	public Order(int customer_id , int orderQuantity, Double totalOrderPrice, int itemId) {
		this.customer_id = customer_id;
		this.orderQuantity = orderQuantity;
		this.totalOrderPrice = totalOrderPrice;
		this.itemId = itemId;
	}
	
	public Order(Long orderId , int orderQuantity, Double totalOrderPrice) {
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
		this.totalOrderPrice = totalOrderPrice;
	}
	
	// orderId, orderQuantity, totalOrderPrice
	


	

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public int getcustomer_id() {
		return customer_id;
	}

	public void setcustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Double getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public void setTotalOrderPrice(Double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}

	public  int getitemId() {
		return itemId;
	}

	public void setitemId(int itemId) {
		this.itemId = itemId;
	}
	
	@Override
	public String toString() {
		return "order id:" + orderId + "customer_id:" + customer_id + "order Quantity:" + orderQuantity + "totalOrderPrice:" + totalOrderPrice + "item Ordered" + itemId;
	}
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + customer_id;
		result = prime * result + orderQuantity;
		result = prime * result + ((totalOrderPrice == null) ? 0 : totalOrderPrice.hashCode());
		result = prime * result + itemId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
//		if (customer == null) {
//			if (other.customer != null)
//				return false;
//		} else if (!customer.equals(other.customer))
//			return false;
		if (orderQuantity != other.orderQuantity) 
				return false;
		if (totalOrderPrice == null) {
			if (other.totalOrderPrice != null)
				return false;
		} else if (!totalOrderPrice.equals(other.totalOrderPrice))
			return false;
//		if (itemId != !itemId.equals(other.itemId) {
//			if (other.itemId != null)
//				return false;
//		} else if (!itemId.equals(other.itemId))
//			return false;
		return true;

	}
	
	
}


