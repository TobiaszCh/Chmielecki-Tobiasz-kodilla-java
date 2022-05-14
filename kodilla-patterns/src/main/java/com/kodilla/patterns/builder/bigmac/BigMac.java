package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    final private String bun;
    final private int burgers;
    final private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder setBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder setIngredients(String ingredients) {
            this.ingredients.add(ingredients);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }


    public BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
