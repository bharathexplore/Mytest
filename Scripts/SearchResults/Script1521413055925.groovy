import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://s-www.cengage.com/')

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/a_Students'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/searchbox'))

WebUI.setText(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/input_q'), 'science')

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/svg'))

def myobj = new TestObject('customObject')

myobj.addProperty('css', ConditionType.EQUALS, 'div[class=\'ceng-searchResults_searchListingsItem ng-scope\']')

def val = WebUiCommonHelper.findWebElements(myobj, 2)

def b = val.size()
def testresults = new TestObject('customObject')
myobj.addProperty('xpath', ConditionType.EQUALS, 'div[class=\'ceng-searchResults_searchListingsItem ng-scope\']')
print('xxxxxxxxxxxxxxxxxxxxxxxx' + b)
Random random = new Random()
def t= random.nextInt(b)
print '++++++++++++++++++++'+t
	testresults.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'6ec257aa-e907-42c0-8009-7350c1934037\']/div[2]/div[2]/div['+t+']/a[2]')
	WebUI.click(testresults)


