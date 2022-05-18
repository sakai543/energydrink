package jp.co.sss.energy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "drink")
public class Drink {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_drink_gen")
	@SequenceGenerator(name = "seq_drink_gen", sequenceName = "seq_drink", allocationSize = 1)
	private Integer id;

	@Column
	private String name;
	@Column
	private Integer price;
	@Column
	private Integer cafein;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getCafein() {
		return cafein;
	}

	public void setCafein(Integer cafein) {
		this.cafein = cafein;
	}
}
