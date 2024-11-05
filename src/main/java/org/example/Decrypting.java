package org.example;

public class Decrypting {
    public void decrypt(String text) {

        char[] wordToDecrypt = text.toCharArray();
        StringBuilder decryptedText = new StringBuilder();
        for(char c : wordToDecrypt) {
            c-=2;
            decryptedText.append(c);
        }
        System.out.println("The decrypted text is: " + decryptedText);
    }
}
