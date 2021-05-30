package com.example.lab_42;

import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@MediumTest
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testWhenTextStringIsEnteredToTxtMain() {
        final String givenString = "Hello   world   with    extra    empty spaces  ";
        final String expectedResult = "Hello world with extra empty spaces ";

        //Not working: https://stackoverflow.com/questions/20436968/espresso-typetext-not-working
        //onView(withId(R.id.txtMain)).perform(click(), typeText(givenString));

        onView(withId(R.id.txtMain)).perform(click(), replaceText(givenString));
        onView(withId(R.id.btnMain)).perform(click());
        onView(withId(R.id.lblMain)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenEmptyStringIsEnteredToTxtMain() {
        final String givenString = "";
        final String expectedResult = "";

        //Not working: https://stackoverflow.com/questions/20436968/espresso-typetext-not-working
        //onView(withId(R.id.txtMain)).perform(click(), typeText(givenString));

        onView(withId(R.id.txtMain)).perform(click(), replaceText(givenString));
        onView(withId(R.id.btnMain)).perform(click());
        onView(withId(R.id.lblMain)).check(matches(withText(expectedResult)));
    }
}
