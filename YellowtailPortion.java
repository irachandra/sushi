package com.comp301.a01sushi;

public class YellowtailPortion extends IngredientPortionImpl {
  private double amount;

  public YellowtailPortion(double amount) {
    super(new Yellowtail(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public YellowtailPortion combine(YellowtailPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      YellowtailPortion combined = new YellowtailPortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
