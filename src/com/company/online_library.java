package com.company;
import java.util.Scanner;


class Library{
    String[] availableBooks;
    String[] issueBooks;
    String[] returnBooks;
    int x;

    Scanner sc= new Scanner(System.in);
    int noOfBooks=0;
    Library(){
        availableBooks=new String[100];
        issueBooks = new String[100];
        returnBooks = new String[100];
    }

    public void addBook(){
        System.out.println("How many books do you want to add?");
        int z = sc.nextInt();
        sc.nextLine(); // clear input buffer

        for (int i = 0; i < z; i++) {
            System.out.println("Enter book name: ");
            String newBook = sc.nextLine();

            int found = 0;
            for (int j = 0; j < noOfBooks; j++) {
                if (availableBooks[j].equalsIgnoreCase(newBook)) {
                    System.out.println("This book already exists!");
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                availableBooks[noOfBooks] = newBook;
                noOfBooks++;
                System.out.println("Book added successfully!");
            }
        }
    }

    public void issueBook(){
        System.out.println("How many books you want to issue: ");
        x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < x; i++) {
            System.out.println("Enter book name to issue: ");
            issueBooks[i] = sc.nextLine();

            int found = 0;
            for (int j = 0; j < noOfBooks; j++) {
                if (issueBooks[i].equalsIgnoreCase(availableBooks[j])) {
                    System.out.printf("%s book issued.\n", issueBooks[i]);
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                System.out.println("Book is not available at the moment.");
            }
        }
    }

    public void returnBook(){
        System.out.println("How many books are you returning? ");
        int y = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < y; i++) {
            System.out.println("Enter book name to return: ");
            returnBooks[i] = sc.nextLine();

            int found = 0;
            for (int j = 0; j < noOfBooks; j++) {
                if (returnBooks[i].equalsIgnoreCase(availableBooks[j])) {
                    System.out.printf("%s book returned.\n", returnBooks[i]);
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                System.out.println("There was no such book in the library.");
            }
        }

            if (x == y) {
                System.out.println("All the books have been returned!");
            } else if (x > y) {
                System.out.printf("You are still yet to return %d books.\n", x - y);
            } 

    }

    public void showAvailableBooks() {
        if (noOfBooks == 0) {
            System.out.println("No books available currently!");
        } else {
            System.out.println("The available books in this library are:");
            for (int i = 0; i < noOfBooks; i++) {
                System.out.println(". " + availableBooks[i]);
            }
        }
    }

}

public class online_library {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Library lib = new Library();
        int choice;
        do {
            System.out.println("Do you want the book to be issued(1), returned(2), want to see available books(3) or want to add a book(4) or exit(5)?");
            choice = s.nextInt();

            if (choice == 1) {
                lib.issueBook();
            } else if (choice == 2) {
                lib.returnBook();
            } else if (choice == 3) {
                lib.showAvailableBooks();
            } else if (choice == 4) {
                lib.addBook();
            } else if (choice==5) {
                System.out.println("Exiting the system.");
            } else {
                System.out.println("Something went wrong. Please try again.");
            }
        }while(choice!=5);
    }
}
