package gca.caps;


public class StringCalculator {
    public int add(String numbers) {

        if (isEmptyString(numbers)) {
            return 0;
        }

        if (isSingleNumber(numbers)) {
            return Integer.parseInt(numbers);
        }

        String delimiter = ",";

        String workNumbers = numbers;

        if (hasDelimiter(numbers)) {
            delimiter = extractDelimiter(numbers);
            workNumbers = extractOperation(numbers);
        }

        String checkedNumbers = replaceNewLineByDelimiter(delimiter, workNumbers);

        String[] splittedNumbers = splitNumbersByDelimiter(delimiter, checkedNumbers);

        int result = computeSum(splittedNumbers);

        return result;

    }

    private int computeSum(String[] splittedNumbers) {
        int result = 0;
        for (String splittedNumber : splittedNumbers) {
            result += Integer.parseInt(splittedNumber);
        }
        return result;
    }

    private String[] splitNumbersByDelimiter(String delimiter, String checkedNumbers) {
        return checkedNumbers.split(delimiter);
    }

    private String replaceNewLineByDelimiter(String delimiter, String workNumbers) {
        return workNumbers.replaceAll("\n", delimiter);
    }

    private String extractOperation(String numbers) {
        return numbers.substring(numbers.indexOf("\n") + 1);
    }

    private String extractDelimiter(String numbers) {
        return numbers.substring(numbers.indexOf("//") + 2, numbers.indexOf("\n"));
    }

    private boolean hasDelimiter(String numbers) {
        return numbers.startsWith("//");
    }

    private boolean isEmptyString(String numbers) {
        return "".equals(numbers);
    }


    private boolean isSingleNumber(String numbers) {
        return numbers.length() == 1;
    }
}
