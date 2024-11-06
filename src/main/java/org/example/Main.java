package org.example;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

try{
        EncryptingDecryptingService encryptingDecryptingService = new EncryptingDecryptingService();

        do{

            System.out.println("Type E/e to encrypt\n D/d to decrypt\n or q to quit : ");
            String choice= scanner.next().toLowerCase();

            switch (choice){
                case "e":
                    System.out.println("Text to encrypt: ");
                    String wordToEncrypt= scanner.next();

                    try {
                        String encryptedText= encryptingDecryptingService.encrypt(wordToEncrypt);
                        System.out.println("The encrypted text is: " + encryptedText);
                    } catch (Exception e) {
                        System.out.println("Something went wrong during encryption  " + e.getMessage());
                    }

                    break;
                case "d":
                    System.out.println("Text to decrypt: ");
                    String wordToDecrypt= scanner.next();
                    try{

                        String decryptedText = encryptingDecryptingService.decrypt(wordToDecrypt);
                        System.out.println("The decrypted text is: " + decryptedText);

                    }catch (Exception e){
                        System.out.println("Something went wrong during decryption  " + e.getMessage());
                    }
                    break;

                case  "q":
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
            if (choice.equals("q")){
                break;
            }

        }while (true);

    }catch(NoSuchAlgorithmException  e) {
    System.out.println("Something went wrong   " + e.getMessage());
        }
    }
}