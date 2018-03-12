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
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.cengage.com/cb/login.htm?app=cmp&targeturl=https://s-www.cengage.com/')

WebUI.maximizeWindow()

Random ran = new Random()

int t = ran.nextInt(100)

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Login or Regist/a_Create a new account'))

WebUI.click(findTestObject('Student_Registration/Page_Cengage/a_Student'))

WebUI.setText(findTestObject('Student_Registration/Page_CengageBrain - Login or Regist/input_email'), ('test' + t) + '@mailinator.com')

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/a_Create my account'))

WebUI.setText(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/input_fname'), 'test')

WebUI.setText(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/input_lname'), 'test')

WebUI.setText(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/input_password'), 'Password1')

WebUI.setText(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/input_confirmPassword'), 'Password1')

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/i_questionSelectBoxItArrow'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_CengageBrain - New Student Reg/a_What is your mothers maiden'))

WebUI.setText(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/input_answer'), 'test')

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/input_acceptEULA'))

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - New Student Reg/input_receiveNews'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/a_Create my account'))

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Find your insti/i_locationSelectBoxItArrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_CengageBrain - New Student Reg/Country'))

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Find your insti/i_institutionTypeSelectBoxItAr'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_CengageBrain - New Student Reg/Year College'))

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Find your insti/i_radiusSelectBoxItArrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_CengageBrain - New Student Reg/Range'))

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Find your insti/div_Enter your zipcode'))

WebUI.delay(1)

WebUI.setText(findTestObject('Student_Registration/Page_CengageBrain - Find your insti/input_zipcode'), '45040')

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Find your insti/a_Find'))

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Select your ins/input_institutionId'))

WebUI.click(findTestObject('Student_Registration/Page_CengageBrain - Select your ins/a_Continue'))

WebUI.switchToWindowTitle('Cengage')

WebUI.click(findTestObject('Student_Registration/Page_Cengage/h2_MY PRODUCTS'))

WebUI.takeScreenshot()

