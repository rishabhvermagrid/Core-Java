package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Account{
    private List<Integer> list = Arrays.asList(1,2,3,4,5);
    public Account(List<Integer> list){
        this.list = new ArrayList<>(list);
    }
    public List<Integer> getList() {
        return new ArrayList<>(list);//defensive copy
    }
}
public class Encapsulation_DefensiveCopy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Account obj  = new Account(list);
        Account obj1 = new Account(list);
        System.out.println(obj.equals(obj1));//false
        System.out.println(obj==obj1);//here obj and obj1 holds the different references

        /*
        Every class has Object as a superclass.
        equals,toString,hashCode

        public boolean equals(Object obj) {
            return (this == obj);
        }
         */
    }
}
