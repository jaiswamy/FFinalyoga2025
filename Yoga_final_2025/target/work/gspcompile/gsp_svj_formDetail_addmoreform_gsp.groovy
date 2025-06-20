import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_formDetail_addmoreform_gsp extends GroovyPage {
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
printHtmlPart(8)
expressionOut.print(formDetailInstance?.achievements1?.particularsEvent.last())
printHtmlPart(5)
}
printHtmlPart(9)
if(true && (params?.action != "edit")) {
printHtmlPart(10)
expressionOut.print(formDetailInstance?.achievements1?.periodDuration)
printHtmlPart(5)
}
else {
printHtmlPart(10)
expressionOut.print(formDetailInstance?.achievements1?.periodDuration.last())
printHtmlPart(5)
}
printHtmlPart(11)
if(true && (params?.action != "edit")) {
printHtmlPart(12)
}
else {
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('hiddenField','g',143,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',146,['class':("btn yellow"),'id':("add_field_button5"),'value':("Add More")],-1)
printHtmlPart(16)
if(true && (params?.action != "edit")) {
printHtmlPart(17)
expressionOut.print(formDetailInstance?.specialAttainment1?.particular)
printHtmlPart(18)
}
else {
printHtmlPart(19)
expressionOut.print(formDetailInstance?.specialAttainment1?.particular.last())
printHtmlPart(5)
}
printHtmlPart(20)
if(true && (params?.action != "edit")) {
printHtmlPart(21)
}
else {
printHtmlPart(22)
expressionOut.print(formDetailInstance?.specialAttainment1?.cadre.last())
printHtmlPart(5)
}
printHtmlPart(23)
if(true && (params?.action != "edit")) {
printHtmlPart(24)
expressionOut.print(formDetailInstance?.specialAttainment1?.year)
printHtmlPart(5)
}
else {
printHtmlPart(24)
expressionOut.print(formDetailInstance?.specialAttainment1?.year.last())
printHtmlPart(5)
}
printHtmlPart(25)
if(true && (params?.action != "edit")) {
printHtmlPart(26)
expressionOut.print(formDetailInstance?.specialAttainment1?.details)
printHtmlPart(5)
}
else {
printHtmlPart(27)
expressionOut.print(formDetailInstance?.specialAttainment1?.details.last())
printHtmlPart(5)
}
printHtmlPart(14)
invokeTag('hiddenField','g',264,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',267,['class':("btn yellow"),'id':("add_field_button6"),'value':("Add More")],-1)
printHtmlPart(28)
if(true && (params?.action != "edit")) {
printHtmlPart(29)
expressionOut.print(formDetailInstance?.patent1?.details1)
printHtmlPart(30)
}
else {
printHtmlPart(31)
expressionOut.print(formDetailInstance?.patent1?.details1.last())
printHtmlPart(5)
}
printHtmlPart(32)
if(true && (params?.action != "edit")) {
printHtmlPart(33)
expressionOut.print(formDetailInstance?.patent1?.year1)
printHtmlPart(5)
}
else {
printHtmlPart(33)
expressionOut.print(formDetailInstance?.patent1?.year1.last())
printHtmlPart(5)
}
printHtmlPart(34)
invokeTag('hiddenField','g',331,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',334,['class':("btn yellow"),'id':("add_field_button7"),'value':("Add More")],-1)
printHtmlPart(35)
if(true && (params?.action != "edit")) {
printHtmlPart(36)
expressionOut.print(formDetailInstance?.fproject?.projectTitle)
printHtmlPart(30)
}
else {
printHtmlPart(37)
expressionOut.print(formDetailInstance?.fproject?.projectTitle.last())
printHtmlPart(5)
}
printHtmlPart(20)
if(true && (params?.action != "edit")) {
printHtmlPart(38)
}
else {
printHtmlPart(39)
}
printHtmlPart(40)
if(true && (params?.action != "edit")) {
printHtmlPart(41)
expressionOut.print(formDetailInstance?.fproject?.details2)
printHtmlPart(30)
}
else {
printHtmlPart(42)
expressionOut.print(formDetailInstance?.fproject?.details2.last())
printHtmlPart(5)
}
printHtmlPart(43)
if(true && (params?.action != "edit")) {
printHtmlPart(44)
}
else {
printHtmlPart(45)
expressionOut.print(formDetailInstance?.fproject?.projectOutlay.last())
printHtmlPart(46)
}
printHtmlPart(47)
invokeTag('hiddenField','g',456,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',459,['class':("btn yellow"),'id':("add_field_button8"),'value':("Add More")],-1)
printHtmlPart(48)
if(true && (params?.action != "edit")) {
printHtmlPart(49)
expressionOut.print(formDetailInstance?.wshop?.particulars3)
printHtmlPart(30)
}
else {
printHtmlPart(50)
expressionOut.print(formDetailInstance?.wshop?.particulars3.last())
printHtmlPart(5)
}
printHtmlPart(51)
if(true && (params?.action != "edit")) {
printHtmlPart(52)
}
else {
printHtmlPart(53)
}
printHtmlPart(40)
if(true && (params?.action != "edit")) {
printHtmlPart(54)
expressionOut.print(formDetailInstance?.wshop?.details3)
printHtmlPart(30)
}
else {
printHtmlPart(55)
expressionOut.print(formDetailInstance?.wshop?.details3.last())
printHtmlPart(5)
}
printHtmlPart(32)
if(true && (params?.action != "edit")) {
printHtmlPart(56)
expressionOut.print(formDetailInstance?.wshop?.year3)
printHtmlPart(5)
}
else {
printHtmlPart(56)
expressionOut.print(formDetailInstance?.wshop?.year3.last())
printHtmlPart(5)
}
printHtmlPart(57)
invokeTag('hiddenField','g',592,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',595,['class':("btn yellow"),'id':("add_field_button9"),'value':("Add More")],-1)
printHtmlPart(58)
if(true && (params?.action != "edit")) {
printHtmlPart(59)
expressionOut.print(formDetailInstance?.experiences1?.workExperience)
printHtmlPart(60)
}
else {
printHtmlPart(61)
expressionOut.print(formDetailInstance?.experiences1?.workExperience.last())
printHtmlPart(5)
}
printHtmlPart(62)
if(true && (params?.action != "edit")) {
printHtmlPart(63)
expressionOut.print(formDetailInstance?.experiences1?.companyName)
printHtmlPart(5)
}
else {
printHtmlPart(64)
expressionOut.print(formDetailInstance?.experiences1?.companyName.last())
printHtmlPart(5)
}
printHtmlPart(65)
if(true && (params?.action != "edit")) {
printHtmlPart(66)
expressionOut.print(formDetailInstance?.experiences1?.postHeld)
printHtmlPart(5)
}
else {
printHtmlPart(67)
expressionOut.print(formDetailInstance?.experiences1?.postHeld.last())
printHtmlPart(5)
}
printHtmlPart(68)
if(true && (params?.action != "edit")) {
printHtmlPart(69)
expressionOut.print(formDetailInstance?.experiences1?.nameOfTheEmployeer)
printHtmlPart(5)
}
else {
printHtmlPart(70)
expressionOut.print(formDetailInstance?.experiences1?.nameOfTheEmployeer.last())
printHtmlPart(5)
}
printHtmlPart(71)
if(true && (params?.action != "edit")) {
printHtmlPart(72)
expressionOut.print(formDetailInstance?.experiences1?.dateOfJoining)
printHtmlPart(73)
}
else {
printHtmlPart(74)
expressionOut.print(formDetailInstance?.experiences1?.dateOfJoining.last())
printHtmlPart(75)
}
printHtmlPart(76)
if(true && (params?.action != "edit")) {
printHtmlPart(77)
expressionOut.print(formDetailInstance?.experiences1?.dateOfLeavin)
printHtmlPart(78)
}
else {
printHtmlPart(79)
expressionOut.print(formDetailInstance?.experiences1?.dateOfLeaving.last())
printHtmlPart(80)
}
printHtmlPart(81)
if(true && (params?.action != "edit")) {
printHtmlPart(82)
expressionOut.print(formDetailInstance?.experiences1?.periodOfService)
printHtmlPart(83)
}
else {
printHtmlPart(84)
expressionOut.print(formDetailInstance?.experiences1?.periodOfService.last())
printHtmlPart(83)
}
printHtmlPart(85)
if(true && (params?.action != "edit")) {
printHtmlPart(86)
expressionOut.print(formDetailInstance?.experiences1?.reasonOfLeaving)
printHtmlPart(83)
}
else {
printHtmlPart(87)
expressionOut.print(formDetailInstance?.experiences1?.reasonOfLeaving.last())
printHtmlPart(83)
}
printHtmlPart(88)
if(true && (params?.action != "edit")) {
printHtmlPart(89)
expressionOut.print(formDetailInstance?.experiences1?.basicPay)
printHtmlPart(5)
}
else {
printHtmlPart(89)
expressionOut.print(formDetailInstance?.experiences1?.basicPay.last())
printHtmlPart(5)
}
printHtmlPart(14)
invokeTag('hiddenField','g',845,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',848,['class':("btn yellow"),'id':("add_field_button3"),'value':("Add More")],-1)
printHtmlPart(90)
if(true && (params?.action != "edit")) {
printHtmlPart(91)
}
else {
printHtmlPart(92)
expressionOut.print(formDetailInstance?.sp?.particulars.last())
printHtmlPart(5)
}
printHtmlPart(93)
if(true && (params?.action != "edit")) {
printHtmlPart(94)
expressionOut.print(formDetailInstance?.sp?.titlesPapers)
printHtmlPart(5)
}
else {
printHtmlPart(95)
expressionOut.print(formDetailInstance?.sp?.titlesPapers.last())
printHtmlPart(5)
}
printHtmlPart(96)
if(true && (params?.action != "edit")) {
printHtmlPart(97)
expressionOut.print(formDetailInstance?.sp?.publisher)
printHtmlPart(5)
}
else {
printHtmlPart(97)
expressionOut.print(formDetailInstance?.sp?.publisher.last())
printHtmlPart(5)
}
printHtmlPart(98)
if(true && (params?.action != "edit")) {
printHtmlPart(99)
expressionOut.print(formDetailInstance?.sp?.types)
printHtmlPart(100)
}
else {
printHtmlPart(101)
expressionOut.print(formDetailInstance?.sp?.types)
printHtmlPart(102)
}
printHtmlPart(103)
if(true && (params?.action != "edit")) {
printHtmlPart(104)
expressionOut.print(formDetailInstance?.sp?.detailsss)
printHtmlPart(105)
}
else {
printHtmlPart(106)
expressionOut.print(formDetailInstance?.sp?.detailsss.last())
printHtmlPart(5)
}
printHtmlPart(107)
invokeTag('hiddenField','g',1015,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',1018,['class':("btn yellow"),'id':("add_field_button"),'value':("Add More")],-1)
printHtmlPart(108)
if(true && (params?.action != "edit")) {
printHtmlPart(109)
expressionOut.print(formDetailInstance?.specialAwards2?.particularsAwards)
printHtmlPart(110)
}
else {
printHtmlPart(111)
expressionOut.print(formDetailInstance?.specialAwards2?.particularsAwards.first())
printHtmlPart(30)
}
printHtmlPart(112)
if(true && (params?.action != "edit")) {
printHtmlPart(113)
expressionOut.print(formDetailInstance?.sp?.noofAwards)
printHtmlPart(114)
}
else {
printHtmlPart(115)
expressionOut.print(formDetailInstance?.specialAwards2?.noofAwards.last())
printHtmlPart(5)
}
printHtmlPart(23)
if(true && (params?.action != "edit")) {
printHtmlPart(116)
expressionOut.print(formDetailInstance?.specialAwards2?.awardsYear)
printHtmlPart(117)
}
else {
printHtmlPart(118)
expressionOut.print(formDetailInstance?.specialAwards2?.awardsYear.last())
printHtmlPart(119)
}
printHtmlPart(120)
if(true && (params?.action != "edit")) {
printHtmlPart(121)
expressionOut.print(formDetailInstance?.specialAwards2?.awardedfor)
printHtmlPart(5)
}
else {
printHtmlPart(122)
expressionOut.print(formDetailInstance?.specialAwards2?.awardedfor.last())
printHtmlPart(5)
}
printHtmlPart(107)
invokeTag('hiddenField','g',1159,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(15)
invokeTag('actionSubmit','g',1162,['class':("btn yellow"),'id':("add_field_button4"),'value':("Add More")],-1)
printHtmlPart(123)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1678967147458L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
