package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtFirstPlace(){
        open("https://github.com/");
        $("[data-unscoped-placeholder=\"Search GitHub\"]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();

        $("#repository-container-header").shouldHave(text("selenide / selenide"));

    }
}
