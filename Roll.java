package com.comp301.a01sushi;

public class Roll implements Sushi {
  private IngredientPortion[] roll_ingredients;
  private String name;

  public Roll(String name, IngredientPortion[] roll_ingredients) {
    int tmp[] = new int[9];
    this.name = name;
    this.roll_ingredients = roll_ingredients.clone();
    for(IngredientPortion i: roll_ingredients){
      if(i.getName().equals("avocado")){
        tmp[0]++;
      }
    }
  }

  public String getName() {
    return (this.name);
  }

  public IngredientPortion[] getIngredients() {
    return roll_ingredients.clone();
  }

  public int getCalories() {
    double totcal = 0.0;
    for (IngredientPortion itemi : roll_ingredients) {
      totcal += itemi.getCalories();
    }
    return ((int) totcal);
  }

  public double getCost() {
    double totcost = 0.0;
    for (IngredientPortion itemi : roll_ingredients) {
      totcost += itemi.getCost();
    }
    return totcost;
  }

  public boolean getHasRice() {
    for (IngredientPortion canbe : roll_ingredients) {
      if (canbe.getIsRice()) {
        return true;
      }
    }
    return false;
  }

  public boolean getHasShellfish() {
    for (IngredientPortion canbe : roll_ingredients) {
      if (canbe.getIsShellfish()) {
        return true;
      }
    }
    return false;
  }

  public boolean getIsVegetarian() {
    for (IngredientPortion canbe : roll_ingredients) {
      if (!(canbe.getIsVegetarian())) {
        return false;
      }
    }
    return true;
  }
}
