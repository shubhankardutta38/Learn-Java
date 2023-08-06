package q1;
/*Create a book class with a parametarized constructor to load the following data into each instance:
1. bookTitle  2.authorName
3.publication year   4.genre
your class should have a method called bookdetails() which , when called ,should display all the attributes.
Note: The genres should be any one from :
a) Fiction
b) Mystry
c) Science fiction
d) Fantasy
create an Information class which has the parameters:
1.LibrarySection
2.shelfnumber
3.booknumber
create a payment class which has the parameters:
1.rental fees
2.latefee
3.totalbalance
when you call the bookdetails() method, these should be displayed as well.
*/

class Book {
    String bookTitle;
    String authorName;
    int publicationYear;
    String genre;

    public Book(String bookTitle, String authorName, int publicationYear, String genre) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public void bookDetails() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
    }
}

class Information {
    String librarySection;
    int shelfNumber;
    int bookNumber;

    public Information(String librarySection, int shelfNumber, int bookNumber) {
        this.librarySection = librarySection;
        this.shelfNumber = shelfNumber;
        this.bookNumber = bookNumber;
    }

    public void bookDetails() {
        System.out.println("Library Section: " + librarySection);
        System.out.println("Shelf Number: " + shelfNumber);
        System.out.println("Book Number: " + bookNumber);
    }
}

class Payment {
    double rentalFees;
    double lateFees;
    double Balance;

    public Payment(double rentalFees, double lateFees, double Balance) {
        this.rentalFees = rentalFees;
        this.lateFees = lateFees;
        this.Balance = Balance;
    }

    public void bookDetails() {
        System.out.println("Rental Fees: " + rentalFees);
        System.out.println("Late Fees: " + lateFees);
        System.out.println("Balance: " + Balance);
    }
}

public class q1 {
    public static void main(String[] args) {
        Book book = new Book("Programing with C++", "ABC", 1925, "Fiction");

        Information information = new Information("Fiction", 10, 115);

        Payment payment = new Payment(50, 5, 15);
        System.out.println("Book Details :");

        book.bookDetails();
        information.bookDetails();
        payment.bookDetails();
    }
}
