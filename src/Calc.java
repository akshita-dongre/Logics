public class Calc {
    public static void main(String[] args){
        int num1 = Integer.parseInt(IO.readln("your number1:"));
        int num2 = Integer.parseInt(IO.readln("number2:"));
        IO.println("press 1 for add , 2 for subtract , 3 for multiply , 4  for divide");
        int options = Integer.parseInt(IO.readln());
        Calculator symbol = new Calculator();
        if (options == 1){
            int x = symbol.add(num1 , num2);
            IO.println(x);
        }
        else if (options == 2){
            IO.println(symbol.sub(num1 , num2));
        }
        else if (options == 3){
            IO.println(symbol.multiply(num1 , num2));
        }
        else if (options == 4){
            IO.println(symbol.divide(num1 , num2));
        }
        else {
            IO.println("invalid");
        }

    }

}
