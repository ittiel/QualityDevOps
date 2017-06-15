package integrationTests.com.example;


import com.example.Hello;
import com.example.HelloApp;
import integrationTests.webApp.configurations.IntegrationTestsCategory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Integration test for the HelloApp program.
 * <p/>
 * An integration test verifies the workings of a complete program, a module, or a set of dependant classes.
 * <p/>
 * This integration test uses system-rules, an extension for JUnit that lets you test System.out and System.exit()
 * etc.:
 * <p/>
 * http://www.stefan-birkner.de/system-rules
 */
public class HelloWithTestsIT {



    @Test
    @Category(IntegrationTestsCategory.IntegrationTests.class)
    public void doesItSayHelloTest() {
        String[] args = {"1"};
        HelloApp.main(args);

        assertThat(Hello.HELLO + "\n", is(equalTo(Hello.HELLO + "\n")));
    }

    @Test
    @Category(IntegrationTestsCategory.IntegrationTests.class)
    public void doesItSayHelloTest3() {
        String[] args = {"3"};
        HelloApp.main(args);

        String thrice = Hello.HELLO + "\n" + Hello.HELLO + "\n" + Hello.HELLO + "\n";
        assertThat(thrice, is(equalTo(thrice)));
    }
}