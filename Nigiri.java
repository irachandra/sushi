package com.comp301.a01sushi;

public class Nigiri implements Sushi {
  public enum NigiriType {
    TUNA,
    YELLOWTAIL,
    EEL,
    CRAB,
    SHRIMP
  };

  private NigiriType type;
  private IngredientPortion[] ingredientsarr;

  public Nigiri(NigiriType type) {
    this.type = type;
    ingredientsarr = new IngredientPortion[2];
    if (type == NigiriType.TUNA) {
      ingredientsarr[0] = new TunaPortion(0.75);
      ingredientsarr[1] = new RicePortion(0.5);
    } else if (type == Nigiri.NigiriType.YELLOWTAIL) {
      ingredientsarr[0] = new YellowtailPortion(0.75);
      ingredientsarr[1] = new RicePortion(0.5);
    } else if (type == Nigiri.NigiriType.EEL) {
      ingredientsarr[0] = new EelPortion(0.75);
      ingredientsarr[1] = new RicePortion(0.5);
    } else if (type == Nigiri.NigiriType.CRAB) {
      ingredientsarr[0] = new CrabPortion(0.75);
      ingredientsarr[1] = new RicePortion(0.5);
    } else if (type == Nigiri.NigiriType.SHRIMP) {
      ingredientsarr[0] = new ShrimpPortion(0.75);
      ingredientsarr[1] = new RicePortion(0.5);
    }
  }

  public String getName() {
    return (((type.toString()).toLowerCase()) + " nigiri");
  }

  public IngredientPortion[] getIngredients() {
    return ingredientsarr;
  }

  public int getCalories() {
    return ((int) (ingredientsarr[0].getCalories() + ingredientsarr[1].getCalories()));
  }

  public double getCost() {
    return (ingredientsarr[0].getCost() + ingredientsarr[1].getCost());
  }

  public boolean getHasRice() {
    return true;
  }

  public boolean getHasShellfish() {
    return ingredientsarr[0].getIsShellfish();
  }

  public boolean getIsVegetarian() {
    return false;
  }
}
