package gca.caps;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void should_empty_string_return_0 () {
    // Given
        StringCalculator stringCalculator = new StringCalculator();

    // When
        int result = stringCalculator.add("");

    // Then
        Assertions.assertThat(result).isEqualTo(0);

    }

    @Test
    public void should_2_string_return_2 () {
        // Given
        StringCalculator stringCalculator = new StringCalculator();

        // When
        int result = stringCalculator.add("2");

        // Then
        Assertions.assertThat(result).isEqualTo(2);

    }

    @Test
    public void should_1_string_return_1 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1");

        // Then

        Assertions.assertThat(result).isEqualTo(1);

    }

    @Test
    public void should_1_coma_2_string_return_3 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1,2");

        // Then

        Assertions.assertThat(result).isEqualTo(3);

    }

    @Test
    public void should_1_coma_3_string_return_4 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1,3");

        // Then

        Assertions.assertThat(result).isEqualTo(4);

    }

    @Test
    public void should_1_coma_4_string_return_5 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1,4");

        // Then

        Assertions.assertThat(result).isEqualTo(5);

    }

    @Test
    public void should_2_coma_1_string_return_3 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("2,1");

        // Then

        Assertions.assertThat(result).isEqualTo(3);

    }

    @Test
    public void should_10_coma_1_string_return_1 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("10,1");

        // Then

        Assertions.assertThat(result).isEqualTo(11);

    }

    @Test
    public void should_1_coma_1_coma_1_string_return_3 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1,1,1");

        // Then

        Assertions.assertThat(result).isEqualTo(3);

    }

    @Test
    public void should_1_coma_1_coma_10_string_return_3 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1,1,10");

        // Then

        Assertions.assertThat(result).isEqualTo(12);

    }

    @Test
    public void should_1_coma_1_coma_10_coma_1_string_return_3 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1,1,10,1");

        // Then

        Assertions.assertThat(result).isEqualTo(13);

    }

    @Test
    public void should_1_enter_2_coma_3_string_return_6 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1\n2,3");

        // Then

        Assertions.assertThat(result).isEqualTo(6);

    }

    @Test
    public void should_1_enter_3_coma_3_string_return_7 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("1\n3,3");

        // Then

        Assertions.assertThat(result).isEqualTo(7);

    }

    @Test
    public void should_delimieter_point_virgule_1_point_virgule_2_string_return_3 () {
        // Given

        StringCalculator stringCalculator = new StringCalculator();

        // When

        int result = stringCalculator.add("//;\n1;2");

        // Then

        Assertions.assertThat(result).isEqualTo(3);

    }

}
