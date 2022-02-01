package org.iesalixar.aleal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ORDERS")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116016195563249854L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="CUSTOMER_ID")
	private long customerId;
	
	@Column(name="TOTAL_PRICE")
	private double totalPrice;
	
	@Column(name="ORDER_DATE")
	@Temporal (value= TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="CUSTOMER_ID", referencedColumnName="ID",
				insertable=false,updatable=false)
	private Customer customer;

	public Order(long customerId, double totalPrice, Date orderDate) {
		super();
		this.customerId = customerId;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
	}

	public Order() {
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (customerId ^ (customerId >>> 32));
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (customerId != other.customerId)
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", totalPrice=" + totalPrice + ", orderDate="
				+ orderDate + ", customer=" + customer.getId() + "]";
	}
	
	
}
