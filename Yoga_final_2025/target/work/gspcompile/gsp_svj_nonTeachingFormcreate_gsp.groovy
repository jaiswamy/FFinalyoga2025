import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingFormcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/create.gsp" }
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
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',211,['controller':("superadmin"),'action':("dashboard")],2)
printHtmlPart(8)
invokeTag('render','g',216,['template':("/header/topBar")],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('render','g',229,['template':("form")],-1)
printHtmlPart(11)
invokeTag('submitButton','g',246,['name':("create"),'class':("btn green"),'style':("margin-left:250px"),'value':(message(code: 'default.button.Submit.label', default: 'Save & Continue')),'id':("techingva"),'data-toggle':("modal"),'data-target':("#exampleModalLong"),'onclick':("return confirm('Please verify all the details before submitting Once Submitted details can not be edited.')")],-1)
printHtmlPart(12)
})
invokeTag('form','g',248,['url':([resource:nonTeachingFormInstance, action:'personaleDetails']),'class':("form-horizontal"),'enctype':("multipart/form-data"),'id':("teach")],2)
printHtmlPart(13)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.nameofDegree)
printHtmlPart(14)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.otherDiploma)
printHtmlPart(15)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.percentageotherDiploma)
printHtmlPart(16)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.otherDegrees1?.otherDiplomayear))
printHtmlPart(17)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.boardUniversityotherDiploma)
printHtmlPart(18)
expressionOut.print(nonTeachingFormInstance?.experiences1?.workExperience)
printHtmlPart(19)
expressionOut.print(nonTeachingFormInstance?.experiences1?.companyName)
printHtmlPart(20)
expressionOut.print(nonTeachingFormInstance?.experiences1?.postHeld)
printHtmlPart(21)
expressionOut.print(nonTeachingFormInstance?.experiences1?.nameOfTheEmployeer)
printHtmlPart(22)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.experiences1?.dateOfJoining))
printHtmlPart(23)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.experiences1?.dateOfLeaving))
printHtmlPart(24)
expressionOut.print(nonTeachingFormInstance?.experiences1?.periodOfService)
printHtmlPart(25)
expressionOut.print(nonTeachingFormInstance?.experiences1?.reasonOfLeaving)
printHtmlPart(26)
expressionOut.print(nonTeachingFormInstance?.experiences1?.basicPay)
printHtmlPart(27)
expressionOut.print(nonTeachingFormInstance?.languages1?."language")
printHtmlPart(28)
expressionOut.print(nonTeachingFormInstance?.languages1?.reading)
printHtmlPart(29)
expressionOut.print(nonTeachingFormInstance?.languages1?.writing)
printHtmlPart(30)
expressionOut.print(nonTeachingFormInstance?.languages1?.speaking)
printHtmlPart(31)
expressionOut.print(nonTeachingFormInstance?.languages1?.examinationpassed)
printHtmlPart(32)
expressionOut.print(nonTeachingFormInstance?.achievements1?.typeAchievement)
printHtmlPart(33)
expressionOut.print(nonTeachingFormInstance?.achievements1?.particularsEvent)
printHtmlPart(34)
expressionOut.print(nonTeachingFormInstance?.achievements1?.periodDuration)
printHtmlPart(35)
expressionOut.print(nonTeachingFormInstance?.achievements1?.level)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',774,['class':("page-container-bg-solid"),'onload':("noBack();"),'onpageshow':("if (event.persisted) noBack();"),'onunload':("")],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1667906612000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
