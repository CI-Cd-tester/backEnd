package org.example;

public class Encrypting {

   public void wordToEncrypt(String word) {

       char [] encryptedWord = word.toCharArray();
       StringBuilder encryptedWordResult = new StringBuilder();

       for (char c : encryptedWord) {

           c+= 2;
           encryptedWordResult.append(c);
       }
       System.out.println("Encrypted word is " + encryptedWordResult);
    }
}
