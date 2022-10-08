package com.comp301.a01sushi;

public class TunaPortion extends IngredientPortionImpl {
  private double amount;

  public TunaPortion(double amount) {
    super(new Tuna(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public TunaPortion combine(TunaPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      TunaPortion combined = new TunaPortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
