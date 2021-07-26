package com.ust.collection.set;


public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private long mobile;
	
	public Emp(int id, String name, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	@Override
	public int compareTo(Emp e) {
		return id - e.getId();
	}
	

	@Override
	public int hashCode() {
		System.out.println("id : " + id);
		return id;
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println(" equal id : " + id);
		return super.equals(obj);
	}


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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "\n[Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}


	

}
