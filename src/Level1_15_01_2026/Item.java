package Level1_15_01_2026;

class MobilePhone {

    String brand;
    String model;
    double price;

    void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S21";
        phone.price = 55000;

        phone.displayPhoneDetails();
    }
}
