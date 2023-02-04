import java.util.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        ArrayList<Job_applicants> jp = new ArrayList<>();

        Job_applicants c = new Job_applicants("12","chris",24,2);
        Job_applicants c1 = new Job_applicants("1","John",17,2);
        Job_applicants c2 = new Job_applicants("2","Sarah",20,3);
        jp.add(c);
        jp.add(c1);
        jp.add(c2);

        store st = new store();
        st.set_applicants(jp);

        manager mg = new manager();
        mg.setQualified_applicants();
        mg.hireCashier("2");
        mg.check();


    }
}