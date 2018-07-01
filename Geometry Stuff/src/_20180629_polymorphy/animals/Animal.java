package _20180629_polymorphy.animals;

public abstract class Animal {
	
	private int age;
	private String name;
	private boolean healthy;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHealthy() {
		return healthy;
	}

	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	
	
	public abstract void walk();

}
