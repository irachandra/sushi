package com.comp301.a01sushi;

public class IngredientImpl implements Ingredient {

  private String name;
  private double priceperoz;
  private double calperoz;
  private boolean isveg;
  private boolean isrice;
  private boolean isshellf;

  public IngredientImpl(
      String name,
      double priceperoz,
      double calperoz,
      boolean isveg,
      boolean isrice,
      boolean isshellf) {
    this.name = name;
    this.priceperoz = priceperoz;
    this.calperoz = calperoz;
    this.isveg = isveg;
    this.isrice = isrice;
    this.isshellf = isshellf;
  }
  /**
   * Getter method for the name of the ingredient
   *
   * @return the name of the ingredient as a String
   */
  public String getName() {
    return name;
  }

  /**
   * Getter method for the number of calories in one dollar's worth of the ingredient
   *
   * @return the number of calories per dollar's worth of the ingredient
   */
  public double getCaloriesPerDollar() {
    double calperdol;
    calperdol = calperoz / priceperoz;
    return calperdol;
  }

  /**
   * Getter method for the number of calories in one ounce of the ingredient
   *
   * @return the number of calories per ounce of the ingredient
   */
  public int getCaloriesPerOunce() {
    return ((int) calperoz);
  }

  /**
   * Getter method for the price of one ounce of the ingredient
   *
   * @return the price per ounce of the ingredient, in dollars
   */
  public double getPricePerOunce() {
    return priceperoz;
  }

  /**
   * Getter method which returns true if the ingredient is vegetarian
   *
   * @return true if the ingredient is vegetarian; false otherwise
   */
  public boolean getIsVegetarian() {
    if (isveg) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Getter method which returns true if the ingredient is rice
   *
   * @return true if the ingredient is rice; false otherwise
   */
  public boolean getIsRice() {
    if (isrice) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Getter method which returns true if the ingredient is shellfish
   *
   * @return true if the ingredient is shellfish; false otherwise
   */
  public boolean getIsShellfish() {
    if (isshellf) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Determines whether the ingredient is the same as another ingredient
   *
   * @return If other is null, returns false; otherwise, compares the name, calories, price (within
   *     1 cent), vegetarian, rice, and shellfish properties of the two ingredients. If all of them
   *     are the same, returns true. If any are different, returns false.
   */
  public boolean equals(Ingredient other) {
    if (other == null) {
      return false;
    } else {
      if (name.equals(other.getName())
          && calperoz == other.getCaloriesPerOunce()
          && priceperoz == other.getPricePerOunce()
          && isveg == other.getIsVegetarian()
          && isrice == other.getIsRice()
          && isshellf == other.getIsShellfish()) {
        return true;
      } else {
        return false;
      }
    }
  }
}
