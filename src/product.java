public class product{
    String product_name;
    String product_id;
    int unit;
    int cost_price;
    int selling_price;

    public product(){}
    public product(String product_id,String product_name,int unit,int cost_price,int selling_price){
        this.product_id = product_id;
        this.product_name = product_name;
        this.unit = unit;
        this.cost_price = cost_price;
        this.selling_price = selling_price;
    }
    public product(String product_id,String product_name,int unit){
        this.product_id = product_id;
        this.product_name = product_name;
        this.unit = unit;
    }


}
