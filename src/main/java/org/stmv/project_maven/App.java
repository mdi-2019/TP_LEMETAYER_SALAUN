package org.stmv.project_maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n_____________________________________________________\n" );
        System.out.println( "	Bienvenue dans la super calculatrice" );
        System.out.println( "\n_____________________________________________________\n" );
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("Entrez votre operateur (Q pour quitter):");
        	String operator = sc.nextLine();
        	
        	if(operator.equals("Q")) {
        		break;
        	}
        	
        	System.out.println("Entrez votre valeur :");
        	double val1 = sc.nextDouble();
        	
        	System.out.println("Entrez votre 2eme valeur :");
        	double val2 = sc.nextDouble();
        	
        	double result=0;
        	
        	System.out.println("Resultat : "+val1+" "+operator+" "+val2+" = "+result);
        	

        }
        
        System.out.println( "\n_____________________________________________________\n" );
        System.out.println( "	Merci!!!!!!!!!!" );
        System.out.println( "\n_____________________________________________________\n" );
    }
}
