import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingForm_experienceform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/_experienceform.gsp" }
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
expressionOut.print(nonTeachingFormInstance?.experiences1?.workExperience)
printHtmlPart(4)
}
else {
printHtmlPart(3)
expressionOut.print(nonTeachingFormInstance?.experiences1?.workExperience.last())
printHtmlPart(5)
}
printHtmlPart(6)
if(true && (params?.action != "edit")) {
printHtmlPart(7)
expressionOut.print(nonTeachingFormInstance?.experiences1?.companyName)
printHtmlPart(5)
}
else {
printHtmlPart(7)
expressionOut.print(nonTeachingFormInstance?.experiences1?.companyName.last())
printHtmlPart(5)
}
printHtmlPart(8)
if(true && (params?.action != "edit")) {
printHtmlPart(9)
expressionOut.print(nonTeachingFormInstance?.experiences1?.postHeld)
printHtmlPart(5)
}
else {
printHtmlPart(9)
expressionOut.print(nonTeachingFormInstance?.experiences1?.postHeld.last())
printHtmlPart(5)
}
printHtmlPart(10)
if(true && (params?.action != "edit")) {
printHtmlPart(11)
expressionOut.print(nonTeachingFormInstance?.experiences1?.nameOfTheEmployeer)
printHtmlPart(5)
}
else {
printHtmlPart(11)
expressionOut.print(nonTeachingFormInstance?.experiences1?.nameOfTheEmployeer.last())
printHtmlPart(5)
}
printHtmlPart(12)
if(true && (params?.action != "edit")) {
printHtmlPart(13)
expressionOut.print(nonTeachingFormInstance?.experiences1?.dateOfJoining)
printHtmlPart(14)
}
else {
printHtmlPart(15)
expressionOut.print(nonTeachingFormInstance?.experiences1?.dateOfJoining.last())
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (params?.action != "edit")) {
printHtmlPart(18)
expressionOut.print(nonTeachingFormInstance?.experiences1?.dateOfLeavin)
printHtmlPart(19)
}
else {
printHtmlPart(20)
expressionOut.print(nonTeachingFormInstance?.experiences1?.dateOfLeaving.last())
printHtmlPart(21)
}
printHtmlPart(22)
if(true && (params?.action != "edit")) {
printHtmlPart(23)
expressionOut.print(nonTeachingFormInstance?.experiences1?.periodOfService)
printHtmlPart(24)
}
else {
printHtmlPart(23)
expressionOut.print(nonTeachingFormInstance?.experiences1?.periodOfService.last())
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (params?.action != "edit")) {
printHtmlPart(26)
expressionOut.print(nonTeachingFormInstance?.experiences1?.reasonOfLeaving)
printHtmlPart(24)
}
else {
printHtmlPart(26)
expressionOut.print(nonTeachingFormInstance?.experiences1?.reasonOfLeaving.last())
printHtmlPart(24)
}
printHtmlPart(27)
if(true && (params?.action != "edit")) {
printHtmlPart(28)
expressionOut.print(nonTeachingFormInstance?.experiences1?.basicPay)
printHtmlPart(5)
}
else {
printHtmlPart(28)
expressionOut.print(nonTeachingFormInstance?.experiences1?.basicPay.last())
printHtmlPart(5)
}
printHtmlPart(29)
invokeTag('hiddenField','g',234,['name':("reportId"),'value':(nonTeachingFormInstance?.id)],-1)
printHtmlPart(30)
invokeTag('actionSubmit','g',237,['class':("btn yellow"),'id':("add_field_button3"),'value':("Add More")],-1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1667977274000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
