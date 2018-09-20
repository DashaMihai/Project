package facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageNotSpam {

	@FindBy(xpath = "(//*[text()='�� ����'])[1]")
	private WebElement spamButton;

	@FindBy(xpath = "//span[text()='������ ���������� � ����� ���������']")
	private WebElement messageOutSpamLink;

	public MessageNotSpam(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void clickNotSpamButton() {
		spamButton.click();
	}

	public boolean MessageOutSpamPresents() {
		return messageOutSpamLink.isDisplayed();
	}

}
