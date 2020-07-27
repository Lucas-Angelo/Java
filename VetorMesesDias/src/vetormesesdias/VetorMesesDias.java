/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetormesesdias;

import java.util.Arrays; //Poder ordenar vetor
import java.util.Calendar;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class VetorMesesDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = new String[12];
        mes[0] = "Jan";
        mes[1] = "Fev";
        mes[2] = "Mar";
        mes[3] = "Abr";
        mes[4] = "Mai";
        mes[5] = "Jun";
        mes[6] = "Jul";
        mes[7] = "Ago";
        mes[8] = "Set";
        mes[9] = "Out";
        mes[10] = "Nov";
        mes[11] = "Dez";
        
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        Calendar dataCalendario = Calendar.getInstance();
        int anoAtual = (int) dataCalendario.get(Calendar.YEAR);
        
        if(anoAtual%4==0 || anoAtual%100!=0 || anoAtual%400==0)
            tot[1]=29;
        
        for(int i=0; i<mes.length ;i++){
            System.out.printf("Mes %s tem %d dias.\n", mes[i], tot[i]);
        }
        
        
        
        System.out.println("\n");
        
        
        
        for(int valor: tot){ //Criada variável int valor que recebe todos os valores do tot, tem que ser do mesmo tipo.
            if(valor==28)
            {
                System.out.println("Ano não bissexto");
            } else if(valor==29) {
                System.out.println("Ano bissexto");
            }
        }
        
        
        
        System.out.println("\n");
        
        
        
        Arrays.sort(tot); //Ordenar o vetor tot
        for(int valor: tot)
        {
            System.out.print(valor + " ");
        }
        
        
        
        System.out.println("\n");
        
        
        
        int pos = Arrays.binarySearch(mes, "Jan"); //Fazer pesquisa no vetor
        System.out.printf("\nPosição de Janeiro é: %d\n", pos);
        
        
        
        System.out.println("\n");
        
        
        
        int vetor0[] = new int[10];
        Arrays.fill(vetor0, 0); //Preencher todo o vetor com 0
        for(int valor: vetor0){
            System.out.print(valor + " ");
        }
        
        
        
        System.out.println("\n");
        
        
        
    }
    
}
