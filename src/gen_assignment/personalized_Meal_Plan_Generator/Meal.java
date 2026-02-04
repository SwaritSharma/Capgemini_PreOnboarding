package gen_assignment.personalized_Meal_Plan_Generator;

public class Meal<T extends MealPlan> {

    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated: " + meal.getPlanDetails());
    }
}

