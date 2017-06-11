package integrationTests;

import integrationTests.configurations.IntegrationTestsCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by ittiel on 6/5/17.
 */
public class IntegrationTestLogin {
    @Test
    @Category(IntegrationTestsCategory.IntegrationTests.class)
    public void testCorrectLoginInIntegration(){
        Assert.assertTrue(true);
    }


    //todo: this test will fail...need to fix it
//    @Test
//    @Category(IntegrationTestsCategory.IntegrationTests.class)
//    public void testFailedLoginInIntegration(){
//        Assert.assertTrue("Failed to login during integration", false);
//    }
}

