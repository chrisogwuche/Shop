import java.util.ArrayList;

public class customer{
    public String customer_name;
    public int money_at_hand;
    ArrayList<product> buyList = new ArrayList<>();
    public customer(String customer_name,int money_at_hand){
        this.customer_name = customer_name;
        this.money_at_hand = money_at_hand;
    }
    public void buyItems(ArrayList<product> buyList){
        this.buyList = buyList;
    }
}
