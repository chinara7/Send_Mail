package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_test {
    WebDriver base_element;

    @Given("Go to google")
    public void go_to_google_func(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
        base_element=new ChromeDriver();
        base_element.manage().window().maximize();
        base_element.get("https://google.com");
    }

    @When("Enter gmail")
    public void enter_gmail_func() throws InterruptedException {
        WebElement enter_gm = base_element.findElement(By.className("gb_j"));
        enter_gm.click();
        Thread.sleep(1000);
    }

    @Then("Click register")
    public void click_register_func() throws InterruptedException {
        WebElement click_rg = base_element.findElement(By.xpath("//a[contains(@href,'https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser')]"));
        click_rg.click();
        Thread.sleep(1000);
    }

    @And("Add gmail account")
    public void add_gmail_account_func() throws InterruptedException {
        WebElement add_gm_acc = base_element.findElement(By.id("identifierId"));
//        add_gm_acc.click();
        add_gm_acc.sendKeys("testchinara@gmail.com");
        Thread.sleep(1000);
    }

    @And("Click account next")
    public void click_account_next_func() throws InterruptedException {
        WebElement click_acc_next = base_element.findElement(By.id("identifierNext"));
        click_acc_next.click();
        Thread.sleep(3000);
    }

//    @And("Click show password")
//    public void click_show_password_func() throws InterruptedException {
//        WebElement click_sh_pw = base_element.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
//        click_sh_pw.click();
//        Thread.sleep(1000);     // passed ancaq islemir
//    }

    @And("Add gmail password")
    public void add_gmail_password_func() throws InterruptedException {
        Thread.sleep(2000);
        WebElement add_gm_pw = base_element.findElement(By.xpath("//input[@type='password']"));
        add_gm_pw.click();
        add_gm_pw.sendKeys("test1234ch");
        Thread.sleep(1000);
    }

    @And("Click password next")
    public void click_password_next_func() throws InterruptedException {
        WebElement click_pw_next = base_element.findElement(By.id("passwordNext"));
        click_pw_next.click();
        Thread.sleep(1000);
    }

//    @And("Click try another way")
//    public void click_try_another_func() throws InterruptedException {
//        WebElement click_an_way = base_element.findElement(By.className("VfPpkd-vQzf8d"));
//        click_an_way.click();
//        Thread.sleep(3000);
//    }

//    @And("Add phone number")
//    public void add_phone_number_func() throws InterruptedException {
//        WebElement add_ph_num = base_element.findElement(By.id("phoneNumberId"));
//        add_ph_num.click();
//        Thread.sleep(1000);
//    }

    @And("Create new mail")
    public void create_new_mail_func() throws InterruptedException{
        Thread.sleep(4000);
        WebElement cr_new_mail = base_element.findElement(By.xpath("//div[@class='z0']/div[1]"));
        cr_new_mail.click();
        Thread.sleep(3000);
    }

    @And("Add mail to")
    public void add_mail_to_func() throws InterruptedException{
        WebElement add_mail_to = base_element.findElement(By.xpath("//div[@class='aH9']/input[1]"));
        add_mail_to.sendKeys("alakbarli1905@gmail.com");
        Thread.sleep(1000);
    }

    @And("Add subject")
    public void add_subject_func() throws InterruptedException{
        WebElement add_sbj = base_element.findElement(By.xpath("//input[@name='subjectbox']"));
        add_sbj.sendKeys("Automation test mail");
        Thread.sleep(2000);
    }

    @And("Add mail text")
    public void add_mail_text_func() throws InterruptedException{
        WebElement add_mail_txt = base_element.findElement(By.xpath("//td[@class='Ap']/div[2]/div[1]"));
        Thread.sleep(4000);
//        add_mail_txt.sendKeys("Salam, müəllim. Bu elektron poçtu automation test ilə göndərirəm. :)");
//        add_mail_txt.sendKeys("Çox sağolun, müəllim. Haqqınızı halal edin. Bir də narahat etmərəmsə bu testi təkrar-təkrar işlədəcəm.");
        add_mail_txt.sendKeys("Send for testing");
        Thread.sleep(5000);
    }

    @And("Click send button")
    public void click_send_button_func() throws InterruptedException{
        WebElement click_send_btn = base_element.findElement(By.xpath("//div[@class='dC']/div[1]"));
        click_send_btn.click();
        Thread.sleep(1000);
    }
}
