import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingForm_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (params?.action != "edit")) {
printHtmlPart(1)
expressionOut.print(apllicationNo)
printHtmlPart(2)
}
else {
printHtmlPart(1)
expressionOut.print(nonTeachingFormInstance?.apllicationNo)
printHtmlPart(3)
}
printHtmlPart(4)
expressionOut.print(nonTeachingFormInstance?.firstName)
printHtmlPart(5)
expressionOut.print(nonTeachingFormInstance?.lastName)
printHtmlPart(6)
expressionOut.print(nonTeachingFormInstance?.fName)
printHtmlPart(7)
expressionOut.print(nonTeachingFormInstance?.mName)
printHtmlPart(8)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.dob))
printHtmlPart(9)
expressionOut.print(nonTeachingFormInstance?.phoneNumber)
printHtmlPart(10)
expressionOut.print(nonTeachingFormInstance?.hNo)
printHtmlPart(11)
expressionOut.print(nonTeachingFormInstance?.street)
printHtmlPart(12)
expressionOut.print(nonTeachingFormInstance?.village)
printHtmlPart(13)
expressionOut.print(nonTeachingFormInstance?.taluka)
printHtmlPart(14)
expressionOut.print(nonTeachingFormInstance?.district)
printHtmlPart(15)
expressionOut.print(nonTeachingFormInstance?.state)
printHtmlPart(16)
expressionOut.print(nonTeachingFormInstance?.pinCode)
printHtmlPart(17)
expressionOut.print(nonTeachingFormInstance?.subcast)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1668078870000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
