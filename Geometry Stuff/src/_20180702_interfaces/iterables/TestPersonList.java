package _20180702_interfaces.iterables;

public class TestPersonList {

	public static void main(String[] args) {

	    PersonList list = new PersonList();
	    list.add(new Person("Peter", "Braun"));
	    list.add(new Person("Michael", "Roth"));

	    for(Person p : list) {
	        System.out.println(p);
	    }
	}

}
