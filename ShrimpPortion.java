package com.comp301.a01sushi;

public class ShrimpPortion extends IngredientPortionImpl {
  private double amount;

  public ShrimpPortion(double amount) {
    super(new Shrimp(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public ShrimpPortion combine(ShrimpPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      ShrimpPortion combined = new ShrimpPortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
