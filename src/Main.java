import exercises.Computer;
import exercises.Laptop;
import exercises.Smartphone;

public class Main {
    public static void main(String[] args) {
        Computer test = new Computer(32, "Intel Skylake 5500 2.8gHz", 1024, "Radeon AMD 4800");

//        System.out.println(test);

        Laptop deanna = new Laptop(16,"Apple M2", 526, "Intel Integrated Graphics", 10);
//        System.out.println(deanna);
        Smartphone nick = new Smartphone(8,"Apple mobile processor", 128, "Snapdragon GPU", 4.5);
//        System.out.println(nick);

        Computer john= new Smartphone(32,"Apple mobile processor", 512, "Snapdragon GPU", 6);
//        john.phoneRinging();
//        ((Smartphone)john).phoneRinging();

        System.out.println((Computer)deanna instanceof Computer);

    }
}