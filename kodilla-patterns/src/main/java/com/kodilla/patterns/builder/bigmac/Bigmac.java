package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            List<String> possibleBuns = new ArrayList<>();
            possibleBuns.add("Bun with sesame seeds");
            possibleBuns.add("Regular bun");

            if (possibleBuns.contains(bun)) {
                this.bun = bun;
            } else {
                System.out.println("Possible bun options are:");
                System.out.println(possibleBuns);
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            List<String> possibleSauces = new ArrayList<>();
            possibleSauces.add("Standard");
            possibleSauces.add("1000 islands");
            possibleSauces.add("Barbecue");

            if (possibleSauces.contains(sauce)) {
                this.sauce = sauce;
            } else {
                System.out.println("Possible sauce options are:");
                System.out.println(possibleSauces);
            }
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            List<String> possibleIngredients = new ArrayList<>();
            possibleIngredients.add("Lettuce");
            possibleIngredients.add("Onion");
            possibleIngredients.add("Bacon");
            possibleIngredients.add("Cucumber");
            possibleIngredients.add("Chili pepper");
            possibleIngredients.add("Mushrooms");
            possibleIngredients.add("Prawns");
            possibleIngredients.add("Cheese");

            if (possibleIngredients.contains(ingredient)) {
                ingredients.add(ingredient);
            } else {
                System.out.println("Possible ingredients are:");
                System.out.println(possibleIngredients);
            }
            return this;
        }

        public Bigmac build() {
            if (bun != null && burgers > 0 && sauce != null) {
                return new Bigmac(bun, burgers, sauce, ingredients);
            } else {
                System.out.println("Some key ingredients are missing! Try again!");
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
