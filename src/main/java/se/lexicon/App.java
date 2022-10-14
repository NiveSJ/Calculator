package se.lexicon;


import java.util.Scanner;


/**
 * calculator program
 */
public class App {
    public static int sum()throws Exception {
       try {
           String inp;
           int sum=0;

           System.out.println("Enter the Numbers to add,Press '=' to display result");
           Scanner scann = new Scanner(System.in);


           while(true) {
               inp = scann.next();
                char inter=inp.charAt(0);
               int check = Character.compare(inter, '=');
               if(check == 0)
                   break;
               int i=Integer.parseInt(inp);
               sum = sum+ i;
           }


           return sum;
       }
       catch ( Exception e)
       {
           throw new RuntimeException(e);
       }


    }

    public static int sub() throws Exception {

        try {
            int sub = 0;

            int[] a = new int[200];
            System.out.println("Enter how many numbers you want to Subtract");
            Scanner scann = new Scanner(System.in);
            int len = scann.nextInt();
            System.out.println("Enter numbers to Subtract ");

            for (int i = 0; i <= len - 1; i++) {
                a[i] = scann.nextInt();

            }
            sub = a[0] - a[1];

            for (int i = 2; i <= len - 1; i++) {

                sub -= a[i];

            }

            return sub;
        }
        catch (Exception e){
            throw new RuntimeException(e);

        }
    }

    public static int multiply() throws Exception {
        try {
            int a, b, multiply;

            System.out.println("Enter two Numbers to perform multiplication");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            multiply = a * b;
            return multiply;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }

    public static int divide() throws Exception {
        try{
             int a, b, divide;
        System.out.println("Enter two Numbers to perform Divide");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
         divide = a / b;

            return divide;
        }
    catch (Exception e) {
        //System.out.println(e.getMessage());
        throw new RuntimeException(e);
    }


    }

    public static void calculator() throws Exception {
        {

            int option,c=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter your options to " +
                    "perform Arithmetic operation 1.Sum 2.Subtraction 3. Division 4.Multiply");
            option = sc.nextInt();

            switch (option) {
                case 1:

                    c = sum();
                    System.out.println("Result for Addition:" + c);
                    break;
                case 2:
                    c = sub();
                    System.out.println("Result for subtraction:" + c);
                    break;
                case 3:
                    c = divide();
                    System.out.println("Result for Division:" + c);
                    break;
                case 4:
                    c = multiply();
                    System.out.println("Result for Multiplication:" + c);
                    break;
                default:
                    System.out.println("Please enter valid operation");

            }

        }


    }

    public static void main(String[] args) throws Exception {

        int terminate = 0;

        calculator();
        while (terminate == 0) {



            System.out.println("Do you want to continue,Enter Yes or No");

            Scanner con = new Scanner(System.in);
            String inp = con.next();
            if (inp.equalsIgnoreCase("No"))
            {
                terminate = 1;
            }
            else if (inp.equalsIgnoreCase("yes"))
            {
                calculator();
            }
            else {
                System.out.println("Please Enter Valid Input to continue.");

            }

        }


    }
}
