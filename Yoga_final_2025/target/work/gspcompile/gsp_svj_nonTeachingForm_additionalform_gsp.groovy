import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingForm_additionalform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/_additionalform.gsp" }
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
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.nameofDegree)
printHtmlPart(4)
}
else {
printHtmlPart(3)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.nameofDegree.last())
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (params?.action != "edit")) {
printHtmlPart(6)
}
else {
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (params?.action != "edit")) {
printHtmlPart(9)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.otherDiploma)
printHtmlPart(4)
}
else {
printHtmlPart(9)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.otherDiploma.last())
printHtmlPart(4)
}
printHtmlPart(10)
if(true && (params?.action != "edit")) {
printHtmlPart(11)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.percentageotherDiploma)
printHtmlPart(4)
}
else {
printHtmlPart(11)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.percentageotherDiploma.last())
printHtmlPart(4)
}
printHtmlPart(12)
if(true && (params?.action != "edit")) {
printHtmlPart(13)
}
else {
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (params?.action != "edit")) {
printHtmlPart(16)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.boardUniversityotherDiploma)
printHtmlPart(4)
}
else {
printHtmlPart(16)
expressionOut.print(nonTeachingFormInstance?.otherDegrees1?.boardUniversityotherDiploma.last())
printHtmlPart(4)
}
printHtmlPart(17)
invokeTag('hiddenField','g',164,['name':("reportId"),'value':(nonTeachingFormInstance?.id)],-1)
printHtmlPart(18)
invokeTag('actionSubmit','g',165,['class':("btn yellow"),'id':("add_field_button1"),'value':("Add More")],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1668085280000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
