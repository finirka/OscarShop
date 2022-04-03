package tests.home_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

import static helpers.APIHelper.thisIsStaticMethod;

public class HomePageTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void initTest(){
        homePage = new HomePage();
    }

    @Test
    public void test1() {
        thisIsStaticMethod();
        System.out.println("This is first test");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2() {
        thisIsStaticMethod();
        System.out.println("This is second test");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
