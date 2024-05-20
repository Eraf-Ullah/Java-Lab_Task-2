public class Start {

  public static void main(String[] args) {
    // Create two objects of the Food class
    Food food1 = new Food("Pizza", new String[] {"cheese", "tomato sauce", "dough"}, 5.99, 300);
    Food food2 = new Food("Salad", new String[] {"lettuce", "tomatoes", "cucumbers", "carrots"}, 4.59, 200);

    // Print the details of each food object
    System.out.println("Food 1:");
    food1.showDetails();
    System.out.println("\nFood 2:");
    food2.showDetails();

    // Modify the ingredients of food1
    food1.removeIngredient("tomato sauce");
    food1.addIngredient("pineapple");

    // Print the updated details of food1
    System.out.println("\nFood 1 after removing tomato sauce and adding pineapple:");
    food1.showDetails();
  }
}
