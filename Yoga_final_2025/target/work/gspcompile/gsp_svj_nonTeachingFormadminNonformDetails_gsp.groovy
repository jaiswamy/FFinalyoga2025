import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingFormadminNonformDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/adminNonformDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',58,[:],1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',162,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(7)
})
invokeTag('ifAnyGranted','sec',163,['roles':("ROLE_ADMIN")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',169,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(7)
})
invokeTag('ifAnyGranted','sec',170,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(10)
invokeTag('render','g',175,['template':("/header/topBar")],-1)
printHtmlPart(11)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(12)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(13)
expressionOut.print(i+1)
printHtmlPart(14)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',302,['action':("makePayment"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(17)
createClosureForHtmlPart(18, 4)
invokeTag('link','g',306,['controller':("NonTeachingForm"),'resource':(nonTeachingFormInstance),'action':("manualPayment")],4)
printHtmlPart(19)
}
else {
printHtmlPart(15)
createClosureForHtmlPart(20, 4)
invokeTag('link','g',309,['action':("report"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(19)
}
printHtmlPart(21)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "apllicationNo"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "appliyingPost"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "firstName"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "lastName"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "fName"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "mName"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "gender"))
printHtmlPart(26)
invokeTag('formatDate','g',335,['date':(nonTeachingFormInstance?.dob),'format':("dd-MM-yyyy")],-1)
printHtmlPart(27)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "email"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "phoneNumber"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "hNo"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "street"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "village"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "taluka"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "district"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "state"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "pinCode"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "country"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "socialcategory"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "subcast"))
printHtmlPart(28)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "religion"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "seven"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "obtainedseven"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "maximumseven"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "percentageseven"))
printHtmlPart(26)
invokeTag('formatDate','g',396,['date':(nonTeachingFormInstance?.sevenyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(30)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "boardUniversityseven"))
printHtmlPart(31)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "sslc"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "obtainedsslc"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "maximumsslc"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "percentagesslc"))
printHtmlPart(26)
invokeTag('formatDate','g',417,['date':(nonTeachingFormInstance?.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(30)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "boardUniversitysslc"))
printHtmlPart(32)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "puc"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "obtainedpuc"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "maximumpuc"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "percentagepuc"))
printHtmlPart(33)
invokeTag('formatDate','g',438,['date':(nonTeachingFormInstance?.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(27)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "boardUniversitypuc"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "degreeNameBachelors"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "bachelorsDegree"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "percentagebachelorsDegree"))
printHtmlPart(34)
invokeTag('formatDate','g',455,['date':(nonTeachingFormInstance?.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(27)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "boardUniversitybachelorsDegree"))
printHtmlPart(32)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "subjectMaster"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "mastersDegree"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "percentagemastersDegree"))
printHtmlPart(26)
invokeTag('formatDate','g',472,['date':(nonTeachingFormInstance?.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(27)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "boardUniversitymastersDegree"))
printHtmlPart(35)
expressionOut.print(i)
printHtmlPart(36)
invokeTag('message','g',481,['code':("default.button.show.label"),'default':("View Additional Qualifications")],-1)
printHtmlPart(37)
expressionOut.print(i)
printHtmlPart(36)
invokeTag('message','g',490,['code':("default.button.show.label"),'default':("View Achievements")],-1)
printHtmlPart(38)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "woman"))
printHtmlPart(39)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "ruralstdy"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "exServiceMan"))
printHtmlPart(40)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "kannadaMedium"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "projectDisplacedPerson"))
printHtmlPart(40)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "j371"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean:nonTeachingFormInstance, field: "pwd"))
printHtmlPart(41)
expressionOut.print(i)
printHtmlPart(36)
invokeTag('message','g',523,['code':("default.button.show.label"),'default':("View Experience")],-1)
printHtmlPart(42)
createTagBody(3, {->
printHtmlPart(43)
invokeTag('hiddenField','g',536,['name':("userListid"),'value':(nonTeachingFormInstance?.id)],-1)
printHtmlPart(44)
createClosureForHtmlPart(45, 4)
invokeTag('ifAnyGranted','sec',542,['roles':("ROLE_ADMIN")],4)
printHtmlPart(46)
createTagBody(4, {->
printHtmlPart(47)
invokeTag('message','g',549,['code':("default.button.Report Print.label"),'default':("Application Status")],-1)
printHtmlPart(48)
})
invokeTag('link','g',550,['class':("btn btn-transparent green btn-outline btn-circle btn-sm active"),'action':("report"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(49)
createTagBody(4, {->
printHtmlPart(48)
invokeTag('message','g',556,['code':("default.button.show.label"),'default':("Details of the Application")],-1)
printHtmlPart(47)
})
invokeTag('link','g',557,['class':("btn btn-transparent red btn-outline btn-circle btn-sm active"),'action':("show"),'resource':(nonTeachingFormInstance),'target':("_blank")],4)
printHtmlPart(50)
})
invokeTag('formRemote','g',559,['name':("kk"),'url':([action:'adminEdit']),'update':("update1")],3)
printHtmlPart(51)
i++
}
}
printHtmlPart(52)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(53)
expressionOut.print(i)
printHtmlPart(54)
loop:{
int l = 0
for( loc11 in (nonTeachingFormInstance?.otherDegrees1) ) {
printHtmlPart(55)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(56)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(57)
expressionOut.print(loc11?.additionalType)
printHtmlPart(58)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(59)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(60)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(61)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(62)
}
printHtmlPart(63)
l++
}
}
printHtmlPart(64)
i++
}
}
printHtmlPart(65)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(66)
expressionOut.print(i)
printHtmlPart(67)
loop:{
int l = 0
for( loc221 in (nonTeachingFormInstance?.achievements1) ) {
printHtmlPart(55)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(68)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(69)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(70)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(71)
expressionOut.print(loc221?.level)
printHtmlPart(72)
}
printHtmlPart(73)
l++
}
}
printHtmlPart(74)
i++
}
}
printHtmlPart(75)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(76)
expressionOut.print(i)
printHtmlPart(77)
loop:{
int l = 0
for( loc31 in (nonTeachingFormInstance?.experiences1) ) {
printHtmlPart(55)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(78)
expressionOut.print(loc31?.workExperience)
printHtmlPart(79)
expressionOut.print(loc31?.companyName)
printHtmlPart(80)
expressionOut.print(loc31?.postHeld)
printHtmlPart(81)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(82)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(83)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(84)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(85)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(86)
expressionOut.print(loc31?.basicPay)
printHtmlPart(87)
}
printHtmlPart(73)
l++
}
}
printHtmlPart(64)
i++
}
}
printHtmlPart(88)
})
invokeTag('captureBody','sitemesh',916,['class':("page-container-bg-solid")],1)
printHtmlPart(89)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1672039576000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
