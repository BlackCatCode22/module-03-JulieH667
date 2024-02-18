package mystuff;
public class Driver {

    public static void main(String[] args) {

        Phone myPhone = new Phone();
        myPhone.company = "Apple Inc.";
        myPhone.year = "2022";
        myPhone.model = "IPhone 14";
        myPhone.age = 2;
        myPhone.developer = true;

        System.out.println(myPhone.year);
    }
}
