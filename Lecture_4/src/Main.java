//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Book mybook1 = new Book();
    mybook1.title = "Gnarp";
    mybook1.author = "Alvin Fransson";
    mybook1.pages = 67;
    mybook1.genre = "Fantasy";

    Book mybook2 = new Book();
    mybook2.title = "Gnarp2";
    mybook2.author = "Alvin Fransson";
    mybook2.pages = 420;
    mybook2.genre = "Deckare";

    mybook1.readBook();
    mybook1.readingTime(50);
    mybook2.readBook();
    mybook2.readingTime(50);

        System.out.println(mybook1.title + " är fantasy: " + mybook1.isGenre("Fantasy"));
        System.out.println(mybook1.title + " är deckare: " + mybook1.isGenre("Deckare"));

        System.out.println(mybook2.title + " är deckare: " + mybook2.isGenre("Deckare"));
        System.out.println(mybook2.title + " är fantasy: " + mybook2.isGenre("Fantasy"));

        System.out.println("---------------");

        if (mybook1.pages > mybook2.pages) {
            System.out.println(mybook1.title + " Är längre än " + mybook1.title);
        } else {
            System.out.println(mybook2.title + " Är längre än " + mybook1.title);
        }
    }
}