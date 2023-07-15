import java.util.Scanner;

public class Printer
{
    public static void main(String[] args)
    {
//        begin();
 //       ifelse();
//        input();
//        yourage();
        //for_horatio();
        //weWonSixTimes();
        //LFC();
        //whileloop();
/*        System.out.println("area of a rectangle: " + calculateAreaOfRectangle(20, 5));
        System.out.println("area of a circle: " + calculateAreaOfCircle(3));
        System.out.println("circumference of a circle: " + calculateCircumferenceOfCircle(5));
        System.out.println("circumference of a circle: " + calculateCircumferenceOfCircleUsingDiameter(10));

        printNumber(5);
        System.out.println("Square of a number: " + calculateSquareOfNumber(10));
        printNumber(calculateSquareOfNumber(5));*/




        // 12 March 2023
        //newBegin();

        //your_name();
        //for_loop();

        //maths();
        arrayfunction();
    }

    public static void begin()
    {
        System.out.println("Hello Horatio!!!!!");
        System.out.println("thank you");
        System.out.println("happy birthday");

        int age = 8;
        System.out.println(age);
        age = 48;
        System.out.println(age);

        double height = 140.56;
        System.out.println(height);
        height =  190.32;
        System.out.println(height);

        String football =  "liverpool";
        System.out.println(football);
        football = "brenford";
        System.out.println(football);
    }

    public static void newBegin()
    {
        /*int age = 10;
        System.out.println(age);
        String name = "Horatio";
        System.out.println(name);
        double weight = 36.7;
        System.out.println(weight);
        System.out.println("My name is " + name + " and my age is " + age + " and my weight is " + weight );*/


        System.out.println ("what is your hobby?");
        Scanner reader = new Scanner(System.in);
        String hobby = reader.nextLine();
        System.out.println("your hobby is " + hobby );

        System.out.println ("what is your favorite food?");
        String favoriteFood = reader.nextLine();
        System.out.println("your favorite food is " + favoriteFood);
    }

    public static void input()
    {
        System.out.println("Hello, I am Horatio's computer!");
        System.out.println("Now I am going to ask you some questions.");
        System.out.println("What is your name?");

        Scanner in = new Scanner(System.in);
        // You have created a variable called name
        String name = in.nextLine();
        System.out.println("What is your age?");
        // You have created a variable called age
        String age = in.nextLine();
        System.out.println("What is your favourite hobby?");
        // You have created a variable called hobby
        String hobby = in.nextLine();

        System.out.println("Hello " + name + ", your age is " + age + " and your hobby is " +hobby);

//        int number = 4;
//        if(number > 1)
//            System.out.println("number is greater than 1");
//        else
//            System.out.println("number is less than 1");

    }

    static void ifelse()
    {
        int number = 4;

        //if(boolean expression)
        // This checks if the variable called number is greater than 5. If it is greater display text that says number is greater than else it displays text that says number is less than or equal to 5
        if(number > 5)
            System.out.println("Number " + number + " is greater than 5.");
        else
            System.out.println("Number " + number + " is less than or equal to 5.");

        System.out.println("How old are you?");
        Scanner reader = new Scanner(System.in);
        String age = reader.nextLine();

        if(Integer.parseInt(age)>= 18)
            System.out.println("You are an adult.");
        else
            System.out.println("You are a child.");

    }

    static  void yourage()
    {
        System.out.println("\n\nwhat is your age?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        int age = Integer.parseInt(answer);

        if(age >= 234)
            System.out.println("you are an adult");
        else
            System.out.println("you are a child");

        System.out.println("\n\nwhat is your name?");
        String name = in.nextLine();

        if(name.toUpperCase().equals("HORATIO"))
            System.out.println("you are an Adeoye");
        else
            System.out.println("you are NOT an Adeoye");
    }

    static void for_loop2()
    {

        System.out.println("\n\nwhat is your age?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        int age = Integer.parseInt(answer); // Converts a string variable called answer into a number called age

        System.out.println("\n\nwhat is your name?");
        String name = in.nextLine();

        for (int count = 1; count <= age; count++)
            System.out.println(name + " "  + count);

    }

    static void for_loop()
    {
        int total = 1;
        System.out.println("\n\nhow many times?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        int times = Integer.parseInt(answer);

        for(int i = 5; i <= times; i++)
        {
            total = total  * i;
        }
        System.out.println("total=" + total);

    }

    static void for_horatio()
    {

        System.out.println("\n\nwhen day of the month is your birthday?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        int dayOfMonth = Integer.parseInt(answer); // Converts a string variable called answer into a number called age

        System.out.println("\n\nwhat team do you support in the EPL?");
        String name = in.nextLine();

        for (int count = 1; count <= dayOfMonth; count++)
            System.out.println(name + " "  + count);

    }

    static void your_name()
    {
        //if((surname.equals("adeoye")) && (surname.equals("Adeoye")))
        System.out.println("What is your first name?");
        Scanner nameScanner = new Scanner(System.in);
        String firstName = nameScanner.nextLine();

        if( (firstName.equals("Horatio")) || (firstName.equals("Leon")) || (firstName.equals("Saori")) || (firstName.equals("Harper")) )
            System.out.println("You are an Adeoye");
        else
            System.out.println("You are not an Adeoye");

        System.out.println("What is your first name?");
        String fName = nameScanner.nextLine();
        System.out.println("What is your surname?");
        String sName = nameScanner.nextLine();

        if ((fName.equals("Horatio")) && (sName.equals("Adeoye")) )
            System.out.println("You are my son");
        else
            System.out.println("You are not my son");


    }


    static void weWonSixTimes()
    {
        for (int count = 1; count <= 8; count++)
        {
            if(count <= 6)
                System.out.println("LFC won!!!");
            else
                System.out.println("Man Utd booo!");
        }
    }

    static void LFC()
    {
        // Ask for a number
        // read the number using a scanner.
        // if the number is greater than 10 then print error
        // else  print LFC as many times as the number.
        System.out.println("Please give me number?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        int number = Integer.parseInt(answer); // Converts a string variable called answer into a number called number
        if(number > 10)
        {
            System.out.println("ERROR: number bigger than ten.");
        }
        else
        {
            for(int count = 1; count <= number; count++)
            {
                System.out.println("LFC");
            }
        }
    }

    static void whileloop()
    {
        int count = 2;
        while(true)
        {
            System.out.println(count  + " LFC");
            count++;
            if(count > 10)
                break;
        }

        int number = 0;
        while (number < 20)
        {
            number++; // number = number + 1;
            if(number > 5)
                System.out.println("number " + number);
        }
    }


    static int calculateAreaOfRectangle(int length, int width)
      {
          return length * width;
      }

    static double calculateAreaOfCircle(int radius)
    {
        return Math.PI * radius * radius;
    }

    static double calculateCircumferenceOfCircle(int radius)
    {
        return Math.PI * radius * 2;
    }

    static double calculateCircumferenceOfCircleUsingDiameter (int diameter)
    {
        return Math.PI * diameter;
    }

    static void printNumber (int number)
    {
        System.out.println(number);
    }

    static int calculateSquareOfNumber (int number)
    {
        return  number * number;
    }

    static void maths()
    {
        System.out.println("math.PI = "+ Math.PI);
        System.out.println("math.sqrt(4) = "+ Math.sqrt(4));
        System.out.println("math.abs(-4) = "+ Math.abs(-4));
        System.out.println("math.abs(4) = "+ Math.abs(4));
        System.out.println("math.tan(0) = "+ Math.tan(1));
        System.out.println("math.cos(0) = "+ Math.cos(1));
        System.out.println("math.sin(0) = "+ Math.sin(1));
        System.out.println("calculateHypotenuse(6,8) = "+ calculateHypotenuse(6, 8));
    }


    static double calculateHypotenuse(double adjacent, double opposite)
    {
        return  Math.sqrt( (adjacent * adjacent) + (opposite * opposite));
    }

    static void arrayfunction()
    {
        int[] intArray = new int[10];
        intArray[0]= 4;
        intArray[1]= 3;
        intArray[2]= 10;
        intArray[3]= 6;
        intArray[4]= 31;
        intArray[5]= 10;
        intArray[6]= 2;
        intArray[7]= 5;

        intArray[8]= 1;
        intArray[9]= 36;


        int maximum = 0;
        int minimum = 100;
        int average = 0;

        int total = 0;

        for(int i = 0; i < intArray.length; i++)
        {
            total = total + intArray[i];
            //System.out.println(total);

            if(intArray[i] < minimum)
                minimum = intArray[i];

            System.out.println("minimum is now: " + minimum);

            if(intArray[i] > maximum)
                maximum = intArray[i];

            //System.out.println("maximum is now: " + maximum);

        }

        System.out.println("Average: " + total/10.0);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);







    }















    }

