package CoreJava;
class Person {
    private String email;
    private String mobile;


    public Person(String email, String mobile) {
        this.email = email;
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Person)) return false;

        Person other = (Person) obj;

        return email.equals(other.email) &&
                mobile.equals(other.mobile);
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
public class OveridingOfObjectClassMethods {
    public static void main(String[] args) {

        Person obj  = new Person("rishabh@gmail.com","9161143622");
        Person obj1  = new Person("rishabh@gmail.com","9161143622");

        System.out.println(obj.equals(obj1));//false->true


        /*

        toString() : default implementation
        getClass().getName() + "@" + Integer.toHexString(hashCode())
         */
    }
}




