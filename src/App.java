import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[5];
        int[] dobro = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 valores:");

        for(int i = 0; i < 5; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++){
            dobro[i] = vetor[i]*2;
        }

        System.out.println("\nVetor\n");
        
        for(int i = 0; i < 5; i++){
            System.out.print(vetor[i] +"\t");
        }
        
        System.out.println("\nDobros\n");

        for(int i = 0; i < 5; i++){
            System.out.print(dobro[i] +"\t");
        }
        sc.close();
    }
}