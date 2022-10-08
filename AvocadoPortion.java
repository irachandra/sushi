package com.comp301.a01sushi;

public class AvocadoPortion extends IngredientPortionImpl {
  private double amount;

  public AvocadoPortion(double amount) {
    super(new Avocado(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public AvocadoPortion combine(AvocadoPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      AvocadoPortion combined = new AvocadoPortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
