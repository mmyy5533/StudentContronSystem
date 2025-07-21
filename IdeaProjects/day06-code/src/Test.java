import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Phone> phone = new ArrayList<>();
        Phone phone3 = new Phone("苹果",8000);
        Phone phone2 = new Phone("锤子", 2999);
        Phone phone1 = new Phone("小米", 1000);
        phone.add(phone3);
        phone.add(phone2);
        phone.add(phone1);
        System.out.println(phone.get(0).getBrand());
    }
    public static void getPhoneInfo(ArrayList<Phone> phone) {
        for (int i = 0; i < phone.size(); i++) {
            Phone p = phone.get(i);
            System.out.println(p.getBrand() + p.getPrice());
        }
    }
}