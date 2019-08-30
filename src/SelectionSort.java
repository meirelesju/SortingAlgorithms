
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
public class SelectionSort {
    
    void Ordena(int A[]) 
    { 
        int comprimento = A.length; 
       
        for (int i = 0; i < comprimento-1; i++) 
        { 
            // Encontra o mínimo elemento de A
            int indiceMin = i; 
            //Inicializa em i+1 porque o indiceMin já tem o indice do primeiro elemento a ser comparado
            for (int j = i+1; j < comprimento; j++){ 
                if (A[j] < A[indiceMin]){ 
                    indiceMin = j; 
                }
            }//"retorna" o índice do elemento mínimo de A
            
            // Troca a posição do elemento mínimo com o primeiro elemento de A
            //Armazena o valor minimo pois quando faz a troca no "A[indiceMin] = A[i]", o valor minimo é apagado
            int min = A[indiceMin]; 
            A[indiceMin] = A[i]; 
            A[i] = min; 
        } 
    } 
  
     
    void Print(int A[]) 
    { 
        int comprimento = A.length; 
        for (int i = 0; i < comprimento; ++i) 
            System.out.println(A[i]); 
        
    } 
  

    //Ler o arquivo e armazenar os valores
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
        
        SelectionSort s = new SelectionSort(); 
        
        //Coloca os elementos da Lista no array A
        int A[] = new int [lista.size()];
           for(int i = 0; i<lista.size();i++){
               A[i]=lista.get(i);
           } 
        
        s.Ordena(A); 
         
        s.Print(A); 
    } 
} 
    
    
    

