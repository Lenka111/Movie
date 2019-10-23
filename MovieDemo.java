//Elena Voinu

import java.util.Scanner;
      public class MovieDemo
      {
          public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Movie m1 = new Movie();// creating new object of class Movie;
            Movie m2 = new Movie();//creating new object of class Movie;
            Movie m3 = new Movie();

            System.out.println("Welcome to Elena's IMDB Knock-off!");
            System.out.println("Which film would you like to learn more about?");
            System.out.println("(1) Gifted");
            System.out.println("(2) Star Wars: The Last Jedi");
            System.out.println("(3) Star Wars: The Last Jedi");
            System.out.print("Enter your choice as an integer: ");

            m1.setTitle("Gifted");
            m1.setReleaseYear(2017);
            m1.setDirector("Marc Webb");
            m1.setCast("Chris Evans, Jenny Slate, Mckenna Grace");
            m1.setAverageRating(7.6);
            m1.setTrivia("After filming had ended, Chris Evans and Jenny Slate began a relationship and broke up almost a" +
                    " year later in November 2017, however, it was announced that they had gotten back together");
            m1.setBudget(7000000);
            m1.setCumulativeSales(43046590);


            m2.setTitle("Star Wars: The Last Jedi");
            m2.setReleaseYear(2017);
            m2.setDirector("Rian Johnson");
            m2.setCast(" Daisy Ridley, John Boyega, Mark Hamill");
            m2.setAverageRating(7.5);
            m2.setTrivia("With the passing of Kenny Baker, Anthony Daniels is now the only remaining actor " +
                    "to appear in all the official Star Wars films.");
            m2.setBudget(200000000);
            m2.setCumulativeSales(1311425821);

            int n1;
            n1 = sc.nextInt(); // user will pick an integer;
              String movie = "Gifted";
              String movie1 = "Star Wars: The Last Jedi";
              String movie2 = movie1;

            if (n1 == 1) {  // assigning number 1 to movie Gifted;
              System.out.print("Now printing details for " + "(1)" + movie + " :");
              m1.printDetails();
            } else if (n1 == 2) {  // assigning number 2 to movie Star Wars: The Last Jedi;
              System.out.println("Now printing details for " + "(2)" + movie1 + " :");
              m2.printDetails();
            } else {
              System.out.print("Now printing details for " + "(3)" + movie1 + " :");
              m2.printDetails();
            }

                  if ((movie.equals(movie) && n1==1)) {
                      System.out.println("This movie Is equal to (1)Gifted");
                      System.out.println("This movie is NOT equal to (2)Star Wars: The Last Jedi");
                  }

                  if ((movie1.equals(movie2)) && (n1==2)) {
                      System.out.println("This movie is Not equal to (1)Gifted");
                      System.out.println("This movie Is equal to (2)Star Wars: The Last Jedi");
                  }
                  if ((movie1.equals(movie2)) && (n1==3)) {
                      System.out.println("This movie is Not equal to (1)Gifted");
                      System.out.println("This movie Is equal to (2)Star Wars: The Last Jedi");
                  }

          }
                }

