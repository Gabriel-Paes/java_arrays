import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o tamanho do vetor?");
        int n = sc.nextInt();
        
        int[] vetor = new int[n];
        int[] dobro = new int[n];
        int[] inverso = new int[n];
        int count = vetor.length-1;

        System.out.println("Digite "+ n +" valores:");

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < n; i++){
            dobro[i] = vetor[i]*2;
        } 

        for(int i = 0; i < inverso.length; i++){
            inverso[count] = vetor[i];
            count--;
        } 

        System.out.println("\nVetor\n");
        
        for(int i = 0; i < n; i++){
            System.out.print(vetor[i] +"\t");
        }
        
        System.out.println("\n\nDobros\n");

        for(int i = 0; i < n; i++){
            System.out.print(dobro[i] +"\t");
        }

        System.out.println("\n\nInverso\n");

        for(int i = 0; i < n; i++){
            System.out.print(inverso[i] +"\t");
        }
    }
}