import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingForm_achievementsform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/_achievementsform.gsp" }
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
expressionOut.print(nonTeachingFormInstance?.achievements1?.typeAchievement)
printHtmlPart(4)
}
else {
printHtmlPart(3)
expressionOut.print(nonTeachingFormInstance?.achievements1?.typeAchievement.last())
printHtmlPart(5)
}
printHtmlPart(6)
if(true && (params?.action != "edit")) {
printHtmlPart(7)
expressionOut.print(nonTeachingFormInstance?.achievements1?.particularsEvent)
printHtmlPart(8)
}
else {
printHtmlPart(7)
expressionOut.print(nonTeachingFormInstance?.achievements1?.particularsEvent.last())
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (params?.action != "edit")) {
printHtmlPart(10)
expressionOut.print(nonTeachingFormInstance?.achievements1?.periodDuration)
printHtmlPart(8)
}
else {
printHtmlPart(10)
expressionOut.print(nonTeachingFormInstance?.achievements1?.periodDuration.last())
printHtmlPart(8)
}
printHtmlPart(11)
if(true && (params?.action != "edit")) {
printHtmlPart(12)
expressionOut.print(nonTeachingFormInstance?.achievements1?.level)
printHtmlPart(8)
}
else {
printHtmlPart(12)
expressionOut.print(nonTeachingFormInstance?.achievements1?.level.last())
printHtmlPart(8)
}
printHtmlPart(13)
invokeTag('hiddenField','g',116,['name':("reportId"),'value':(nonTeachingFormInstance?.id)],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',117,['class':("btn yellow"),'id':("add_field_button42"),'value':("Add More")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1667993784000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
