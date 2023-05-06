package Orange.Pages;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private ButtonPages buttonPages;
    private Questions questions;

    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.XPATH, using = "//*[@name = 'password']")
    private WebElement txtPass;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);

    }

    public void fillOutLogin(String userName, String password) {
        this.txtUser.sendKeys(userName);
        this.txtPass.sendKeys(password);
        this.buttonPages.btnLogin();
    }

    public void validateDashboard(){
       //this.questions.tiempoSegundos(1);
        this.questions.validateDashboard();
    }

}
