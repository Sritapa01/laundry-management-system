package com.laundry.model;

import com.laundry.enums.LaundryOrderStatus;


import java.time.LocalDate;


public class LaundryOrder {
    private Integer id;
    private String userName;
    private Integer userId;
    private Integer numberOfCloths;
    private String clothItems;
    private LaundryOrderStatus status;
    private LocalDate orderDate;
    private LocalDate finishDate;
    private Integer amount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getNumberOfCloths() {
		return numberOfCloths;
	}
	public void setNumberOfCloths(Integer numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}
	public String getClothItems() {
		return clothItems;
	}
	public void setClothItems(String clothItems) {
		this.clothItems = clothItems;
	}
	public LaundryOrderStatus getStatus() {
		return status;
	}
	public void setStatus(LaundryOrderStatus status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
