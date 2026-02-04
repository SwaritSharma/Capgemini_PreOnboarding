import java.util.*;
import gen_assignment.smart_warehouse.*;
import gen_assignment.personalized_Meal_Plan_Generator.*;
import gen_assignment.AI_Driven_Resume_Screening_System.*;
import gen_assignment.dynamic_online_market_place.*;
import gen_assignment.multiLevel_University_Course_Management_System.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("1. Smart Warehouse Management System");
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Wheat"));

        Storage.displayItems(electronicsStorage.getItems());
        Storage.displayItems(groceryStorage.getItems());

        System.out.println("\n2. Dynamic Online Marketplace");
        Book book = new Book(500);
        Clothing shirt = new Clothing(1200);
        Gadget phone = new Gadget(30000);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("Book price after discount: " + book.getPrice());
        System.out.println("Shirt price after discount: " + shirt.getPrice());
        System.out.println("Phone price after discount: " + phone.getPrice());

        System.out.println("\n3. University Course Management System ");
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));

        Course.showCourses(examCourses.courses);
        Course.showCourses(researchCourses.courses);

        System.out.println("\n4. Personalized Meal Plan Generator ");
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();

        Meal.generateMeal(vegMeal);
        Meal.generateMeal(veganMeal);
        Meal.generateMeal(ketoMeal);

        System.out.println("\n 5. AI-Driven Resume Screening System ");
        Resume<SoftwareEngineer> seResume = new Resume<>();
        Resume<DataScientist> dsResume = new Resume<>();

        seResume.process(new SoftwareEngineer());
        dsResume.process(new DataScientist());

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        Resume.screenAll(roles);
    }
}
