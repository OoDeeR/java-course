package _20180629_polymorphy.animals;

public class Test {

	public static void main(String[] args) {
		Animal animal1 = new Dog(5,"Rex",true);
		Animal animal2 = new Cat(10,"Tom",true);
		Cat animal3 = new Cat(12,"Sylvester",false);
		Dog animal4 = new Dog(6,"Rantanplan",true);
		print(animal1);
		animal1.walk();
		print(animal2);
		animal2.walk();
		print(animal3);
		animal3.walk();
		print(animal4);
		animal4.walk();
	}
	
	static void print(Animal x) {
		System.out.println(x.getClass().getSimpleName() + ". Name: " + x.getName());
	}

}
