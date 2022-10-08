package com.comp301.a01sushi;

public class IngredientPortionImpl implements IngredientPortion {

  private Ingredient ingrtype;
  private double ozof;

  public IngredientPortionImpl(Ingredient ingrtype, double ozof) {
    if (ozof < 0) {
      throw new IllegalArgumentException();
    }
    this.ingrtype = ingrtype;
    this.ozof = ozof;
  }

  /**
   * Getter method for the underlying ingredient instance
   *
   * @return the underlying ingredient that this is a portion of
   */
  public Ingredient getIngredient() {
    return ingrtype;
  }

  /**
   * Getter method for the number of ounces of the underlying ingredient that this IngredientPortion
   * represents
   *
   * @return the weight, in ounces, of the underlying ingredient
   */
  public double getAmount() {
    return ozof;
  }

  /**
   * Getter method for the name of the ingredient
   *
   * @return the name of the underlying ingredient as a String
   */
  public String getName() {
    return ingrtype.getName();
  }

  /**
   * Getter method for whether the ingredient is vegetarian
   *
   * @return true if the underlying ingredient is vegitarian; false otherwise
   */
  public boolean getIsVegetarian() {
    return ingrtype.getIsVegetarian();
  }

  /**
   * Getter method which returns true if the ingredient is rice
   *
   * @return true if the underlying ingredient is rice; false otherwise
   */
  public boolean getIsRice() {
    return ingrtype.getIsRice();
  }

  /**
   * Getter method which returns true if the ingredient is shellfish
   *
   * @return true if the underlying ingredient is shellfish; false otherwise
   */
  public boolean getIsShellfish() {
    return (ingrtype.getIsShellfish());
  }

  /**
   * Getter method for the number of calories in the portion
   *
   * @return the unrounded number of calories in the portion
   */
  public double getCalories() {
    return (((double) ingrtype.getCaloriesPerOunce()) * ozof);
  }

  /**
   * Getter method for the price of the portion
   *
   * @return the unrounded price of the portion
   */
  public double getCost() {
    return (((double) ingrtype.getPricePerOunce()) * ozof);
  }

  /**
   * Combines the ingredient portion with another portion of the same ingredient, creating a
   * combined portion of the ingredient.
   *
   * @return If other is null, returns this ingredient portion. If the other ingredient portion is
   *     not the same as this ingredient portion, throws an IllegalArgumentException. Otherwise,
   *     returns a new ingredient portion, representing the combined amounts of this ingredient
   *     portion and the other ingredient portion. HINT: Use the equals() method to test equality.
   */
  public IngredientPortion combine(IngredientPortion other) {
    if (other == null) {
      return this;
    } else {
      if (other.getName() != this.getName()) {
        throw new IllegalArgumentException();
      } else {
        IngredientPortionImpl combined =
            new IngredientPortionImpl(this.getIngredient(), (this.ozof + other.getAmount()));
        return combined;
      }
    }
  }
}
