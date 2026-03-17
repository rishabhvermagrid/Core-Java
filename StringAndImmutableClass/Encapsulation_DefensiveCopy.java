package StringAndImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Account{
    private List<Integer> list = Arrays.asList(1,2,3,4,5);

    public List<Integer> getList() {
        return new ArrayList<>(list);//defensive copy
    }
}
public class Encapsulation_DefensiveCopy {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.getList().set(0,10);
        System.out.println(obj.getList());
    }
}
