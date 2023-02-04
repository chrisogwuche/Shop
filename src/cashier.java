import java.util.ArrayList;

public class cashier extends staff{
    ArrayList<product> confirmed_ItemList = new ArrayList<>();

    public cashier(String cashier_id,String cashier_name,int age ) {
        super(cashier_id,cashier_name,age);
    }
    public void setConfirmed_ItemList(ArrayList<product> buyList){
        for(product a: buyList){
            for(product x: productList){
                if (a.product_id.equals(x.product_id)){
                    int new_unit = x.unit - a.unit;
                    while(true){
                        if(new_unit < 0){
                            break;
                        }
                        else{
                            confirmed_ItemList.add(a);
                        }
                    }
                }
            }
        }
    }

    public void sellItems(){

    }
}
