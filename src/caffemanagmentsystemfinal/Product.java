
package caffemanagmentsystemfinal;

class Product {
   String name;
    int amount;
    double cost;
    char Type ='D';
    public Product(String name, int amount, double cost,char Type) {
        this.name = name;
        this.amount = amount;
        this.cost = cost*amount;
        this.Type = Type;
    }
    boolean isDrink(){
        return this.Type  == 'D';
    }
    boolean isCake(){
        return this.Type  == 'C';
    }
    
}
