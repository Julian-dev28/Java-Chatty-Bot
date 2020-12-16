import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber>0 && secondNumber <=0 && thirdNumber<=0){
            System.out.println("true");
        }
        else if (firstNumber<=0 && secondNumber>0 && thirdNumber<=0){
            System.out.println("true");
        }
        else if (firstNumber<=0 && secondNumber<=0 && thirdNumber>0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
