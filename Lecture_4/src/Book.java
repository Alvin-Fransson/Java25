public class Book {
String title;
String author;
int pages;
String genre;

void readBook () {
    System.out.println("Reading Book");
    System.out.println("Titel: " + title);
    System.out.println("Författare: " + author);
    System.out.println("Sidor: " + pages);
    System.out.println("Genre: " + genre);

}

void readingTime(int pagesPerDay) {
    int days = (int) Math.ceil((double) pages / pagesPerDay);
    System.out.println("Om du läser " + pagesPerDay + " sidor per dag tar det "
            + days + " dagar att läsa klart boken.");
    System.out.println("------------------");
}

boolean isGenre(String genreToCheck){
    return this.genre.equalsIgnoreCase(genreToCheck);
}

}
