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
            if (nr1 <= 0)
            {
                a = false;
                if(counter == 1)
                {
                    System.out.println("No number entered.");
                }
            }
            if(nr1 > largestnumber)
            {
                largestnumber = nr1;
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
                for (int columns = 1; columns <= x; columns++)
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
        for (int x = 1; x <= rows; x++) {
            for (int y = 0; y < spacefromleft; y++) {
                System.out.print(" ");
            }
            spacefromleft--;
            for (int z = 0; z < (2 * x) - 1; z++) {
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
        System.out.print("c: ");
        char char1 = scanner.next().charAt(0); //workaround as there is no .nextChar()
        char1 = (char)(char1+1);               //increment char1 one higher as it starts one lower without
        if (rows % 2 == 0)
        {
            System.out.println("Invalid number!");
            return;
        }
        int spacefromleft = ((rows+1)/2);
        //top
        for (int x = 1; x <= ((rows+1)/2); x++)              //prints top half middle part
        {
            for (int o = 1 ; o <= spacefromleft-x; o++)      // prints spaces from left side
            {
                System.out.print(" ");
            }
            for (int left = x; left >= 1; left--)            //checks if value is between most left and middle part of diamond
            {
                System.out.print((char)(char1 - left));
            }
            for (int right = 2; right <= x; right++)         //checks if value is between middle and most right part of diamond
            {
                System.out.print((char)(char1 - right));
            }
            System.out.println();
        }

        //bottom
        for (int x = ((rows-1)/2); x > 0 ; x--)               //prints bottom half without middle part
        {
            for (int b = 1; b <= spacefromleft -x; b++ )      // print spaces from left side
            {
                System.out.print(" ");
            }
            for (int left = x; left >= 1; left--)             //checks if value is between most left and middle part of diamond
            {
                System.out.print((char)(char1 - left));
            }
            for (int right = 2; right <= x; right++)          //checks if value is between middle and most right part of diamond
            {
                System.out.print((char)(char1 - right));
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        int countfailed = 0;
        double sum = 0;
        int counter = 0;
        double fin = 0.00;
        while(a)
        {
            int mark = scanner.nextInt();
            System.out.print("Mark " + (counter+1) +": " );
            if(mark >=0 && mark <=5)
            {
                sum = sum + mark;
                counter++;
                if (mark == 5)
                {
                    countfailed++;
                }
                if (mark == 0)
                {
                    a = false;
                    counter--;
                }
            }
            else
            {
                System.out.println("Invalid mark!");
            }
        }
        if (counter > 0)
        {
            fin = (sum / counter);
        }
        System.out.print("Average: ");
        System.out.format("%.2f", fin);
        System.out.println();
        System.out.println("Negative marks: " + countfailed);
    }

    //todo Task 6
    public void happyNumbers(){
        System.out.print("n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n !=1 && n != 4)      //does this as long as sum is not 1 or 4
        {
            n = digitSum(n);
        }
        if(n == 1)
        {
            System.out.println("Happy number!");
        }
        else if (n > 1)
        {
            System.out.println("Sad number!");
        }
    }

    private static int digitSum(int num){          //this method calculates the sum of digits of a given number
        int sum = 0;
        while(num > 0){
            sum += Math.pow(num%10, 2);     //square every digit of num
            num = num/10;
        }
        return sum;     //returns sum of digits
    }
    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}