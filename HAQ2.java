/*Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to 
initialize the instance variables of the class. Another instance method display ( ) to display the book 
information. A person purchase 5 different books. Display the book details which has the maximum 
price. */


import java.util.Scanner;

class Book {
    String BName;
    String BEdition;
    double BPrice;

    Book(String name, String edition, double price) {
        BName = name;
        BEdition = edition;
        BPrice = price;
    }

    void display() {
        System.out.println("Book Name: " + BName);
        System.out.println("Edition: " + BEdition);
        System.out.println("Price: " + BPrice);
    }
}

public class HAQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Book Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Edition:");
            String edition = scanner.nextLine();

            System.out.println("Enter Price:");
            double price = scanner.nextDouble();
            scanner.nextLine();

            books[i] = new Book(name, edition, price);
        }

        Book maxPriceBook = books[0];
        for (int i = 1; i < 5; i++) {
            if (books[i].BPrice > maxPriceBook.BPrice) {
                maxPriceBook = books[i];
            }
        }

        System.out.println("Book with maximum price:");
        maxPriceBook.display();
    }
}
