/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzenetek_app;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Diak
 */
public class Uzenetek_app {

    
    private static Map<String, User> Users = new HashMap<>();
    
    
    public static void Uzenetek_lista () {
        
        System.out.println("Kerem adja meg az e-mail címet!");
        
        Scanner sc = new Scanner(System.in);
        
        String email_kuldo = sc.nextLine();
    
        System.out.println(Users.get(email_kuldo));
        
        int szam;
        
        do {
                    
        String  menuString;
        
            System.out.println("Adja meg mit szeretne csinálni!");
            
            System.out.println("1 - Uj uzenet");
            System.out.println("2 - Login kepernyo");
            Scanner sc4 = new Scanner(System.in);
            szam = sc4.nextInt();
            
        switch (szam) {
            
            case 1 : menuString = "Uj uzenet";
            
                ujUzenet(email_kuldo);
                
                break;
            case 2 : menuString = "Login kepernyo";
                
                
            
            
                break;
            default: menuString = "Helytelen számot adott meg!";    
        }
            
            }while(szam != 2);
        
        
    }
    
    public static void ujUzenet(String email_kuldo) {
        
        System.out.println("Adja meg az üzenet címzettet!");
                Scanner sc2 = new Scanner(System.in);
                String cimzett = sc2.nextLine();
                
                System.out.println("Irja le az üzenetet!");
                String uzenet = sc2.nextLine();
                
                Message uzenet_2 = new Message(uzenet, Users.get(email_kuldo), Users.get(cimzett));
                
                Users.get(cimzett).ujFogadott(uzenet_2);
                Users.get(email_kuldo).ujKimeno(uzenet_2);
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        
    
    
    Users.put("John@gmail.com", new User(1, "John"));
    Users.put("Lucas@gmail.com", new User(2, "Lucas"));
    Users.put("Ann@gmail.com", new User(3, "Ann"));
    
         
        
    Message uzenet_1 = new Message("Szia, hogy vagy?", Users.get("John@gmail.com"), Users.get("Ann@gmail.com")); 
       
    Users.get("Ann@gmail.com").ujFogadott(uzenet_1);
    Users.get("John@gmail.com").ujKimeno(uzenet_1);
         
     
        
    int szam_fo;
    int szam;
    
   
    
        do{
        
            System.out.println("Adja meg mit szertne csinálni!");   
            
            System.out.println("1 - Belepes");
            System.out.println("2 - Kilepes");
            
        Scanner sc3 = new Scanner (System.in);
    
        szam_fo = sc3.nextInt();
            
        String fomenu;
        switch(szam_fo) {
        
            case 1: fomenu = "Belepes";
                    
                    Uzenetek_lista();
                
                   break;
                
                
        
            case 2: fomenu = "Kilepes";
                
                break;
        }        
     
    
        }while (szam_fo != 2);
        
    }
    
}
