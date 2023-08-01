package mobile
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import wp.test.mobile.wattpad.LoginWattpadObject

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginWattpad {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	LoginWattpadObject loginPage = new LoginWattpadObject()

	@Given("Users is on login screen")
	def ClickIconLogin() {
		//		Mobile.startExistingApplication('wp.wattpad')
		Mobile.startApplication('/Users/fhelish/Downloads/Wattpad - Read & Write Stories_10.22.0_Apkpure.apk', true)
		Mobile.delay(3)
		Mobile.waitForElementPresent(loginPage.btnSignIn(), 30)
		Mobile.delay(3)
		Mobile.tap(loginPage.btnSignIn(), 30)
	}

	@When("Users input username (.*)")
	def InputUsername(String username) {
		Mobile.tap(loginPage.inputUsername(), 30)
		Mobile.delay(3)
		Mobile.setText(loginPage.inputUsername(), username, 30)
	}

	@And("Users input password (.*)")
	def InputPassword(String password) {
		Mobile.tap(loginPage.inputPassword(), 30)
		Mobile.setText(loginPage.inputPassword(), password, 30)
	}

	@And("Users click button login")
	def ClickButtonLogin() {
		Mobile.tap(loginPage.btnLogin(), 30)
	}

	@Then("Users can see validation of login button (.*)")
	def ShowingInformation(String status) {
		if(status == 'success') {
			Mobile.waitForElementPresent(loginPage.txtHome(), 30)
			Mobile.comment(status)
		} else if(status == 'username field is empty') {
			Mobile.waitForElementPresent(loginPage.usernameFieldEmpty(), 30)
			Mobile.comment(status)
		} else if(status == 'password field is empty') {
			Mobile.waitForElementPresent(loginPage.passwordFieldEmpty(), 30)
			Mobile.comment(status)
		} else if(status == 'login failed') {
			Mobile.waitForElementPresent(loginPage.loginFailed(), 30)
			Mobile.comment(status)
		} else {
			Mobile.comment('others')
		}
	}
}