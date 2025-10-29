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

WebUI.openBrowser('https://demoqa.com/automation-practice-form')

//WebUI.maximizeWindow()
WebUI.verifyElementPresent(findTestObject('Practice form/titlePracticeForm - txt'), 0)

WebUI.scrollToElement(findTestObject('Practice form/firstName - field'), 5)

WebUI.setText(findTestObject('Practice form/firstName - field'), 'Ahmad')

WebUI.setText(findTestObject('Practice form/lastName - field'), 'Nurahmad')

WebUI.setText(findTestObject('Practice form/email - field'), 'ahmad@example.com')

WebUI.scrollToElement(findTestObject('Practice form/genderMale - radio'), 1)

WebUI.click(findTestObject('Practice form/genderMale - radio'))

WebUI.scrollToElement(findTestObject('Practice form/phoneNumber - field'), 1)

WebUI.scrollToElement(findTestObject('Practice form/submit - btn'), 0)

WebUI.setText(findTestObject('Practice form/currentAddress - field'), 'Jl. Raya Sana No. 31')

WebUI.scrollToElement(findTestObject('Practice form/submit - btn'), 0)

WebUI.click(findTestObject('Practice form/submit - btn'))

WebUI.delay(5)

WebUI.closeBrowser()