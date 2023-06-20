package caffemanagmentsystemfinal;

import java.util.ArrayList;
import java.util.ListIterator;

public class CafeMangnage {

    static final double LATTLE = 5.3;
    static final double ICED_LATTLE = 1.5;
    static final double ESPRESSO = 6;
    static final double CAPP = 2;
    static final double ICED_CAPP = 3.5;
    static final double COFFE_CAKE = 8;
    static final double RED_VEL_CAKE = 10;
    static final double BOSTOM_CREAM_PIE = 20.5;
    static final double BLACK_FOREST_CAKE = 15;
    static final double LAGOS_CHOCOLATE_CAKE = 30;
    static final double KILBURN_CAKE = 26;
    static final double CARLTON_CAKE = 33;
    static final double QUEEN_CAKE = 50;
    static final double SERCICE_CHARGE = 1.50;
    static double costOfCake, costOfDrink;

    ArrayList< Product> pro = null;

    public CafeMangnage() {
        pro = new ArrayList<Product>();
        costOfCake = 0;
        costOfDrink = 0;
    }

    boolean checkWriteORNot() {
        return pro.size() > 0;
    }

    void addPro(String name, int amount, double cost, char Type) {

        Product newPro = new Product(name, amount, cost, Type);
        if (Type == 'D') {
            costOfDrink += newPro.cost;
        } else {
            costOfCake += newPro.cost;
        }
        pro.add(newPro);
    }

    void removePro(String name) {
        ListIterator<Product> itPro = pro.listIterator();
        while (itPro.hasNext()) {
            Product found = itPro.next();
            if (found.name.equals(name)) {
                if (found.isDrink()) {
                    costOfDrink -= found.cost;
                } else {
                    costOfCake -= found.cost;
                }
                itPro.remove();
            }
        }
    }

    double subTotal() {
        return costOfCake + costOfDrink + SERCICE_CHARGE;
    }

    double Total() {

        return subTotal() + 0.6;
    }

    String drinks(String billText) {
        boolean isOrderCake = false;
        billText += "Drinks:\n\t\tNo.\tCost\n";
        String cakes = "\n===========================================\nCakes:\n\t\tNo.\tCost";
        for (Product x : pro) {
            if (x.amount > 0) {
                if (x.Type == 'D') {
                    billText += "\n" + x.name + " \t\t" + x.amount + "\t" + x.cost;
                } else {
                    isOrderCake = true;
                    cakes += "\n" + ((x.name.length() < 11) ? x.name + "    " : x.name) + " \t" + x.amount + "\t" + x.cost;
                }
            }
        }
        if (isOrderCake) {
            billText += cakes + "\n\n===========================================\nSubTotal : " + subTotal() + "\nTotal : " + Total();
        } else {
            billText += "\n\n===========================================\nSubTotal : " + subTotal() + "\nTotal : " + Total();
        }

        return billText;
    }

}
