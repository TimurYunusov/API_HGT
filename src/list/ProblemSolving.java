package list;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProblemSolving {
    public static void main(String[] args) {
        //Create a method with will take a List of Strings for employees
        //and second param will

List<String> products = new ArrayList<>();
products.add("Avocado");
        products.add("Zucchini");
        products.add("Eggplant");
        products.add("Corn");
        products.add("Cucumber");
newProductAdder(products,"Tomato");
        System.out.println(products);

    }
    public static void newProductAdder(List<String> products, String newProduct){
        if(!products.contains(newProduct)){
            products.add(newProduct);
        } else  {
            System.out.println(newProduct+" Already exists");
        }

    }
}
