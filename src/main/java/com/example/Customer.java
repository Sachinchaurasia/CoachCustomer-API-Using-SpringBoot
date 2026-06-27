package com.example;
import jakarta.persistence.*;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private int height;
	
	private int weight;
@ManyToOne
@JoinColumn(name="coach_id")
private Coach coach;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
