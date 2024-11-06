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
    void encryptDecryptTest() throws Exception {

      String testText = "This is a test text to test encrypting and decrypting";
      String encryptedText = encryptingDecryptingService.encrypt(testText);
      String decryptedText = encryptingDecryptingService.decrypt(encryptedText);

      assertEquals(testText, decryptedText);
  }

  @Test
  void emptyEncryptDecryptTest() throws Exception {

    String emptyString = "";
    String encryptedText = encryptingDecryptingService.encrypt(emptyString);
    String decryptedText = encryptingDecryptingService.decrypt(encryptedText);

    assertEquals(emptyString, decryptedText);
  }

  @Test
  void specialCharactersTest() throws Exception {
    String testText = "_*'.!@!%∞4n/";
    String encryptedText = encryptingDecryptingService.encrypt(testText);
    String decryptedText = encryptingDecryptingService.decrypt(encryptedText);

    assertEquals(testText, decryptedText);
  }

  @Test
  void differentKeyTest() throws Exception {

    String testText = "This is a test text to test encrypting and decrypting with different key";
    String encryptedText = encryptingDecryptingService.encrypt(testText);
    EncryptingDecryptingService newService= new EncryptingDecryptingService();
    Exception exception = assertThrows(Exception.class,() ->
            newService.decrypt(encryptedText));

    assertEquals(exception.getMessage(),testText);
  }
}