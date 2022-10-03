package at.ac.fhcampuswien;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double largestnumber = 0;
        boolean a = true;
        while(a)
        {
            counter++;
            double nr1 = scanner.nextDouble();
            System.out.print("Number " + counter + ": ");
            if (nr1 < 0)
            {
                a = false;
            }
            if(nr1 > largestnumber)
            {
                largestnumber = nr1;
            }
            if(counter == 1 && nr1 < 0)
            {
                System.out.println("No number entered.");
            }
        }
        if(largestnumber > 0)
        {
            System.out.print("The largest number is ");
            System.out.format("%.2f", largestnumber);
            System.out.println();
        }
    }

    //todo Task 2
    public void stairs(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int rows = scanner.nextInt();
        int counter = 0;
        if (rows <= 0)
        {
            System.out.println("Invalid number!");
        }
        else {
            for (int x = 0; x <= rows; x++)
            {
                for (int y = 1; y <= x; y++)
                {
                    counter++;
                    System.out.print(counter + " ");
                }
                if(counter != 0)
                {
                    System.out.println();
                }
            }
        }
    }

    //todo Task 3
    public void printPyramid(){

        int rows = 6;
        int spacefromleft = rows -1;
        for (int x = 1; x <= rows; x++)
        {
            for(int y = 0; y < spacefromleft; y++)
            {
                System.out.print(" ");
            }
            spacefromleft--;
            for (int z = 0; z < (2*x)-1; z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int rows = scanner.nextInt();
        System.out.println("c: ");
        char char1 = scanner.next().charAt(0); //workaround as there is no .nextChar()
        int counter = 1;
        int spacefromleft = rows -1;

        //all loops need to start at 1, else the it wont print out the whole rhombus
        //doesnt print the most right line yet
        for (int x = 1; x <= rows; x++)
        {
            for (int y = 1; y <= spacefromleft; y++)
            {
                System.out.print(" ");
            }
            spacefromleft--;
            for (int z = 1; z <= 2*x-1; z++)
            {
                if(z == counter)
                {
                    System.out.print("2");
                }
                else
                {
                    System.out.print("1");
                }
            }
            counter++;
            System.out.println();
        }
        spacefromleft = 1;  //reset the space
        counter = 3;
        for (int x = 1; x <= rows -1; x++)
        {
            for (int y = 1; y <= spacefromleft; y++)
            {
                System.out.print(" ");
            }
            spacefromleft++;
            for (int z = 1; z <= 2*(rows-x)-1; z++)
            {
                if(z == (spacefromleft+counter)-1*x)
                {
                    System.out.print("2");
                }
                else
                {
                    System.out.print("1");
                }
            }
            counter--;
            System.out.println();
        }



    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        /*System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();*/
        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}