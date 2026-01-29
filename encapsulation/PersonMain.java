package encapsulation;

public class PersonMain {

	    public static void main(String[] args) {
	        Person p = new Person();

	        p.setName("Mangesh");
	        p.setAge(20);

	        System.out.println("Name: " + p.getName());
	        System.out.println("Age: " + p.getAge());
	    }
}

