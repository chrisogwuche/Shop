import java.util.*;

public class store {
    static ArrayList<product> productList = new ArrayList<>();
    static ArrayList<Job_applicants> applicantList = new ArrayList<>();
    int account_balance;
    int profit_loss;

    public store(){}
    public store(ArrayList<product> productList){
        this.productList = productList;
        this.account_balance = 0;
        this.profit_loss = 0;
    }
    public void set_applicants(ArrayList<Job_applicants> applicantList){
        this.applicantList = applicantList;
    }
}
