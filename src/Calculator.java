public class Calculator {
    int add(int num1 , int num2){
        return num1 + num2;
    }
    int sub(int num1 , int num2){
        return num1 - num2;
    }
    int multiply(int num1 , int num2){
        return num1* num2;
    }
    int divide(int num1 , int num2){
        return num1/num2;
    }
    public static void main(String[] args){
        Calculator calculate = new Calculator();
        IO.println(calculate.add(2,2));
        int x = Integer.parseInt(IO.readln("Enter a value :"));

        int y = Integer.parseInt(IO.readln("Enter a value :"));
        IO.println(calculate.multiply(x, y));
    }
        }
