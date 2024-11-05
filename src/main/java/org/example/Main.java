package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Encrypting encrypting = new Encrypting();
        Decrypting decrypting = new Decrypting();

        do{

            System.out.println("Type E/e to encrypt\n D/d to decrypt\n or q to quit : ");
            String word= scanner.next().toLowerCase();
            switch (word){
                case "e":
                    System.out.println("Text to encrypt: ");
                    String wordToEncrypt= scanner.next();
                    encrypting.wordToEncrypt(wordToEncrypt);
                    break;
                case "d":
                    System.out.println("Text to decrypt: ");
                    String wordToDecrypt= scanner.next();
                    decrypting.decrypt(wordToDecrypt);
                    break;

                case  "q":
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }

        }while (true);




    }
}