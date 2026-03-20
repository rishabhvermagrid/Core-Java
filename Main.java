class Person {
    private String name;

    // single instance
    private static final Person instance = new Person();


    // private constructor
    private Person() {}

    // global access point
    public static Person getInstance() {
        return instance;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        // get instance
        Person p1 = Person.getInstance();
        p1.setName("Rishabh");
        p1.setName("Rishab");

        // get instance again
        Person p2 = Person.getInstance();
        p2.setName("dinesh");

        // check values
        System.out.println(p1.getName()); // Rishabh

        // check both references
        System.out.println(p1 == p2); // true
    }
}
/*
Both p1 and p2 point to the same object (only one instance exists).
 */