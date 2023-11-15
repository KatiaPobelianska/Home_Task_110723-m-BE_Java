package home_task_23_11_14.task_1.main;

import home_task_23_11_14.task_1.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .pizzaBase("Thin")
                .pepperoni(true)
                .cheese(true)
                .sauce("Tomato")
                .mushrooms(true)
                .build();
        System.out.println(pizza);


    }
}
