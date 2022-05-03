package com.abc.OnlinePlantStore1.entity;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String name;
	private int cost;
	private String PlantType;
	

	@Embedded
	@Column(nullable = true)
	private Discounts discount;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int iD, String name, int cost, String plantType) {
		super();
		ID = iD;
		this.name = name;
		this.cost = cost;
		PlantType = plantType;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getPlantType() {
		return SportType;
	}
	public void setPlantType(String plantType) {
		PlantType = plantType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID, PlantType, cost, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return ID == other.ID && Objects.equals(PlantType, other.PlantType) && cost == other.cost
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", name=" + name + ", cost=" + cost + ", PlantType=" + PlantType + "]";
	}
	
	
	

}