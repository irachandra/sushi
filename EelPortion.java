package com.comp301.a01sushi;

public class EelPortion extends IngredientPortionImpl {
  private double amount;

  public EelPortion(double amount) {
    super(new Eel(), amount);
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  public EelPortion combine(EelPortion other) {
    if (other == null) {
      return this;
    } else if (other.getName() != this.getName()) {
      throw new IllegalArgumentException();
    } else {
      EelPortion combined = new EelPortion(this.getAmount() + other.getAmount());
      return combined;
    }
  }
}
