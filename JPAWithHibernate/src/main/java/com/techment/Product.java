package com.techment;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="product500")
@Entity
public class Product {

		@Id
		private int id;
		private String name;
		private String category;
		private int price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		
	}


