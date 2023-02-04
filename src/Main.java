import java.util.*;
public class Main {
    public static void main(String[] args) {
//        ArrayList<Job_applicants> jp = new ArrayList<>();
//
//        Job_applicants c = new Job_applicants("12","chris",24,2);
//        Job_applicants c1 = new Job_applicants("1","John",17,2);
//        Job_applicants c2 = new Job_applicants("2","Sarah",20,3);
//        jp.add(c);
//        jp.add(c1);
//        jp.add(c2);
//
//        store st = new store();
//        st.set_applicants(jp);
//
//        manager mg = new manager();
//        mg.setQualified_applicants();
//        mg.hireCashier("2");
//        // NB: the newly generated id for cashier is 10
//        mg.fireCashier("10");
//        mg.check();

        customer cs = new customer("Chris",1000);
        ArrayList<product> jp = new ArrayList<>();
        product pd = new product("12","milk",5,50,55);
        product h = new product("11","garri",3,10,15);
        product d = new product("10","Bonvinta",5,60,70);

        jp.add(pd);
        jp.add(h);
        jp.add(d);

        store s = new store(jp);

        ArrayList<product> buy = new ArrayList<>();
        product r = new product("12","milk",5);
        product ri = new product("10","Bonvinta",2);
        buy.add(r);
        buy.add(ri);

        cashier cash = new cashier();
        cash.setConfirmed_ItemList(buy);
        cash.check();
        cash.sellItems();
//
//        store store = new store();
//        store.setProfit_loss();
//        store.setAccount_balance();
//
//        manager mg = new manager();
//        mg.check();
    }
}