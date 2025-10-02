public class Villkor {

    public static void Villkor(String[] args){
        System.out.println("Vilkor");
        System.out.println("1.1");

        if (8 % 2 == 0) {
            System.out.println("Talet är Jämnt");
        } else {
            System.out.println("Talet är Udda");
        }

        System.out.println("1.2");

        int age = 75;

        if (age < 18) {
            System.out.println("Användaren är minderårig");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Användaren är Vuxen");
        } else {
            System.out.println("Användaren är Senior");
        }

        System.out.println("1.3");

        int A = 200;
        int B = 300;
        int C = 100;

        if (A >= B && A >= C) {
            System.out.println("Talet A är störst");
        } else if (B >= A && B >= C) {
            System.out.println("Talet B är störst");
        } else {
            System.out.println("Talet C är störst");
        }

        System.out.println("2.1");

        int månad = 12;

        switch (månad) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Augusti");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        System.out.println("2.2");

        int poäng = 0;

        switch (poäng) {
            case 0:
                System.out.println("F");
                break;
            case 1:
                System.out.println("E");
                break;
            case 2:
                System.out.println("D");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("B");
                break;
            case 5:
                System.out.println("A");
                break;
        }

        System.out.println("2.3");

        String meal = "middag";
        switch (meal) {
            case "frukost":
                System.out.println("Oboy");
                break;
            case "lunch":
                System.out.println("Toast");
                break;
            case "middag":
                System.out.println("Spagetti och köttfärssås");
                break;
        }
    }


}
