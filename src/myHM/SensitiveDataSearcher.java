package myHM;

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String tmp = phrase.toLowerCase();
     if (tmp.contains("pass") || tmp.contains("key") || tmp.contains("login") || tmp.contains("email")) {
         return true;
     }
     return false;
    }
}
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
//pass, key, login, email
// Він приймає рядок і повертає true, якщо у рядку є чутливі дані.