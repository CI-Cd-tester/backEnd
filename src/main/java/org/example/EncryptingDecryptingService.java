package org.example;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncryptingDecryptingService {
    private SecretKey secretKey;
    public EncryptingDecryptingService() throws NoSuchAlgorithmException {
        KeyGenerator keyGen=KeyGenerator.getInstance("AES");
        keyGen.init(128);
        this.secretKey = keyGen.generateKey();
    }

    public String encrypt(String textToEncrypt) throws Exception {

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(textToEncrypt.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public String decrypt(String encryptedText) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }

    public SecretKey getSecretKey() {
        return secretKey;
    }
}
