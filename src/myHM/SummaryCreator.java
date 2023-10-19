package myHM;

import java.util.Arrays;

public class SummaryCreator {
    public  String create(String text) {
    int del = 15;
   String[] array = text.split("(?<=\\G.{" + del + "})");
        System.out.println(Arrays.toString(array));
        return array.toString();
    }

}
class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";

        System.out.println(summaryCreator.create(longPhrase));
    }
}