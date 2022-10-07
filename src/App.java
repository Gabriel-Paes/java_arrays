import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o tamanho do vetor?");
        int n = sc.nextInt();
        
        int[] vetor = new int[n];
        int[] dobro = new int[n];

        System.out.println("Digite "+ n +" valores:");

        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            dobro[i] = vetor[i]*2;
        }

        System.out.println("\nVetor\n");
        
        for(int i = 0; i < n; i++){
            System.out.print(vetor[i] +"\t");
        }
        
        System.out.println("\nDobros\n");

        for(int i = 0; i < n; i++){
            System.out.print(dobro[i] +"\t");
        }
        sc.close();
    }
}