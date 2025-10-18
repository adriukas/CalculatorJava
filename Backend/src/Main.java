/*Todo
Version 1.0
1. Paklausiam koki veiksma nori daryti (Addition, Subtraction, Multiplication, Division, Modulus)
Version 1.5
2. pasirenka pirma skaiciu ir pasirenka antra skaiciu (x ir y)

Version 2.0
4.3. su if/case teiginiu (pagal pasirinkima is 1 punkto ismeta suma)
4. error handling, jei zmogus ne skaiciu iveda
5. jei zmogus su klaida iveda veiksma - duot dar karta pasirinkti
6. kokie yra mygtukai

Version 2.0:
0.pridedam metodus nusprest public ar static

  Version 2.5
1. prideti objektus
1.zmogus nores daugiau skaiciu irasyt
2.isdeliot veiksmu eiliskuma
3 adding sqrt,pow, factorial( for (int i = 1; i <= n; i++) {fact *= i;}
4.maybe switch is better

 */


import java.util.Scanner;

public class Main {

    static int doCalculation(String calculation,  int firstnumber, int secondnumber) {

        if (calculation.equalsIgnoreCase("addition")) {
            return firstnumber + secondnumber;
        } else if (calculation.equalsIgnoreCase("substraction")) {
            return firstnumber - secondnumber;
        } else if (calculation.equalsIgnoreCase("multiplication")) {
            return firstnumber * secondnumber;
        } else if (calculation.equalsIgnoreCase("division")) {
            return firstnumber / secondnumber;
        } else if (calculation.equalsIgnoreCase("modulus")) {
            return firstnumber & secondnumber;
        } else {
            System.out.println("Unknown operation!");
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter what kind of calculation You want to do with two numbers? (addition, subtraction, multiplication, division, modulus)");
        String calculation = scanner.nextLine();


        System.out.println("Enter first number:");
        int firstnumber = scanner.nextInt();


        System.out.println("Enter second number:");
        int secondnumber = scanner.nextInt();


        int result = doCalculation(calculation, firstnumber, secondnumber);

        System.out.println("Answer is: " + result);
        scanner.close();



    }}