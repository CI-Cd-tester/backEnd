package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EncryptingDecryptingServiceTest {
  private  EncryptingDecryptingService encryptingDecryptingService;

  @BeforeEach
    void setUp() throws Exception {
      encryptingDecryptingService = new EncryptingDecryptingService();
  }

  @Test
    void encryptDecrypt() throws Exception {

      String testText = "This is a test text to test encrypting and decrypting";
      String encryptedText = encryptingDecryptingService.encrypt(testText);
      String decryptedText = encryptingDecryptingService.decrypt(encryptedText);

      assertEquals(testText, decryptedText);
  }
}