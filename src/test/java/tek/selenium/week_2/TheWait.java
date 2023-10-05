package tek.selenium.week_2;

public class TheWait {
    public static void main(String[] args) {
        //Thread.sleep() comes from java.
        //The problem with Thread.sleep is that it will delay and wait for the exact time you give it.
        //sometimes the elements in testing may load faster or later, so we always don't know the exact time.
        //Selenium is way fast and if it can't find the element it will throw no such element found Exception.

        // THis is The reason we have Selenium Synchronized Wait.
        //Selenium Synchronized wait comes from Selenium package itself.
        // we give it a maximum time, it will wait and constantly check during the wait time if it can find element
        // as soon as it find it will go on and if it couldn't find it will throw NO Such element found Exception.

        // Selenium Implicit:is global wait for all elements for current Browser session.

        //Selenium Explicitly: it will wait under an expected condition, until a specific element is visible or found.
        //
    }
}
