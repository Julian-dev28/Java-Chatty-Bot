import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        int start =h2;
        int end = h3;
        if(h2 >h3) {
            start = h3;
            end = h2;
        }
        System.out.println(h1 >= start && h1 <= end);



    }
}