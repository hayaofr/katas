package gca.caps.onetwo;


import org.assertj.core.api.Assertions;
import org.junit.Test;


public class OneTwoTest {

    @Test
    public void should_return_one_two_with_2() {
        // Given

        OneTwo oneTwo = new OneTwo();

        // When

        String resultat = oneTwo.process("2");

        // Then

        Assertions.assertThat(resultat).isEqualTo("one two");

    }

    @Test
    public void should_return_one_one_one_two_with_1_2() {
        // Given

        OneTwo oneTwo = new OneTwo();

        // When

        String resultat = oneTwo.process("1 2");

        // Then

        Assertions.assertThat(resultat).isEqualTo("one one one two");

    }

    @Test
    public void should_return_two_two_with_2_2() {
        // Given

        OneTwo oneTwo = new OneTwo();

        // When

        String resultat = oneTwo.process("2 2");

        // Then

        Assertions.assertThat(resultat).isEqualTo("two two");

    }

    @Test
    public void should_return_one_three_three_nine_two_eight_with_3_9_9_9_8_8() {
        // Given

        OneTwo oneTwo = new OneTwo();

        // When

        String resultat = oneTwo.process("3 9 9 9 8 8");

        // Then

        Assertions.assertThat(resultat).isEqualTo("one three three nine two eight");

    }


}
