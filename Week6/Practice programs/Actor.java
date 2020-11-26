/*Develop a Java program to create a class Actor with id, name, no_of_movies,
no_of_years_exp. Calculate the average_performance for each of the actor and print
the name of the actor with highest average.*/

import java.util.Scanner;
class Actor{
  String id;
  String name;
  int no_of_movies;
  int no_of_years_exp;

  void setdetails(){
  Scanner ss = new Scanner(System.in);
    System.out.println("Enter the Actor's Name: ");
    name = ss.next();
    System.out.println("Enter the Actor's ID: ");
    id = ss.next();
    System.out.println("Enter the Number of Movies Actor worked in: ");
    no_of_movies = ss.nextInt();
    System.out.println("Enter the Number of Years Actor has been working: ");
    no_of_years_exp = ss.nextInt();
  }
  double calc_avg(){
    return (double)(no_of_movies/no_of_years_exp);
  }

  }
class Actor_main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Actor[] sd = new Actor[n];
    for(int i=0;i<n;i++){
      System.out.println("\tActor "+(i+1));
      sd[i] = new Actor();
      sd[i].setdetails();
    }
    for(int i=0;i<n;i++){
      System.out.println("\n Actor's Name: "+sd[i].name);
      System.out.println(" Actor's ID: "+sd[i].id);
      System.out.println(" Number of Movies Actor worked in: "+sd[i].no_of_movies);
      System.out.println(" Number of Years Actor has been working: "+sd[i].no_of_years_exp);
          }

    double max = sd[0].calc_avg();
    String highest_avg_name = sd[0].name;
    for(int i=0;i<n;i++){
      if(sd[i].calc_avg()>max){
        max =sd[i].calc_avg();
        highest_avg_name =sd[i].name;
      }
    }
    System.out.println("\nThe Actor with highest average performance "+highest_avg_name+" with an average of "+max);
    }

  }
