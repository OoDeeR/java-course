package _20180629_polymorphy.animals;

public class Dog extends Animal{
	
	public Dog(int age, String name, boolean healthy) {
		this.setAge(age);
		this.setName(name);
		this.setHealthy(healthy);
		
	}

	@Override
	public void walk() {
		System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " walks.");		
		
	}

}
