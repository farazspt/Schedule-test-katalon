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

WebUI.navigateToUrl('https://www.indocyber.co.id/')

WebUI.click(findTestObject('Object Repository/BC Iglo/Page_Home  Indocyber/a_Bootcamp'))

WebUI.click(findTestObject('Object Repository/BC Iglo/Page_Join Bootcamp at Indocyber  Indocyber/button_Apply Now'))

WebUI.setText(findTestObject('Object Repository/BC Iglo/Page_Join Bootcamp at Indocyber  Indocyber/input_JOIN NOW_name'), 
    'Faraz Septarian Adi Nugroho')

WebUI.setText(findTestObject('Object Repository/BC Iglo/Page_Join Bootcamp at Indocyber  Indocyber/input_JOIN NOW_email'), 
    'faraz.spt@indocyber.id')

WebUI.setText(findTestObject('Object Repository/BC Iglo/Page_Join Bootcamp at Indocyber  Indocyber/input_JOIN NOW_handphone'), 
    '0812345678')

WebUI.click(findTestObject('Object Repository/BC Iglo/Page_Join Bootcamp at Indocyber  Indocyber/div_OracleSQL Server.NETJavaMagicJOIN NOWRe_425abe'))

WebUI.closeBrowser()

