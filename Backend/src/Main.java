/*Todo
Version 1.0
1. Paklausiam koki veiksma nori daryti (Addition, Subtraction, Multiplication, Division, Modulus)
2. pasirenka pirma skaiciu ir pasirenka antra skaiciu (x ir y)
3. su if/case teiginiu (pagal pasirinkima is 1 punkto ismeta suma)
4. error handling, jei zmogus ne skaiciu iveda
5. jei zmogus su klaida iveda veiksma - duot dar karta pasirinkti
6. kokie yra mygtukai

Version 2:
0.pridedam metodus
1.zmogus nores daugiau skaiciu irasyt
2.isdeliot veiksmu eiliskuma
3 adding sqrt,pow, factorial( for (int i = 1; i <= n; i++) {fact *= i;}
4.maybe switch is better

 */

class Main {
    public static void main(String[] args) {

        int SecondAnswer = 2;
        int ThirdAnswer = 3;
        String FirstAnswer = "modulus";
        if (FirstAnswer == "addition") {System.out.println(SecondAnswer + ThirdAnswer);}
        else if (FirstAnswer == "substraction") {System.out.println(SecondAnswer - ThirdAnswer);}
        else if (FirstAnswer == "multiplication") {System.out.println(SecondAnswer * ThirdAnswer);}
        else if (FirstAnswer == "division") {System.out.println(SecondAnswer / ThirdAnswer);}
        else if (FirstAnswer == "modulus") {System.out.println(SecondAnswer % ThirdAnswer);}


    }
}