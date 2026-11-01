public class EvenOdd {
    String evenOddChecker(int num1){
        if(num1%2 == 0){
            return "even";
        }
        else{
            return"odd";
        }
    }
    public static void main(String[] args){
        EvenOdd evenOdd = new EvenOdd();
        String a = evenOdd.evenOddChecker(23);
        IO.println(a);

    }}
