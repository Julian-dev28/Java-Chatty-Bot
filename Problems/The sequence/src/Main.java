import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        int show = 0;
        int contador = 0;
        int number = scanner.nextInt();

        for(int a = 0; a != number; a++ ){
            show = show += 1;


            for (int b = 0; b != show; b++){


                while (contador != number){
                    System.out.print(show + " ");
                    contador = contador += 1;
                    break;
                }


            }

        }



        // put your code here
    }
}
