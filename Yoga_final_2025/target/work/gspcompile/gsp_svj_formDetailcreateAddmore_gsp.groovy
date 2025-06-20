import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_formDetailcreateAddmore_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/createAddmore.gsp" }
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
invokeTag('captureHead','sitemesh',55,[:],1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',227,['controller':("superadmin"),'action':("dashboard")],2)
printHtmlPart(8)
invokeTag('render','g',232,['template':("/header/topBar")],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('render','g',241,['template':("addmoreform")],-1)
printHtmlPart(11)
invokeTag('submitButton','g',252,['name':("create"),'class':("btn green"),'style':("margin-left:250px"),'value':(message(code: 'default.button.Submit.label', default: 'Save & Continue')),'id':("techingva6"),'data-toggle':("modal"),'data-target':("#exampleModalLong"),'onclick':("return confirm('Please verify all the details before saving, Once Saved details can not be edited.')")],-1)
printHtmlPart(12)
})
invokeTag('form','g',254,['url':([resource:formDetailInstance, action:'addMoreField']),'class':("form-horizontal"),'enctype':("multipart/form-data"),'id':("teach")],2)
printHtmlPart(13)
if(true && (formDetailInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('form','g',398,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(14)
}
else {
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',402,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],3)
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (formDetailInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('form','g',453,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(14)
}
else {
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',457,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],3)
printHtmlPart(18)
}
printHtmlPart(20)
if(true && (formDetailInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('form','g',513,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(14)
}
else {
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',516,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],3)
printHtmlPart(18)
}
printHtmlPart(21)
if(true && (formDetailInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('form','g',562,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(14)
}
else {
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',573,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],3)
printHtmlPart(18)
}
printHtmlPart(22)
if(true && (formDetailInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('form','g',620,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(14)
}
else {
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',625,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],3)
printHtmlPart(18)
}
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',641,['class':("page-container-bg-solid"),'onload':("noBack();"),'onpageshow':("if (event.persisted) noBack();"),'onunload':("")],1)
printHtmlPart(24)
expressionOut.print(formDetailInstance?.sp?.titlesPapers)
printHtmlPart(25)
expressionOut.print(formDetailInstance?.sp?.publisher)
printHtmlPart(26)
expressionOut.print(formDetailInstance?.sp?.types)
printHtmlPart(27)
expressionOut.print(formDetailInstance?.sp?.detailsss)
printHtmlPart(28)
expressionOut.print(formDetailInstance?.otherDegrees1?.nameofDegree)
printHtmlPart(29)
expressionOut.print(formDetailInstance?.otherDegrees1?.otherDiploma)
printHtmlPart(30)
expressionOut.print(formDetailInstance?.otherDegrees1?.percentageotherDiploma)
printHtmlPart(31)
expressionOut.print(formDetailInstance?.otherDegrees1?.boardUniversityotherDiploma)
printHtmlPart(32)
expressionOut.print(formDetailInstance?.languages1?."language")
printHtmlPart(33)
expressionOut.print(formDetailInstance?.languages1?.reading)
printHtmlPart(34)
expressionOut.print(formDetailInstance?.languages1?.writing)
printHtmlPart(35)
expressionOut.print(formDetailInstance?.languages1?.speaking)
printHtmlPart(36)
expressionOut.print(formDetailInstance?.languages1?.examinationpassed)
printHtmlPart(37)
expressionOut.print(formDetailInstance?.experiences1?.workExperience)
printHtmlPart(38)
expressionOut.print(formDetailInstance?.experiences1?.companyName)
printHtmlPart(39)
expressionOut.print(formDetailInstance?.experiences1?.postHeld)
printHtmlPart(40)
expressionOut.print(formDetailInstance?.experiences1?.nameOfTheEmployeer)
printHtmlPart(41)
expressionOut.print(formDetailInstance?.experiences1?.periodOfService)
printHtmlPart(42)
expressionOut.print(formDetailInstance?.experiences1?.reasonOfLeaving)
printHtmlPart(43)
expressionOut.print(formDetailInstance?.experiences1?.basicPay)
printHtmlPart(44)
expressionOut.print(formDetailInstance?.particularsAwards)
printHtmlPart(45)
expressionOut.print(formDetailInstance?.sp?.noofAwards)
printHtmlPart(46)
expressionOut.print(formDetailInstance?.awardedfor)
printHtmlPart(47)
expressionOut.print(formDetailInstance?.achievements1?.particularsEvent)
printHtmlPart(48)
expressionOut.print(formDetailInstance?.achievements1?.periodDuration)
printHtmlPart(49)
expressionOut.print(formDetailInstance?.specialAttainment1?.particular)
printHtmlPart(50)
expressionOut.print(formDetailInstance?.specialAttainment1?.year)
printHtmlPart(51)
expressionOut.print(formDetailInstance?.specialAttainment1?.details)
printHtmlPart(52)
expressionOut.print(formDetailInstance?.patent1?.details1)
printHtmlPart(53)
expressionOut.print(formDetailInstance?.patent1?.year1)
printHtmlPart(54)
expressionOut.print(formDetailInstance?.fproject?.projectTitle)
printHtmlPart(55)
expressionOut.print(formDetailInstance?.fproject?.details2)
printHtmlPart(56)
expressionOut.print(formDetailInstance?.wshop?.particulars3)
printHtmlPart(57)
expressionOut.print(formDetailInstance?.wshop?.details3)
printHtmlPart(58)
expressionOut.print(formDetailInstance?.wshop?.year3)
printHtmlPart(59)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1678966844619L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
