// Program Name: BreakfastFood.java
/* Description: 18.5 Program It: Breakfast Lab Activity 2 */
// Programmer:
// Date: 2/1/2021
/**
 * This goes with Activity 2, Question 6.
 * Copy all of this into Question 6 when complete.
 * After you create this class, you'll want to work on TestBreakfastFood.java
 * 
 *
 */
public class BreakfastFood
{
  // Instance variables go here. (look at your answers to question 5)

  private String typeFood;
  private int calorieCount;
  private int proteinCount;
  private int fatCount;
  private int sodiumCount;
  private double fiberCount;
  private double carbCount;
  private int sugarCount;
  private int potasCount;
  private int vitaminCount;
  private int shelfNum;
  private double weight;
  private double cups;
  private double rating;

  // Constructor(s) go here

  // This is a default constructor.
  public BreakfastFood()
  {
    typeFood = "";
    calorieCount = 0;
    proteinCount = 0;
    fatCount = 0;
    sodiumCount = 0;
    fiberCount = 0.0;
    carbCount = 0.0;
    sugarCount = 0;
    potasCount = 0;
    vitaminCount = 0;
    shelfNum = 0;
    weight = 0.0;
    cups = 0.0;
    rating = 0.0;
  }

  // This constructor requires every value to be inputted.
  public BreakfastFood(String typeFood2, int calorieCount2, int proteinCount2,
    int fatCount2, int sodiumCount2, double fiberCount2, double carbCount2,
    int sugarCount2, int potasCount2, int vitaminCount2, int shelfNum2,
    double weight2, double cups2, double rating2)
  {
    this.typeFood = typeFood2;
    this.calorieCount = calorieCount2;
    this.proteinCount = proteinCount2;
    this.fatCount = fatCount2;
    this.sodiumCount = sodiumCount2;
    this.fiberCount = fiberCount2;
    this.carbCount = carbCount2;
    this.sugarCount = sugarCount2;
    this.potasCount = potasCount2;
    this.vitaminCount = vitaminCount2;
    this.shelfNum = shelfNum2;
    this.weight = weight2;
    this.cups = cups2;
    this.rating = rating2;
  }

  // This constructor only requires 4 values.
  public BreakfastFood(int calorieCount2, int shelfNum2, double cups2,
    double rating2, int proteinCount2)
  {
    this.calorieCount = calorieCount2;
    this.shelfNum = shelfNum2;
    this.cups = cups2;
    this.rating = rating2;
    this.proteinCount = proteinCount2;

    typeFood = "";
    fatCount = 0;
    sodiumCount = 0;
    fiberCount = 0.0;
    carbCount = 0.0;
    sugarCount = 0;
    potasCount = 0;
    vitaminCount = 0;
    weight = 0.0;
  }

  // Here's the toString() method.

  public String toString()
  {
    return (String) ("Type: " + typeFood + "\nCalories: " + calorieCount
      + "\nProtein: " + proteinCount + "\nFat: " + fatCount + "\nSodium: "
      + sodiumCount + "\nFiber: " + fiberCount + "\nCarb: " + carbCount
      + "\nSugar: " + sugarCount + "\nPotassium: " + potasCount + "\nVitamin: "
      + vitaminCount + "\nShelf: " + shelfNum + "\nWeight: " + weight
      + "\nCups: " + cups + "\nRating: " + rating + "\n");
  }

  // Here's the protein to calorie ratio method.

  public double getProtCalRatio()
  {
    return (this.proteinCount / this.calorieCount);
  }

  // Accessor methods

  public String getTypeFood()
  {
    return typeFood;
  }

  public int getCalorieCount()
  {
    return calorieCount;
  }

  public int getProteinCount()
  {
    return proteinCount;
  }

  public int getFatCount()
  {
    return fatCount;
  }

  public int getSodiumCount()
  {
    return sodiumCount;
  }

  public double getFiberCount()
  {
    return fiberCount;
  }

  public double getCarbCount()
  {
    return carbCount;
  }

  public int getSugarCount()
  {
    return sugarCount;
  }

  public int getPotasCount()
  {
    return potasCount;
  }

  public int getVitaminCount()
  {
    return vitaminCount;
  }

  public int getShelfNum()
  {
    return shelfNum;
  }

  public double getWeight()
  {
    return weight;
  }

  public double getCups()
  {
    return cups;
  }

  public double getRating()
  {
    return rating;
  }

  // Mutator methods

  public void setTypeFood(String typeFood2)
  {
    this.typeFood = typeFood2;
  }

  public void setCalorieCount(int calorieCount2)
  {
    this.calorieCount = calorieCount2;
  }

  public void setProteinCount(int proteinCount2)
  {
    this.proteinCount = proteinCount2;
  }

  public void setFatCount(int fatCount2)
  {
    this.fatCount = fatCount2;
  }

  public void setSodiumCount(int sodiumCount2)
  {
    this.sodiumCount = sodiumCount2;
  }

  public void setFiberCount(double fiberCount2)
  {
    this.fiberCount = fiberCount2;
  }

  public void setCarbCount(double carbCount2)
  {
    this.carbCount = carbCount2;
  }

  public void setSugarCount(int sugarCount2)
  {
    this.sugarCount = sugarCount2;
  }

  public void setPotasCount(int potasCount2)
  {
    this.potasCount = potasCount2;
  }

  public void setVitaminCount(int vitaminCount2)
  {
    this.vitaminCount = vitaminCount2;
  }

  public void setShelfNum(int shelfNum2)
  {
    this.shelfNum = shelfNum2;
  }

  public void setWeight(double weight2)
  {
    this.weight = weight2;
  }

  public void setCups(double cups2)
  {
    this.cups = cups2;
  }

  public void setRating(double rating2)
  {
    this.rating = rating2;
  }

}
