package Orange.Definitions;

import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import Orange.Steps.Questions;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private PimPage pimPage = new PimPage(driver);



    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();

    }


    @When("^the user fill out name (.*) and password (.*)$")
    public void fillOutLogin(String userName, String password) {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, password);

    }

    @Then("^the user validate page Dashboard$")
    public void validateDashboard(){
        this.loginPage = new LoginPage(driver);
        this.loginPage.validateDashboard();

    }

    @When("^the user access to add employee$")
    public void llegarAddEmployee(){
    this.pimPage = new PimPage(driver);
    this.pimPage.llegarAddEmployee();

    }

    @When("^the user fill out first name (.*) middlename (.*) and lastname (.*)$")
    public void fillOutAddEmployee(String firstName, String middleName, String lastName){
        this.pimPage = new PimPage(driver);
        this.pimPage.fillOutAddEmployee(firstName, middleName, lastName);
    }
}