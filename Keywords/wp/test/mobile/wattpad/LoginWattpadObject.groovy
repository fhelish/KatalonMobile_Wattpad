package wp.test.mobile.wattpad

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import wp.test.basepageobject.BasePageObject

import internal.GlobalVariable

public class LoginWattpadObject extends BasePageObject {

	private TestObject btnSignIn
	private TestObject inputUsername
	private TestObject inputPassword
	private TestObject btnLogin
	private TestObject txtHome
	private TestObject usernameFieldEmpty
	private TestObject passwordFieldEmpty
	private TestObject loginFailed
	private TestObject btnSearch
	private TestObject btnFilter
	private TestObject txtResult

	public TestObject btnSignIn(){
		btnSignIn = createTestObjectByXpath("btnSignIn", "//*[@class = 'android.widget.TextView' and (@text = 'If you have an account, Sign in' or . = 'If you have an account, Sign in') and @resource-id = 'wp.wattpad:id/log_in_button']")
	}

	public TestObject inputUsername(){
		inputUsername = createTestObjectByXpath("inputUsername", "//*[@class = 'android.widget.EditText' and (@text = 'Username' or . = 'Username') and @resource-id = 'wp.wattpad:id/validate_content_field']")
	}

	public TestObject inputPassword(){
		inputPassword = createTestObjectByXpath("inputPassword", "//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password') and @resource-id = 'wp.wattpad:id/validate_content_field']")
	}

	public TestObject btnLogin(){
		btnLogin = createTestObjectByXpath("btnLogin", "//*[@class = 'android.widget.TextView' and (@text = 'Start Reading' or . = 'Start Reading') and @resource-id = 'wp.wattpad:id/authentication_view_native_auth_button']")
	}

	public TestObject txtHome() {
		txtHome = createTestObjectByXpath("txtHome","//*[@class = 'android.widget.TextView' and (@text = 'Home' or . = 'Home') and @resource-id = 'wp.wattpad:id/app_header_section_screen_name']")
	}

	public TestObject usernameFieldEmpty() {
		usernameFieldEmpty = createTestObjectByXpath("usernameFieldEmpty","//*[@class = 'android.widget.TextView' and (@text = 'Username field is empty.' or . = 'Username field is empty.') and @resource-id = 'wp.wattpad:id/snackbar_text']")
	}

	public TestObject passwordFieldEmpty() {
		passwordFieldEmpty = createTestObjectByXpath("passwordFieldEmpty","//*[@class = 'android.widget.TextView' and (@text = 'Password field is empty.' or . = 'Password field is empty.') and @resource-id = 'wp.wattpad:id/snackbar_text']")
	}

	public TestObject loginFailed() {
		loginFailed = createTestObjectByXpath("loginFailed","//*[@class = 'android.widget.TextView' and (@text = 'Login failed. Invalid user ID or password') and @resource-id = 'wp.wattpad:id/snackbar_text']")
	}

	public TestObject btnSearch() {
		btnSearch = createTestObjectByXpath("btnSearch","//*[@class = 'android.widget.ImageButton' and @resource-id = 'wp.wattpad:id/tab_navigation_bar_search_button' and (@text = '' or . = '')]")
	}

	public TestObject btnFilter() {
		btnFilter = createTestObjectByXpath("btnFilter","//*[@class = 'android.widget.TextView' and (@text = 'Adventure' or . = 'Adventure') and @resource-id = 'wp.wattpad:id/discover_search_topic_name']")
	}

	public TestObject txtResult() {
		txtResult = createTestObjectByXpath("txtResult","//*[@class = 'android.widget.TextView' and (@text = 'Adventure' or . = 'Adventure')]")
	}
}
