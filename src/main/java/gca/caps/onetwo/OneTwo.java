package gca.caps.onetwo;

import java.util.ArrayDeque;
import java.util.Deque;

public class OneTwo {
    public String process(String inputSentence) {

        Deque<String> stringDeque = new ArrayDeque<String>();



        String result = "";

        String[] numbers = inputSentence.split(" ");


        String currentNumber = numbers[0];
        int currentCount = 1;

        for (String number : numbers) {
            if (currentNumber.equals(number)) {
                currentCount++;
            } else {

                numberToText(currentCount);
                result += numberToText(currentCount) + " " + numberToText(Integer.parseInt(currentNumber)) + " ";

                currentCount = 1;
                currentNumber = number;

            }
        }

        return result;


//        if ("1 2".equals(inputSentence)) {
//            return "one one one two";
//        }
//
//        if ("2 2".equals(inputSentence)) {
//            return "two two";
//        }
//
//        return "one two";
    }

    private String numberToText(int number) {

        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "unknown";
        }
    }
}
