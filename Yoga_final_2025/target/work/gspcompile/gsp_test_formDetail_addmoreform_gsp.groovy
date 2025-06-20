import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_test_formDetail_addmoreform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/_addmoreform.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(formdt?.id)
printHtmlPart(1)
expressionOut.print(formdt?.apllicationNo)
printHtmlPart(2)
if(true && (params?.action != "edit")) {
printHtmlPart(3)
}
else {
printHtmlPart(4)
expressionOut.print(formDetailInstance?.achievements1?.typeAchievement.last())
printHtmlPart(5)
}
printHtmlPart(6)
if(true && (params?.action != "edit")) {
printHtmlPart(7)
expressionOut.print(formDetailInstance?.achievements1?.particularsEvent)
printHtmlPart(5)
}
else {
printHtmlPart(7)
expressionOut.print(formDetailInstance?.achievements1?.particularsEvent.last())
printHtmlPart(5)
}
printHtmlPart(8)
if(true && (params?.action != "edit")) {
printHtmlPart(9)
expressionOut.print(formDetailInstance?.achievements1?.periodDuration)
printHtmlPart(5)
}
else {
printHtmlPart(9)
expressionOut.print(formDetailInstance?.achievements1?.periodDuration.last())
printHtmlPart(5)
}
printHtmlPart(10)
if(true && (params?.action != "edit")) {
printHtmlPart(11)
}
else {
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('hiddenField','g',142,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',145,['class':("btn yellow"),'id':("add_field_button5"),'value':("Add More")],-1)
printHtmlPart(15)
if(true && (params?.action != "edit")) {
printHtmlPart(16)
expressionOut.print(formDetailInstance?.specialAttainment1?.particular)
printHtmlPart(17)
}
else {
printHtmlPart(16)
expressionOut.print(formDetailInstance?.specialAttainment1?.particular.last())
printHtmlPart(5)
}
printHtmlPart(18)
if(true && (params?.action != "edit")) {
printHtmlPart(19)
}
else {
printHtmlPart(20)
expressionOut.print(formDetailInstance?.specialAttainment1?.cadre.last())
printHtmlPart(5)
}
printHtmlPart(21)
if(true && (params?.action != "edit")) {
printHtmlPart(22)
expressionOut.print(formDetailInstance?.specialAttainment1?.year)
printHtmlPart(5)
}
else {
printHtmlPart(22)
expressionOut.print(formDetailInstance?.specialAttainment1?.year.last())
printHtmlPart(5)
}
printHtmlPart(23)
if(true && (params?.action != "edit")) {
printHtmlPart(24)
expressionOut.print(formDetailInstance?.specialAttainment1?.details)
printHtmlPart(5)
}
else {
printHtmlPart(24)
expressionOut.print(formDetailInstance?.specialAttainment1?.details.last())
printHtmlPart(5)
}
printHtmlPart(13)
invokeTag('hiddenField','g',263,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',266,['class':("btn yellow"),'id':("add_field_button6"),'value':("Add More")],-1)
printHtmlPart(25)
if(true && (params?.action != "edit")) {
printHtmlPart(26)
expressionOut.print(formDetailInstance?.patent1?.details1)
printHtmlPart(27)
}
else {
printHtmlPart(26)
expressionOut.print(formDetailInstance?.patent1?.details1.last())
printHtmlPart(5)
}
printHtmlPart(28)
if(true && (params?.action != "edit")) {
printHtmlPart(29)
expressionOut.print(formDetailInstance?.patent1?.year1)
printHtmlPart(5)
}
else {
printHtmlPart(29)
expressionOut.print(formDetailInstance?.patent1?.year1.last())
printHtmlPart(5)
}
printHtmlPart(30)
invokeTag('hiddenField','g',330,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',333,['class':("btn yellow"),'id':("add_field_button7"),'value':("Add More")],-1)
printHtmlPart(31)
if(true && (params?.action != "edit")) {
printHtmlPart(32)
expressionOut.print(formDetailInstance?.fproject?.projectTitle)
printHtmlPart(27)
}
else {
printHtmlPart(32)
expressionOut.print(formDetailInstance?.fproject?.projectTitle.last())
printHtmlPart(5)
}
printHtmlPart(18)
if(true && (params?.action != "edit")) {
printHtmlPart(33)
}
else {
printHtmlPart(34)
}
printHtmlPart(35)
if(true && (params?.action != "edit")) {
printHtmlPart(36)
expressionOut.print(formDetailInstance?.fproject?.details2)
printHtmlPart(27)
}
else {
printHtmlPart(36)
expressionOut.print(formDetailInstance?.fproject?.details2.last())
printHtmlPart(5)
}
printHtmlPart(37)
if(true && (params?.action != "edit")) {
printHtmlPart(38)
}
else {
printHtmlPart(39)
expressionOut.print(formDetailInstance?.fproject?.projectOutlay.last())
printHtmlPart(40)
}
printHtmlPart(41)
invokeTag('hiddenField','g',455,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',458,['class':("btn yellow"),'id':("add_field_button8"),'value':("Add More")],-1)
printHtmlPart(42)
if(true && (params?.action != "edit")) {
printHtmlPart(43)
expressionOut.print(formDetailInstance?.wshop?.particulars3)
printHtmlPart(27)
}
else {
printHtmlPart(43)
expressionOut.print(formDetailInstance?.wshop?.particulars3.last())
printHtmlPart(5)
}
printHtmlPart(44)
if(true && (params?.action != "edit")) {
printHtmlPart(45)
}
else {
printHtmlPart(46)
}
printHtmlPart(35)
if(true && (params?.action != "edit")) {
printHtmlPart(47)
expressionOut.print(formDetailInstance?.wshop?.details3)
printHtmlPart(27)
}
else {
printHtmlPart(47)
expressionOut.print(formDetailInstance?.wshop?.details3.last())
printHtmlPart(5)
}
printHtmlPart(28)
if(true && (params?.action != "edit")) {
printHtmlPart(48)
expressionOut.print(formDetailInstance?.wshop?.year3)
printHtmlPart(5)
}
else {
printHtmlPart(48)
expressionOut.print(formDetailInstance?.wshop?.year3.last())
printHtmlPart(5)
}
printHtmlPart(49)
invokeTag('hiddenField','g',591,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',594,['class':("btn yellow"),'id':("add_field_button9"),'value':("Add More")],-1)
printHtmlPart(50)
if(true && (params?.action != "edit")) {
printHtmlPart(51)
expressionOut.print(formDetailInstance?.experiences1?.workExperience)
printHtmlPart(52)
}
else {
printHtmlPart(51)
expressionOut.print(formDetailInstance?.experiences1?.workExperience.last())
printHtmlPart(5)
}
printHtmlPart(53)
if(true && (params?.action != "edit")) {
printHtmlPart(54)
expressionOut.print(formDetailInstance?.experiences1?.companyName)
printHtmlPart(5)
}
else {
printHtmlPart(54)
expressionOut.print(formDetailInstance?.experiences1?.companyName.last())
printHtmlPart(5)
}
printHtmlPart(55)
if(true && (params?.action != "edit")) {
printHtmlPart(56)
expressionOut.print(formDetailInstance?.experiences1?.postHeld)
printHtmlPart(5)
}
else {
printHtmlPart(56)
expressionOut.print(formDetailInstance?.experiences1?.postHeld.last())
printHtmlPart(5)
}
printHtmlPart(57)
if(true && (params?.action != "edit")) {
printHtmlPart(58)
expressionOut.print(formDetailInstance?.experiences1?.nameOfTheEmployeer)
printHtmlPart(5)
}
else {
printHtmlPart(58)
expressionOut.print(formDetailInstance?.experiences1?.nameOfTheEmployeer.last())
printHtmlPart(5)
}
printHtmlPart(59)
if(true && (params?.action != "edit")) {
printHtmlPart(60)
expressionOut.print(formDetailInstance?.experiences1?.dateOfJoining)
printHtmlPart(61)
}
else {
printHtmlPart(62)
expressionOut.print(formDetailInstance?.experiences1?.dateOfJoining.last())
printHtmlPart(63)
}
printHtmlPart(64)
if(true && (params?.action != "edit")) {
printHtmlPart(65)
expressionOut.print(formDetailInstance?.experiences1?.dateOfLeavin)
printHtmlPart(66)
}
else {
printHtmlPart(67)
expressionOut.print(formDetailInstance?.experiences1?.dateOfLeaving.last())
printHtmlPart(68)
}
printHtmlPart(69)
if(true && (params?.action != "edit")) {
printHtmlPart(70)
expressionOut.print(formDetailInstance?.experiences1?.periodOfService)
printHtmlPart(71)
}
else {
printHtmlPart(70)
expressionOut.print(formDetailInstance?.experiences1?.periodOfService.last())
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (params?.action != "edit")) {
printHtmlPart(73)
expressionOut.print(formDetailInstance?.experiences1?.reasonOfLeaving)
printHtmlPart(71)
}
else {
printHtmlPart(73)
expressionOut.print(formDetailInstance?.experiences1?.reasonOfLeaving.last())
printHtmlPart(71)
}
printHtmlPart(74)
if(true && (params?.action != "edit")) {
printHtmlPart(75)
expressionOut.print(formDetailInstance?.experiences1?.basicPay)
printHtmlPart(5)
}
else {
printHtmlPart(75)
expressionOut.print(formDetailInstance?.experiences1?.basicPay.last())
printHtmlPart(5)
}
printHtmlPart(13)
invokeTag('hiddenField','g',844,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',847,['class':("btn yellow"),'id':("add_field_button3"),'value':("Add More")],-1)
printHtmlPart(76)
if(true && (params?.action != "edit")) {
printHtmlPart(77)
}
else {
printHtmlPart(78)
expressionOut.print(formDetailInstance?.sp?.particulars.last())
printHtmlPart(5)
}
printHtmlPart(79)
if(true && (params?.action != "edit")) {
printHtmlPart(80)
expressionOut.print(formDetailInstance?.sp?.titlesPapers)
printHtmlPart(5)
}
else {
printHtmlPart(80)
expressionOut.print(formDetailInstance?.sp?.titlesPapers.last())
printHtmlPart(5)
}
printHtmlPart(81)
if(true && (params?.action != "edit")) {
printHtmlPart(82)
expressionOut.print(formDetailInstance?.sp?.publisher)
printHtmlPart(5)
}
else {
printHtmlPart(82)
expressionOut.print(formDetailInstance?.sp?.publisher.last())
printHtmlPart(5)
}
printHtmlPart(83)
if(true && (params?.action != "edit")) {
printHtmlPart(84)
expressionOut.print(formDetailInstance?.sp?.types)
printHtmlPart(85)
}
else {
printHtmlPart(86)
expressionOut.print(formDetailInstance?.sp?.types)
printHtmlPart(87)
}
printHtmlPart(88)
if(true && (params?.action != "edit")) {
printHtmlPart(89)
expressionOut.print(formDetailInstance?.sp?.detailsss)
printHtmlPart(90)
}
else {
printHtmlPart(89)
expressionOut.print(formDetailInstance?.sp?.detailsss.last())
printHtmlPart(5)
}
printHtmlPart(91)
invokeTag('hiddenField','g',1014,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',1017,['class':("btn yellow"),'id':("add_field_button"),'value':("Add More")],-1)
printHtmlPart(92)
if(true && (params?.action != "edit")) {
printHtmlPart(93)
expressionOut.print(formDetailInstance?.specialAwards2?.particularsAwards)
printHtmlPart(94)
}
else {
printHtmlPart(95)
expressionOut.print(formDetailInstance?.specialAwards2?.particularsAwards.first())
printHtmlPart(27)
}
printHtmlPart(96)
if(true && (params?.action != "edit")) {
printHtmlPart(97)
expressionOut.print(formDetailInstance?.sp?.noofAwards)
printHtmlPart(98)
}
else {
printHtmlPart(99)
expressionOut.print(formDetailInstance?.specialAwards2?.noofAwards.last())
printHtmlPart(5)
}
printHtmlPart(21)
if(true && (params?.action != "edit")) {
printHtmlPart(100)
expressionOut.print(formDetailInstance?.specialAwards2?.awardsYear)
printHtmlPart(101)
}
else {
printHtmlPart(102)
expressionOut.print(formDetailInstance?.specialAwards2?.awardsYear.last())
printHtmlPart(103)
}
printHtmlPart(104)
if(true && (params?.action != "edit")) {
printHtmlPart(105)
expressionOut.print(formDetailInstance?.specialAwards2?.awardedfor)
printHtmlPart(5)
}
else {
printHtmlPart(105)
expressionOut.print(formDetailInstance?.specialAwards2?.awardedfor.last())
printHtmlPart(5)
}
printHtmlPart(91)
invokeTag('hiddenField','g',1158,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',1161,['class':("btn yellow"),'id':("add_field_button4"),'value':("Add More")],-1)
printHtmlPart(106)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768070562L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
