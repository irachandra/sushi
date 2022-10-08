package com.comp301.a01sushi;

public class RicePortion extends IngredientPortionImpl {
  private double amount;

  public RicePortion(double amount) {
    super(new Rice(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public RicePortion combine(RicePortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      RicePortion combined = new RicePortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
