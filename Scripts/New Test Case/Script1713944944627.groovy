import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.microsoftonline.com/fa6434db-4921-4ae3-8a0c-60977ad6c33c/oauth2/v2.0/authorize?client_id=1f730c1e-78f1-4e57-bcd3-492d96249821&redirect_uri=https%3A%2F%2Fptsg-4wiz-wb01.azurewebsites.net%2Fsignin-oidc&response_type=code&scope=openid%20profile%20offline_access%20User.Read&code_challenge=kKIxbQsf1DP_p7Do6jYyYlzG527w1u_1J5XG0Rnpym8&code_challenge_method=S256&response_mode=form_post&nonce=638495416999052848.ZTYyZWJkNWQtZDBhYS00NGU3LTgzMGEtYWYyZmQ5YWJiYzE5OGNmNTMwMGItYjU0OC00Y2U3LWE3ODUtZGI4MzBhYWExZGIw&client_info=1&x-client-brkrver=IDWeb.1.25.10.0&state=CfDJ8NDZpXKv0txLmwY8z211dQn8VZZwRZ_19hcXxrKcRiH_32Y2j2te8QQJT5RPQzTA8pQqAZZ79fBibyNNJVrTNCmoVbUgUSvnE14rTCZmklcG8ixX23LJhcc9IVw5aSvcPHLU5KMqhhIURLU4iomZbcG_0d9ZseuDWnB80TjrdsAiQ3MkM_iyhO-uLeAMUbJOR5xqBTPWVUil0ci55jjWTYJvp1jZhrQsulQJO-_4OvBqSstyOxcoYnB5M_LZAn8pnsoY38mTS1kMzOrOYzlSJb4n2GRyA0ddLzzuq1ZTmTVev7g8Y0jDtkMur32JeFUQB1m9_k82zLDk8aJ6F04MMtiCducO22h5ZMy06sj-lsn2fxgfSgRkF21Ko2NzHDJJJXwX3nvSt0824uGu_5SmFEo&x-client-SKU=ID_NET6_0&x-client-ver=6.25.1.0')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'zulhelmiazri.ali@stag.petronas.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'RoA8MurjccNzZL94ilGDddhITWxpblCX')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

