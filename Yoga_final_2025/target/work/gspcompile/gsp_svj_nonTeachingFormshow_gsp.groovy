import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingFormshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',53,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',133,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',133,['roles':("ROLE_ADMIN")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',140,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',140,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(9)
invokeTag('render','g',146,['template':("/header/topBar")],-1)
printHtmlPart(10)
expressionOut.print(nonTeachingFormInstance?.apllicationNo)
printHtmlPart(11)
expressionOut.print(nonTeachingFormInstance?.appliyingPost)
printHtmlPart(12)
expressionOut.print(nonTeachingFormInstance?.firstName)
printHtmlPart(13)
expressionOut.print(nonTeachingFormInstance?.lastName)
printHtmlPart(14)
expressionOut.print(nonTeachingFormInstance?.fName)
printHtmlPart(15)
expressionOut.print(nonTeachingFormInstance?.mName)
printHtmlPart(16)
expressionOut.print(nonTeachingFormInstance?.gender)
printHtmlPart(17)
invokeTag('formatDate','g',200,['date':(nonTeachingFormInstance.dob),'format':("dd-MM-yyyy")],-1)
printHtmlPart(18)
expressionOut.print(nonTeachingFormInstance?.email)
printHtmlPart(19)
expressionOut.print(nonTeachingFormInstance?.phoneNumber)
printHtmlPart(20)
expressionOut.print(nonTeachingFormInstance?.hNo)
printHtmlPart(21)
expressionOut.print(nonTeachingFormInstance?.street)
printHtmlPart(22)
expressionOut.print(nonTeachingFormInstance?.village)
printHtmlPart(23)
expressionOut.print(nonTeachingFormInstance?.taluka)
printHtmlPart(24)
expressionOut.print(nonTeachingFormInstance?.district)
printHtmlPart(25)
expressionOut.print(nonTeachingFormInstance?.state)
printHtmlPart(26)
expressionOut.print(nonTeachingFormInstance?.pinCode)
printHtmlPart(27)
expressionOut.print(nonTeachingFormInstance?.country)
printHtmlPart(28)
expressionOut.print(nonTeachingFormInstance?.socialcategory)
printHtmlPart(29)
expressionOut.print(nonTeachingFormInstance?.subcast)
printHtmlPart(30)
expressionOut.print(nonTeachingFormInstance?.religion)
printHtmlPart(31)
if(true && (nonTeachingFormInstance?.seven != "")) {
printHtmlPart(32)
expressionOut.print(nonTeachingFormInstance?.seven)
printHtmlPart(33)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance?.obtainedseven != "")) {
printHtmlPart(35)
expressionOut.print(nonTeachingFormInstance?.obtainedseven)
printHtmlPart(33)
}
printHtmlPart(36)
if(true && (nonTeachingFormInstance?.maximumseven != "")) {
printHtmlPart(37)
expressionOut.print(nonTeachingFormInstance?.maximumseven)
printHtmlPart(38)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance?.percentageseven != "")) {
printHtmlPart(39)
expressionOut.print(nonTeachingFormInstance?.percentageseven)
printHtmlPart(40)
}
printHtmlPart(41)
if(true && (nonTeachingFormInstance?.sevenyear != null)) {
printHtmlPart(42)
invokeTag('formatDate','g',335,['date':(nonTeachingFormInstance.sevenyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(43)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance?.boardUniversityseven != "")) {
printHtmlPart(44)
expressionOut.print(nonTeachingFormInstance?.boardUniversityseven)
printHtmlPart(33)
}
printHtmlPart(45)
if(true && (nonTeachingFormInstance?.sslc != "")) {
printHtmlPart(32)
expressionOut.print(nonTeachingFormInstance?.sslc)
printHtmlPart(33)
}
printHtmlPart(46)
if(true && (nonTeachingFormInstance?.obtainedsslc != "")) {
printHtmlPart(35)
expressionOut.print(nonTeachingFormInstance?.obtainedsslc)
printHtmlPart(33)
}
printHtmlPart(41)
if(true && (nonTeachingFormInstance?.maximumsslc != "")) {
printHtmlPart(37)
expressionOut.print(nonTeachingFormInstance?.maximumsslc)
printHtmlPart(33)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance?.percentagesslc != "")) {
printHtmlPart(39)
expressionOut.print(nonTeachingFormInstance?.percentagesslc)
printHtmlPart(47)
}
printHtmlPart(41)
if(true && (nonTeachingFormInstance?.sslcyear != null)) {
printHtmlPart(42)
invokeTag('formatDate','g',391,['date':(nonTeachingFormInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(43)
}
printHtmlPart(48)
if(true && (nonTeachingFormInstance?.boardUniversitysslc != "")) {
printHtmlPart(49)
expressionOut.print(nonTeachingFormInstance?.boardUniversitysslc)
printHtmlPart(38)
}
printHtmlPart(50)
if(true && (nonTeachingFormInstance?.puc != "")) {
printHtmlPart(32)
expressionOut.print(nonTeachingFormInstance?.puc)
printHtmlPart(33)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance?.obtainedpuc != "")) {
printHtmlPart(35)
expressionOut.print(nonTeachingFormInstance?.obtainedpuc)
printHtmlPart(33)
}
printHtmlPart(41)
if(true && (nonTeachingFormInstance?.maximumpuc != "")) {
printHtmlPart(37)
expressionOut.print(nonTeachingFormInstance?.maximumpuc)
printHtmlPart(33)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance?.percentagepuc != "")) {
printHtmlPart(39)
expressionOut.print(nonTeachingFormInstance?.percentagepuc)
printHtmlPart(47)
}
printHtmlPart(41)
if(true && (nonTeachingFormInstance?.pucyear != null)) {
printHtmlPart(42)
invokeTag('formatDate','g',446,['date':(nonTeachingFormInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(43)
}
printHtmlPart(51)
if(true && (nonTeachingFormInstance?.boardUniversitypuc != "")) {
printHtmlPart(49)
expressionOut.print(nonTeachingFormInstance?.boardUniversitypuc)
printHtmlPart(33)
}
printHtmlPart(52)
if(true && (nonTeachingFormInstance?.degreeNameBachelors != "")) {
printHtmlPart(53)
expressionOut.print(nonTeachingFormInstance?.degreeNameBachelors)
printHtmlPart(33)
}
printHtmlPart(46)
if(true && (nonTeachingFormInstance?.bachelorsDegree != "")) {
printHtmlPart(32)
expressionOut.print(nonTeachingFormInstance?.bachelorsDegree)
printHtmlPart(33)
}
printHtmlPart(54)
if(true && (nonTeachingFormInstance?.percentagebachelorsDegree != "")) {
printHtmlPart(39)
expressionOut.print(nonTeachingFormInstance?.percentagebachelorsDegree)
printHtmlPart(33)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance.bachelorsDegreeyear != null)) {
printHtmlPart(42)
invokeTag('formatDate','g',494,['date':(nonTeachingFormInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(43)
}
printHtmlPart(54)
if(true && (nonTeachingFormInstance?.boardUniversitybachelorsDegree != "")) {
printHtmlPart(55)
expressionOut.print(nonTeachingFormInstance?.boardUniversitybachelorsDegree)
printHtmlPart(33)
}
printHtmlPart(56)
if(true && (nonTeachingFormInstance?.subjectMaster != "")) {
printHtmlPart(57)
expressionOut.print(nonTeachingFormInstance?.subjectMaster)
printHtmlPart(58)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance?.mastersDegree != "")) {
printHtmlPart(59)
expressionOut.print(nonTeachingFormInstance?.mastersDegree)
printHtmlPart(58)
}
printHtmlPart(60)
if(true && (nonTeachingFormInstance?.percentagemastersDegree != "")) {
printHtmlPart(61)
expressionOut.print(nonTeachingFormInstance?.percentagemastersDegree)
printHtmlPart(58)
}
printHtmlPart(34)
if(true && (nonTeachingFormInstance.mastersDegreeyear != null)) {
printHtmlPart(62)
invokeTag('formatDate','g',551,['date':(nonTeachingFormInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(63)
}
printHtmlPart(60)
if(true && (nonTeachingFormInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(64)
expressionOut.print(nonTeachingFormInstance?.boardUniversitymastersDegree)
printHtmlPart(58)
}
printHtmlPart(65)
loop:{
int l = 0
for( loc11 in (nonTeachingFormInstance?.otherDegrees1) ) {
printHtmlPart(66)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(67)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(68)
expressionOut.print(loc11?.additionalType)
printHtmlPart(69)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(70)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(71)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(72)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(73)
}
printHtmlPart(74)
l++
}
}
printHtmlPart(75)
loop:{
int l = 0
for( loc221 in (nonTeachingFormInstance?.achievements1) ) {
printHtmlPart(66)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(76)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(77)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(78)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(79)
expressionOut.print(loc221?.level)
printHtmlPart(80)
}
printHtmlPart(81)
l++
}
}
printHtmlPart(82)
expressionOut.print(nonTeachingFormInstance?.woman)
printHtmlPart(83)
expressionOut.print(nonTeachingFormInstance?.ruralstdy)
printHtmlPart(84)
expressionOut.print(nonTeachingFormInstance?.exServiceMan)
printHtmlPart(85)
expressionOut.print(nonTeachingFormInstance?.kannadaMedium)
printHtmlPart(86)
expressionOut.print(nonTeachingFormInstance?.projectDisplacedPerson)
printHtmlPart(87)
expressionOut.print(nonTeachingFormInstance?.j371)
printHtmlPart(88)
expressionOut.print(nonTeachingFormInstance?.pwd)
printHtmlPart(89)
loop:{
int l = 0
for( loc31 in (nonTeachingFormInstance?.experiences1) ) {
printHtmlPart(66)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(90)
expressionOut.print(loc31?.workExperience)
printHtmlPart(91)
expressionOut.print(loc31?.companyName)
printHtmlPart(92)
expressionOut.print(loc31?.postHeld)
printHtmlPart(93)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(94)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(95)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(96)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(97)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(98)
expressionOut.print(loc31?.basicPay)
printHtmlPart(99)
}
printHtmlPart(81)
l++
}
}
printHtmlPart(100)
if(true && (nonTeachingFormInstance?.picture?.id != null)) {
printHtmlPart(101)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.picture?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.picture?.id))
printHtmlPart(103)
}
printHtmlPart(46)
if(true && (nonTeachingFormInstance?.signature?.id != null)) {
printHtmlPart(104)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.signature?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.signature?.id))
printHtmlPart(105)
}
printHtmlPart(36)
if(true && (nonTeachingFormInstance?.sevemMarksSheet?.id != null)) {
printHtmlPart(106)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.sevemMarksSheet?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.sevemMarksSheet?.id))
printHtmlPart(103)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(108)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.sslcMarksSheet?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.sslcMarksSheet?.id))
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (nonTeachingFormInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(111)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.pucMarksSheet?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.pucMarksSheet?.id))
printHtmlPart(112)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(113)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.bachelorsMarksSheet?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.bachelorsMarksSheet?.id))
printHtmlPart(103)
}
printHtmlPart(114)
if(true && (nonTeachingFormInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(115)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.masterMarksSheet?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.masterMarksSheet?.id))
printHtmlPart(112)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.phDCertificate?.id != null)) {
printHtmlPart(116)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.phDCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.phDCertificate?.id))
printHtmlPart(117)
}
printHtmlPart(118)
if(true && (nonTeachingFormInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(119)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.casteIncomeCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.casteIncomeCertificate?.id))
printHtmlPart(103)
}
printHtmlPart(46)
if(true && (nonTeachingFormInstance?.ruralCertificate?.id != null)) {
printHtmlPart(120)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.ruralCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.ruralCertificate?.id))
printHtmlPart(112)
}
printHtmlPart(118)
if(true && (nonTeachingFormInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(121)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.exServicemenCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.exServicemenCertificate?.id))
printHtmlPart(103)
}
printHtmlPart(51)
if(true && (nonTeachingFormInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(122)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.kannadaMediumCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.kannadaMediumCertificate?.id))
printHtmlPart(112)
}
printHtmlPart(118)
if(true && (nonTeachingFormInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(123)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(103)
}
printHtmlPart(46)
if(true && (nonTeachingFormInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(124)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(112)
}
printHtmlPart(118)
if(true && (nonTeachingFormInstance?.experienceCertificate?.id != null)) {
printHtmlPart(125)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.experienceCertificate?.id))
printHtmlPart(102)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.experienceCertificate?.id))
printHtmlPart(103)
}
printHtmlPart(126)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(127)
createTagBody(3, {->
printHtmlPart(128)
createTagBody(4, {->
printHtmlPart(48)
invokeTag('message','g',1017,['code':("default.button.Pay Now.label"),'default':("Pay Now")],-1)
printHtmlPart(51)
})
invokeTag('link','g',1018,['class':("btn yellow"),'action':("makePayment"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(129)
})
invokeTag('form','g',1020,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(130)
}
else {
printHtmlPart(131)
}
printHtmlPart(132)
})
invokeTag('captureBody','sitemesh',1146,['class':("page-container-bg-solid"),'id':("printableArea")],1)
printHtmlPart(133)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1672652204000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
