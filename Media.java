import java.util.Scanner;

public class Media {
    
    public static void main(String[] args){

        double numero1;
        double numero2;
        double media;

        Scanner leitura=new Scanner(System.in);

        System.out.println("Digite um numero:");
        numero1=leitura.nextDouble();

        System.out.println("Digite outro numero:");
        numero2=leitura.nextDouble();
        
        media=(numero1+numero2)/2.0;
        System.out.printf("Media = %.2f", media,"\n");
        leitura.close();

    }
}
