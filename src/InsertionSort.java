
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julianny Meireles
 */
public class InsertionSort {
    
    void Ordena(int []A){
        
        int comprimento = A.length;
        
        
       int posicao, aux;
		for (int i = 0; i < comprimento; i++) {
			posicao = A[i];
			aux = i-1;
			while(aux >= 0 && A[aux] > posicao){
				A[aux+1] = A[aux];
				aux = aux - 1;
			}
			A[aux+1] = posicao;
		}
       
        
    }
    
    
    
    
    
     void Print(int A[]) 
    { 
        int comprimento = A.length; 
        for (int i = 0; i < comprimento; ++i) 
            System.out.println(A[i]); 
        
    } 
     
    
    //Lê o arquivo e armazenar os valores
    static  ArrayList<Integer> lista = new ArrayList<>();
        
        static ArrayList<Integer> arquivo(String arq) throws FileNotFoundException {

            Scanner ler = null;
           ler = new Scanner(new File(arq));
           while (ler.hasNext()) {
               lista.add(ler.nextInt());
           }
           ler.close();
           return lista;
       }
    
    
    
    public static void main(String args[]) throws FileNotFoundException 
    { 
        
        arquivo("src/num.1000.1.in");
        
        InsertionSort s = new InsertionSort(); 
        
        //Coloca os elementos da Lista no array A
        int A[] = new int [lista.size()];
           for(int i = 0; i<lista.size();i++){
               A[i]=lista.get(i);
           } 
        
        s.Ordena(A); 
         
        s.Print(A); 
    } 
    
    
    
    
    
    
}


