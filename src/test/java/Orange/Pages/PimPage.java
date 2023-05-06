package Orange.Pages;
import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;
    private Questions questions;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement txtName;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddleName;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement txtLastName;

    @FindBy(how = How.XPATH, using = "//button[text()=' Save ']")
    private WebElement btnSave;

    public PimPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions((driver));
    }


    public void llegarAddEmployee(){
        this.buttonPages.btnPim();
        this.buttonPages.btnAddEmployee();
    }

public void fillOutAddEmployee(String firstName, String middleName, String lastName){
        this.txtName.sendKeys(firstName);
        this.txtMiddleName.sendKeys(middleName);
        this.txtLastName.sendKeys(lastName);
        this.questions.tiempoSegundos(3);
        this.questions.screenShot();
        this.btnSave.isEnabled();
        this.btnSave.sendKeys(Keys.ENTER);
}

}
