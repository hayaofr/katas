package gca.caps;

import gca.caps.leapyear.LeapYear;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LeapYearTest {

    @Test
    public void should_return_false_for_2001() {
        // Given

        LeapYear leapYear = new LeapYear();


        // When

        boolean isLeap = leapYear.isLeap(2001);

        // Then

        Assertions.assertThat(isLeap).isFalse();
    }


    @Test
    public void should_return_true_for_1996() {
        // Given

        LeapYear leapYear = new LeapYear();


        // When

        boolean isLeap = leapYear.isLeap(1996);

        // Then

        Assertions.assertThat(isLeap).isTrue();
    }

    @Test
    public void should_return_false_for_1800() {
        // Given

        LeapYear leapYear = new LeapYear();


        // When

        boolean isLeap = leapYear.isLeap(1800);

        // Then

        Assertions.assertThat(isLeap).isFalse();
    }

    @Test
    public void should_return_false_for_2000() {
        // Given

        LeapYear leapYear = new LeapYear();

        // When

        boolean isLeap = leapYear.isLeap(2000);

        // Then

        Assertions.assertThat(isLeap).isTrue();
    }

    @Test
    public void should_return_false_for_1600() {
        // Given

        LeapYear leapYear = new LeapYear();

        // When

        boolean isLeap = leapYear.isLeap(1600);

        // Then

        Assertions.assertThat(isLeap).isTrue();
    }



}
