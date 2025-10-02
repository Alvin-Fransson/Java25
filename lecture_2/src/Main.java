//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    int age =  30;
    double height = 1.75;
    char initial = 'A';
    String name = "Alice";
    boolean isStudent = true;

        System.out.println("Uppgift 1.2");
        System.out.println("Åldern är " + age);
        System.out.println("Längden är " + height);
        System.out.println("Initialen är " + initial);
        System.out.println("Namnet är " + name +" och är en "+((Object) name).getClass().getName());
        System.out.println("Är elev? " + isStudent);

        System.out.println("Uppgift 2.1");
        System.out.println(10 + 20);
        System.out.println(100 - 30);
        System.out.println(5 * 7);
        System.out.println(20 / 4);
        System.out.println( 10 % 3);

        System.out.println("Uppgift 2.2");
        int b = 20;
        int c = 15;
        // Kör c istället för a, A fanns redan som en variabel från tidigare uppgift
        System.out.println(c == b);
        System.out.println(c > b);
        System.out.println(c <= b);

        System.out.println("Uppgift 2.3");
        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println(x > y && z > y);
        System.out.println(x > y || z < y);

        System.out.println("Uppgift 2.4");
        System.out.println((104 - 76) * 2 > 50);

    }
}