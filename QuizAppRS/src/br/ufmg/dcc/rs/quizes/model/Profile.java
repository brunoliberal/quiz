package br.ufmg.dcc.rs.quizes.model;

public class Profile {
	private Integer id;
	private int points;
	private int money;
	private String name;
	
	public Profile(int points, int money) {
		this.points = points;
		this.money = money;
	}
	
	public Profile() {
		this.points = 0;
		this.money = 0;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
