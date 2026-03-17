package CoreJava;

public class StringClassDetails {
    public static void main(String[] args) {
//        String name =  "rushali";
//        String name1 = "rushali";
//        System.out.println(name==name1);
//        System.out.println(name.equals(name1));
        String key =  new String("rishabh");
        String key1 = new String("rishabh");
        System.out.println(key.equals(key1));//content
        System.out.println(key==key1);

        /*
        public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        return (anObject instanceof String aString)
                && (!COMPACT_STRINGS || this.coder == aString.coder)
                && StringLatin1.equals(value, aString.value);
    }
         */




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



/*
equals(),hashcode(),toString()
package : java.lang
class : Object
In Java, every class implicitly extends Object, so all classes inherit these methods.

equals default implementation in Object class
public boolean equals(Object obj) {
        return (this == obj);
    }

public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

The actual source code of Object.hashCode() is not written in Java—it’s implemented in native code (C/C++) inside the JVM.
native → implemented at JVM level, not in Java
By default, hashCode() typically returns a value based on the object’s memory address (or something derived from it).
memory references and hashCode are two different thingss,s
 */