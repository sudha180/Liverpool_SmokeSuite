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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciar sesion'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.AMUsername, ('password') : GlobalVariable.AMpassword], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/AfterLogin_Homepage'))

WebUI.click(findTestObject('AccountManagement/MyAccountButton_Account'))

WebUI.click(findTestObject('AccountManagement/DeliveryAddress_Account'))

WebUI.click(findTestObject('AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('AccountManagement/AddClickNCollectionAddress_Account'))

WebUI.click(findTestObject('AccountManagement/SelectStateClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/StateOptionClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/SelectAddressRadioButton_Account'))

StoreAddress = WebUI.getText(findTestObject('AccountManagement/StoreNameClickNCollection_Account'))

WebUI.scrollToElement(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'), 0)

WebUI.click(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'))

WebUI.verifyElementPresent(findTestObject('AccountManagement/ClickNCollectionFirstAddress_Account'), 0)

address = WebUI.getText(findTestObject('AccountManagement/ClickNCollectionFirstAddress_Account'), FailureHandling.STOP_ON_FAILURE)

if (StoreAddress == address) {
    println('Address is Added !')
} else {
    KeywordUtil.markFailed('Address is not Added !')
}

WebUI.closeBrowser()

