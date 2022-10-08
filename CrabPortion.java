package com.comp301.a01sushi;

public class CrabPortion extends IngredientPortionImpl {
  private double amount;

  public CrabPortion(double amount) {
    super(new Crab(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public CrabPortion combine(CrabPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      CrabPortion combined = new CrabPortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
