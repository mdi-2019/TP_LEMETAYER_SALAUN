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
        
        boolean exit=false;
        while(!exit) {
        	System.out.println("Veuillez saisir un mot :");
        	String str = sc.nextLine();
        	System.out.println("Vous avez saisi : " + str);
        	if(str.equals("exit")) {
        		exit=true;
        	}
        }
        
        System.out.println( "\n_____________________________________________________\n" );
        System.out.println( "	Merci!!!!!!!!!!" );
        System.out.println( "\n_____________________________________________________\n" );
    }
}
