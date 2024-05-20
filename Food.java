public class Food {

    private String name;
    private String[] ingredients;
    private double price;
    private int calorieCount;

  
    public Food() {
        this.name = "";
        this.ingredients = new String[0];
        this.price = 0.0;
        this.calorieCount = 0;
    }

 
    public Food(String name, String[] ingredients, double price, int calorieCount) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calorieCount = calorieCount;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(int calorieCount) {
        this.calorieCount = calorieCount;
    }

   
    public void addIngredient(String ingredient) {
        String[] newIngredients = new String[ingredients.length + 1];
        System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
        newIngredients[newIngredients.length - 1] = ingredient;
        this.ingredients = newIngredients;
    }

    
    public void removeIngredient(String ingredient) {
        boolean found = false;
        String[] newIngredients = new String[ingredients.length - 1];
        int j = 0;
        for (int i = 0; i < ingredients.length; i++) {
            if (!ingredients[i].equals(ingredient)) {
                newIngredients[j++] = ingredients[i];
            } else {
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ingredient not found: " + ingredient);
        } else {
            this.ingredients = newIngredients;
        }
    }

   
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Price: $" + price);
        System.out.println("Calories: " + calorieCount);
    }
}
