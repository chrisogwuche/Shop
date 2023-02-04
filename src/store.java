import java.util.*;

public class store {
    static ArrayList<product> productList = new ArrayList<>();
    static ArrayList<Job_applicants> applicantList = new ArrayList<>();
    private static int account_balance = 0;
    private static int profit_loss = 0;
    private static int total_sells = 0;
    private static int total_cost = 0;

    public store(){}
    public store(ArrayList<product> productList){
        this.productList = productList;
    }
    public void set_applicants(ArrayList<Job_applicants> applicantList){
        this.applicantList = applicantList;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
        total_cost+=total_cost;
    }

    public void setTotal_sells(int total_sells) {
        this.total_sells = total_sells;
        total_sells+=total_sells;
    }

    public void setAccount_balance() {
        account_balance = total_sells;
    }

    public void setProfit_loss() {
        profit_loss += (total_sells-total_cost);
    }
    public int getAccount_balance(){
        return account_balance;
    }
    public int getProfit_loss(){
        return profit_loss;
    }
    public int getTotal_sells(){
        return total_sells;
    }
    public int getTotal_cost(){
        return total_cost;
    }
}
