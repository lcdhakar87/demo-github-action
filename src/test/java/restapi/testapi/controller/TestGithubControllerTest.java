package restapi.testapi.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGithubControllerTest {

    @Test
    void test_ShouldReturnExpectedString() {
        TestGithubController controller = new TestGithubController();
        String result = controller.test();

        Assertions.assertEquals("Successfully!. 936", result);
    }
}
