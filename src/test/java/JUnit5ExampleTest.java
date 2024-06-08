
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class JUnit5ExampleTest {
    @BeforeAll
    static void presetForTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://github.com/selenide/selenide");
    }

    @Test
    void jUnit5ExampleTest() {
        //в wiki можно перейти по сслыке
        //open("/wiki");
        //либо кликнув по табу
        $("#wiki-tab").click();

        $("#wiki-pages-filter").setValue("SoftA");
        $(byText("SoftAssertions")).click();

        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));


    }
}
