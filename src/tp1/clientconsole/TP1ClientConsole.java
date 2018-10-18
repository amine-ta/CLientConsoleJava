/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.clientconsole;

import Gestionnaire.Gestionnaire;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1895088
 */
public class TP1ClientConsole {

    /**
     * @param args the command line arguments
     */
    
    
    static Scanner clavier =new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
       String nom;    
       
       char reponse = 'O';
       
        while(reponse == 'O' || reponse == 'o'){
    
        System.out.println("Donnez un nom : ");
        nom = clavier.nextLine();
           
        System.out.println("Entrer votre date de naissance YYYY-MM-JJ : ");
        String annee = clavier.nextLine();
                
        String message =Gestionnaire.proccessusActivite(nom,annee);
        System.out.println(message);    
        
        System.out.println("Voulez-vous réessayer ? (O/N) ");
        reponse = clavier.nextLine().charAt(0);          
        }        
        System.out.println("Au revoir…");
    }  
}

