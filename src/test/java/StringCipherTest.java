import org.junit.Test;

/**
 * Created by breandan on 9/3/16.
 */
class StringCipherTest {
  String[] dictionary = new String[]{"noon", "Wednesday", "secret"};

  @Test
  void testCipher() {
    String encryptedString = RandomCipher.hardCipher();

    String uniqueCharacters = "";

    for (Character c : encryptedString.toCharArray()) {
      if (!uniqueCharacters.contains(c + "")) {
        uniqueCharacters += c;
      }
    }

    String bestGuess = encryptedString;

    while (containsUnknownWords(encryptedString)) {

    }

  }

  boolean containsUnknownWords(String s) {
//    String[] words = s.split(" ");
//
//    for (String word : words)
//      if (!dictionary.contains(word))
//        return true;
//
    return false;
  }
}