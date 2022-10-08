package com.comp301.a01sushi;

public class SeaweedPortion extends IngredientPortionImpl {
  private double amount;

  public SeaweedPortion(double amount) {
    super(new Seaweed(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public SeaweedPortion combine(SeaweedPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      SeaweedPortion combined = new SeaweedPortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
