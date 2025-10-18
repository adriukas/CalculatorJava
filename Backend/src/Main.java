/*Todo
Version 1.0
1. Paklausiam koki veiksma nori daryti (Addition, Subtraction, Multiplication, Division, Modulus)
Version 1.5
2. pasirenka pirma skaiciu ir pasirenka antra skaiciu (x ir y)
3. su if/case teiginiu (pagal pasirinkima is 1 punkto ismeta suma)
4. error handling, jei zmogus ne skaiciu iveda
5. jei zmogus su klaida iveda veiksma - duot dar karta pasirinkti
6. kokie yra mygtukai

Version 2.0:
0.pridedam metodus nusprest public ar static(gal?? public class Main {
  static int plusMethod(int x, int y) {
    return x + y;
  }

  Version 2.1
 1. prideti objektus
1.zmogus nores daugiau skaiciu irasyt
2.isdeliot veiksmu eiliskuma
3 adding sqrt,pow, factorial( for (int i = 1; i <= n; i++) {fact *= i;}
4.maybe switch is better

 */


import java.util.Scanner;

class Main {

    public void gettingFirstAnswer() {
        Scanner firstAnswer = new Scanner(System.in);
        System.out.println("Enter what kind of calculation You want to do (addition, subtraction, multiplication, division, modulus)");
        String calculation = firstAnswer.nextLine();
    }

     /*   int SecondAnswer = 2;
        int ThirdAnswer = 3;


    static void checkFirstAnswer(String calculation) {
        if (calculation == "addition") {
            System.out.println(SecondAnswer + ThirdAnswer);
        } else if (calculation == "substraction") {
            System.out.println(SecondAnswer - ThirdAnswer);
        } else if (calculation == "multiplication") {
            System.out.println(SecondAnswer * ThirdAnswer);
        } else if (calculation == "division") {
            System.out.println(SecondAnswer / ThirdAnswer);
        } else if (calculation == "modulus") {
            System.out.println(SecondAnswer % ThirdAnswer);
        }
    }

        public static void Main(String[] args) {
        Main myObj = new Main();
        myObj.gettingFirstAnswer();
        calculation.checkFirstAnswer(FirstAnswer);
            }

    }
}