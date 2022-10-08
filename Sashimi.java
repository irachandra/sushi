package com.comp301.a01sushi;

public class Sashimi implements Sushi {
  public enum SashimiType {
    TUNA,
    YELLOWTAIL,
    EEL,
    CRAB,
    SHRIMP
  };

  private SashimiType type;
  private IngredientPortion[] ingredientsarr;

  public Sashimi(SashimiType type) {
    this.type = type;
    ingredientsarr = new IngredientPortion[1];
    if (type == SashimiType.TUNA) {
      ingredientsarr[0] = new TunaPortion(0.75);
    } else if (type == SashimiType.YELLOWTAIL) {
      ingredientsarr[0] = new YellowtailPortion(0.75);
    } else if (type == SashimiType.EEL) {
      ingredientsarr[0] = new EelPortion(0.75);
    } else if (type == SashimiType.CRAB) {
      ingredientsarr[0] = new CrabPortion(0.75);
    } else if (type == SashimiType.SHRIMP) {
      ingredientsarr[0] = new ShrimpPortion(0.75);
    }
  }

  public String getName() {
    return ((type.toString()).toLowerCase() + " sashimi");
  }

  public IngredientPortion[] getIngredients() {
    return ingredientsarr;
  }

  public int getCalories() {
    return ((int) ingredientsarr[0].getCalories());
  }

  public double getCost() {
    return ingredientsarr[0].getCost();
  }

  public boolean getHasRice() {
    return false;
  }

  public boolean getHasShellfish() {
    return ingredientsarr[0].getIsShellfish();
  }

  public boolean getIsVegetarian() {
    return false;
  }
}
