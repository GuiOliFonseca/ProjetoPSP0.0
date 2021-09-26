package default_package;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
            
        int a = 0, d = 0;
        do{
             a = teclado.nextInt();
             d = teclado.nextInt();
             
             if(a == 0 && d == 0)
             	break;
             
             if(2 <= a || d <= 11) {
             
            	int[] distanciaAtacantes = new int[a];
             	int[] distanciaDefensores = new int[d];
                
             	for (int i = 0; i < a; i++) {
                 	distanciaAtacantes[i] = teclado.nextInt();
             	}
             	for (int i = 0; i < d; i++) {
            	 	distanciaDefensores[i] = teclado.nextInt();
             	}
             	Arrays.sort(distanciaDefensores);
                
             	verificaInpedimento(a, d, distanciaAtacantes, distanciaDefensores);
             }
        }while(a != 0 && d != 0);
        
        teclado.close();       
	}
	
	public static boolean verificaInpedimento(int a, int d, int[] distanciaAtacantes, int[] distanciaDefensores) {
        
        boolean inpedido = false;
        for (int i = 0; i < a; i++){
            
            if(d - 1 > 0){
                
                if(distanciaAtacantes[i] < distanciaDefensores[0] && distanciaAtacantes[i] < distanciaDefensores[1]){
                    inpedido = true;
                    break;
                }else if(distanciaAtacantes[i] < distanciaDefensores[1]){
                    inpedido = true;
                    break;
                }
            }else {
            	
            	if(distanciaAtacantes[i] < distanciaDefensores[0]){
                    inpedido = true;
                    break;
                }
            }
        }
        
        if(inpedido)
            System.out.println("Y");
        else
            System.out.println("N");
        
        return inpedido;
    }
}
