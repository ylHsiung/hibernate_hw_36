package tw.leonchen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "house")
public class House {
	
	@Id
	@Column(name = "HOUSEID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int houseid;
	@Column(name = "HOUSENAME")
	private String housename;
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	public House(String housename) {
		super();
		this.housename = housename;
	}
	
	public House(int houseid, String housename) {
		super();
		this.houseid = houseid;
		this.housename = housename;
	}
	public int getHouseid() {
		return houseid;
	}
	public void setHouseid(int houseid) {
		this.houseid = houseid;
	}
	public String getHousename() {
		return housename;
	}
	public void setHousename(String housename) {
		this.housename = housename;
	}
	
	
	
	
}
