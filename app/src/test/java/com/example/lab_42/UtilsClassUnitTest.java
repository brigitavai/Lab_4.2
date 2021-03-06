package com.example.lab_42;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsClassUnitTest {
    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_removeExcessiveSpacesFromStringIsCalled_Then_NullPointerExceptionIsThrown(){
        Utils.removeExcessiveSpacesFromString(null);
    }

    @Test
    public void Given_EmptyString_When_removeExcessiveSpacesFromStringIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = "";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfMultipleEmptySpaces_When_removeExcessiveSpacesFromStringIsCalled_Then_EmptyStringIsReturned(){
        final String givenString = "   ";

        final String expectedResult = "";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_removeExcessiveSpacesFromStringIsCalled_Then_StringWithoutExcessiveSpacesIsReturned(){
        final String givenString = "Hello   world yey!  ";

        final String expectedResult = "Hello world yey!";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }
}
