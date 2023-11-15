package home_task_23_11_14.task_1.pizza;

/* Создайте класс Пицца с минимум 5 полями.
Реализуйте внутренний класс-строитель, помогающий компоновать объект Пицца.*/
public class Pizza {
    private final String pizzaBase;
    private final String sauce;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;

    private Pizza(Builder builder) {
        this.pizzaBase = builder.pizzaBase;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    public String getPizzaBase() {
        return pizzaBase;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPeperoni() {
        return pepperoni;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaBase='" + pizzaBase + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese=" + cheese +
                ", peperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                '}';
    }
    public static class Builder {
        private String pizzaBase;
        private String sauce;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        public Builder pizzaBase(String pizzaBase) {
            this.pizzaBase = pizzaBase;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}
