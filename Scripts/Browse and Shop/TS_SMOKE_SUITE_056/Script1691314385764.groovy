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

WebUI.navigateToUrl(GlobalVariable.url)

a = CustomKeywords.'a.GenerateRandomEmail.generateRandomEmail'()
System.out.println(a)

WebUI.mouseOver(findTestObject('HomePage/Departamentos'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/L1_Category1_HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CLPPage/SubCategory1_leftmenu_CLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CLPPage/SubCategory1_leftmenu_CLP'), FailureHandling.STOP_ON_FAILURE)

'verify price range\r\n'
WebUI.click(findTestObject('PLPPage/product1_PLP'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('PDPPage/discountPrice_PDP'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('PDPPage/breadCrumb_pdp'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('PDPPage/Colour1_PDP'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('PDPPage/mas detalis(more detail)'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('PDPPage/AddToCart_PDP'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('PDPPage/Alternate_Img_pdp'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('PDPPage/Detail_PDP'))

WebUI.closeBrowser()

