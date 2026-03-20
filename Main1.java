import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Account{
    private int ac_no;
    private String holder_name;

    public int getAc_no() {
        return ac_no;
    }

    public void setAc_no(int ac_no) {
        this.ac_no = ac_no;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public Account(String holder_name, int ac_no) {
        this.holder_name = holder_name;
        this.ac_no = ac_no;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof Account)) return false;
        Account other = (Account)obj;
//        Integer a = other.ac_no;
//        Integer b = ac_no;
//        return holder_name.equals(other.holder_name) && a.equals(b);
        return ac_no == other.ac_no &&
                Objects.equals(holder_name, other.holder_name);
    }

    //wrapper class int -> Integer
    /*
    @Override
    public int hashCode(){
        Integer a = ac_no;
        return holder_name.hashCode()+a.hashCode();
    }
     */

    @Override
    public int hashCode() {
        return Objects.hash(ac_no, holder_name);
    }
}
public class Main1{
    public static void main(String[] args) {
        Account obj1 = new Account("rishabh",101);
        Account obj2 = new Account("rishabh",101);
        System.out.println(obj1.equals(obj2));//false -> true
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        Set<Account> set = new HashSet<>();
        set.add(obj1);
        set.add(obj2);
        System.out.println(set.size());
    }
}
//agr do object equal h equals() ke hisaab se to unka hashcode bhi same hona chahiye