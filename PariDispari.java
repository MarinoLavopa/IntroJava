
import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Quanti numeri vuoi calcolare? :");
        int contatore=scanner.nextInt();
        int sommaTotale=0;
        int sommaPari=0;
        int sommaDispari=0;
        int conteggioTotale=0;
        int conteggioPari=0;
        int conteggioDispari=0;

        
        for(int i=1; i <= contatore; i++){
            System.out.println("Inserisci un Numero: ");
                int NumUtente=scanner.nextInt();

                
                if(NumUtente %2 == 0){
                     sommaPari=sommaPari+ NumUtente;
                     sommaTotale=sommaTotale + NumUtente;
                     conteggioTotale++;
                     conteggioPari++;
                    System.out.println("Il numero "+ NumUtente+ " è Pari! ");
                    
                }else{
                    sommaDispari=sommaDispari+NumUtente;
                    sommaTotale=sommaTotale+NumUtente;
                    conteggioTotale++;
                    conteggioDispari++;
                    System.out.println("Il numero "+ NumUtente+ " è Dispari! ");
                    
                }
    }

    double mediaPari=0;
    double mediaDispari=0;
    double mediaTotale=0;

    mediaTotale= (double)sommaTotale/conteggioTotale;
    mediaPari= (double)sommaPari/conteggioPari;
    mediaDispari=(double)sommaDispari/conteggioDispari;

    System.out.println("La media dei numeri pari è "+ mediaPari+ ",mentre per i numeri dispari la media è "+ mediaDispari+ "per una media totale di: "+ mediaTotale );
        
    scanner.close();
        
    }
    
}
