import java.util.Scanner;
public class Loopar {

    public static void Loopar(String[] args) {

        System.out.println("-------- Loopar ---------");
        System.out.println("1.1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("1.2");
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("1.3");

        int num = 5;
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + i*num);
        }

        System.out.println("2.1");

        int num2 = 0;
        while (num2 <= 20){
            System.out.println(num2);
            num2+=2;
        }

        System.out.println("2.2");

        int guess = 50;
        int low = 1;
        int high = 100;
        boolean correct = false;

        while (!correct) {
            correct = true;
            System.out.println("Gissning" + guess);
        }

        System.out.println("-------Do While loopar--------");
        System.out.println("3.1");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ange ett nummer");
        int number = myScanner.nextInt();

        do {
            System.out.println("Ditt nummer är " + number);
        } while (number >= 0);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Välj en metod");
        int choice = myScanner.nextInt();
        do {
            System.out.println("3.2");
            System.out.println("0 = Avlsuta");
            System.out.println("1 = Addition");
            System.out.println("2 = Subtraktion");
            System.out.println("3 = Division");
            System.out.println("4 = Multiplikation");


            switch (choice){
                case 0:
                    System.out.println("Du valde att avlsuta");
                    break;
                case 1:
                    System.out.println("Du valde Addition");
                    break;
                case 2:
                    System.out.println("Du valde Subtraktion");
                    break;
                case 3:
                    System.out.println("Du valde Division");
                    break;
                case 4:
                    System.out.println("Du valde Multiplikation");
                    break;
            }
        } while (choice != 0);
    }
}
