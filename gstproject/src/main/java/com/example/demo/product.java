package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class product {
	@Id
	
int prod_id;
String prod_name;
int prod_cost;
String prod_desc;



public String getProd_desc() {
	return prod_desc;
}
public void setProd_desc(String prod_desc) {
	this.prod_desc = prod_desc;
}
public int getProd_cost() {
	return prod_cost;
}
public void setProd_cost(int prod_cost) {
	this.prod_cost = prod_cost;
}
public int getProd_id() {
	return prod_id;
}
public void setProd_id(int prod_id) {
	this.prod_id = prod_id;
}
public String getProd_name() {
	return prod_name;
}
public void setProd_name(String prod_name) {
	this.prod_name = prod_name;
}

}
