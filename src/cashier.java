import java.util.ArrayList;

public class cashier extends staff{
    ArrayList<product> confirmed_ItemList = new ArrayList<>();

    public cashier(){}
    public cashier(String cashier_id,String cashier_name,int age ) {
        super(cashier_id,cashier_name,age);
    }
    public void setConfirmed_ItemList(ArrayList<product> buyList){
        int flag = 0;
        int unit = 0;
        for(product a: buyList){
            for(product x: productList){
                if (a.product_id.equals(x.product_id)){
                    int new_value = x.unit - a.unit;
                    if(new_value >= 0){
                        x.unit = new_value;
                        confirmed_ItemList.add(new product(a.product_id,a.product_name,a.unit,x.cost_price,x.selling_price));
                    }
                    else{
                        flag =1;
                        unit = x.unit;
                    }
                }
            }
            if(flag == 1){
                System.out.println(a.product_name +" have available unit of "+unit+ " . your demand is higher. Please select again ");
                break;
            }
        }

    }

    public void sellItems(){
        int total_cost_price = 0;
        int total_selling_price = 0;
        String receipt = "";

        for(product a: confirmed_ItemList){
            System.out.println("selling price"+a.selling_price);

            receipt+=a.product_name +" : " + a.selling_price+"$"+" : "+a.unit +"\n";
            total_selling_price += (a.selling_price * a.unit);
            total_cost_price += (a.cost_price* a.unit);
        }
        setTotal_cost(total_cost_price);
        setTotal_sells(total_selling_price);

        System.out.println("RECEIPT \n" +receipt +"\n" +"TOTAL: "+total_selling_price +"$");
    }
    public void check(){
        for(product a: confirmed_ItemList){
            System.out.println(a.product_name);
            System.out.println(a.product_id);
            System.out.println(a.unit);
        }
//        for(product a: productList){
//            System.out.println(a.product_name);
//            System.out.println(a.product_id);
//            System.out.println(a.unit);
//            System.out.println(a.selling_price);
//            System.out.println(a.cost_price);
//        }
    }
}
