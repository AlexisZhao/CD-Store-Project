/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

public class Product implements Serializable{
	
	private String cdid;
	private int price;
	private String title;
	private String category;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCdid() {
		return cdid;
	}
	public void setCdid(String cdid) {
		this.cdid = cdid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}

