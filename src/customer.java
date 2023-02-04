import java.util.ArrayList;

public class customer{
    public String customer_name;
    private static int money_at_hand;
    public customer(){}
    public customer(String customer_name,int money_at_hand){
        this.customer_name = customer_name;
        this.money_at_hand = money_at_hand;
    }

    public void setMoney_at_hand(int money_at_hand) {
        this.money_at_hand = money_at_hand;
    }

    public int getMoney_at_hand() {
        return money_at_hand;
    }
}
