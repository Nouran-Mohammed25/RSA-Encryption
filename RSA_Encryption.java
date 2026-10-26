/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathematical_Assignment;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author nouran 220191336
 */
public class RSA_Encryption {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" RSA Encryption");
        
       
        System.out.print("Enter the message to encrypt: ");
        String message = input.nextLine();
        
        System.out.print("Enter n (n = p * q): ");
        BigInteger n = input.nextBigInteger();
        
        System.out.print("Enter e public exponent: ");
        BigInteger e = input.nextBigInteger();
        
        BigInteger[] encryptedMessage = new BigInteger[message.length()];
        
        System.out.println("\n Encryption Process");
        
        for (int i = 0; i < message.length(); i++) {
        
            char currentChar = message.charAt(i);
            int asciiValue = (int) currentChar;
       
            BigInteger M = BigInteger.valueOf(asciiValue);
        
            BigInteger C = M.modPow(e, n);
            
            encryptedMessage[i] = C;
            
            System.out.println("Character '" + currentChar + "' (ASCII: " + asciiValue + ") -> Encrypted: " + C);
        }
        
       
        System.out.println("Ciphertext");
        for (int i = 0; i < encryptedMessage.length; i++) {
            System.out.print(encryptedMessage[i] + " ");
        }
        
        
        input.close();
    }
    }
    











