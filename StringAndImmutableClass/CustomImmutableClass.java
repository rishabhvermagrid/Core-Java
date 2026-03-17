package StringAndImmutableClass;

public class CustomImmutableClass {
    public static void main(String[] args) {
        String name =  "rushali";
        String name1 = "rushali";
        System.out.println(name==name1);

        //  immutable :: once an object is created its value can not be changed -> no modification methods exist
        //  char sequence :: an array of char
        //  string constant pool  :: string literals -> rushali , if a literals exist then it will not create new object it will point to same
        //  equals :: returns true if literals are same else false
        //  == :: if both the object pointing to same then true else false

        // String class:  final -> means you can not subclass it
        // array of chars :: final -> constant
            // The reference to the array cannot change after initialization.
            // It must be assigned only once in the constructor.
        // fields are private, no setters


        /*
        How to make a class immutable
         class -> final
         all fields should be priavte final
         intialiaze only through constructor
         no use of setters
         getters create
         */

        // All are immutable
        //  String,Integer LocalDate, BigDecimal



        //      --------------doubts------
        //  thread safe ::
        //  intern
        //  equals()
        //  hashCode()
        //  toString()
                // @Override
                // public String toString() {
                //    return name + " " + age;
                //}



    }
}
