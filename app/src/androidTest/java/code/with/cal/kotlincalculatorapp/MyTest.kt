package code.with.cal.kotlincalculatorapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyTest {
    @get:Rule
    var activityActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun plus() {
        onView(withId(R.id.button5)).perform(click())
        onView(withId(R.id.buttonplus)).perform(click())
        onView(withId(R.id.button7)).perform(click())
        onView(withId(R.id.bequal)).perform(click())
        onView(withId(R.id.resultsTV)).check(matches(withText("12.0")))
    }

    @Test
    fun delete() {
        onView(withId(R.id.button8)).perform(click())
        onView(withId(R.id.buttonplus)).perform(click())
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.buttondel)).perform(click())
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.workingsTV)).check(matches(withText("8+2")))
        onView(withId(R.id.buttondel)).perform(click())
        onView(withId(R.id.buttondel)).perform(click())
        onView(withId(R.id.buttondel)).perform(click())
        onView(withId(R.id.workingsTV)).check(matches(withText("")))
    }

    @Test
    fun equal() {
        onView(withId(R.id.button9)).perform(click())
        onView(withId(R.id.bequal)).perform(click())
        onView(withId(R.id.resultsTV)).check(matches(withText("9.0")))
    }

    @Test
    fun windowTV() {
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.buttonplus)).perform(click())
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.buttonminus)).perform(click())
        onView(withId(R.id.button7)).perform(click())
        onView(withId(R.id.bequal)).perform(click())
        onView(withId(R.id.workingsTV)).check(matches(withText("1+2-7")))
        onView(withId(R.id.resultsTV)).check(matches(withText("-4.0")))
    }

    @Test
    fun AC() {
        onView(withId(R.id.button9)).perform(click())
        onView(withId(R.id.buttonplus)).perform(click())
        onView(withId(R.id.button7)).perform(click())
        onView(withId(R.id.bequal)).perform(click())
        onView(withId(R.id.buttonAC)).perform(click())
        onView(withId(R.id.workingsTV)).check(matches(withText("")))
        onView(withId(R.id.resultsTV)).check(matches(withText("")))

    }

    @Test
    fun zerrodev() {
        onView(withId(R.id.button9)).perform(click())
        onView(withId(R.id.buttondev)).perform(click())
        onView(withId(R.id.button0)).perform(click())
        onView(withId(R.id.bequal)).perform(click())
        onView(withId(R.id.resultsTV)).check(matches(withText("Infinity")))

    }














}