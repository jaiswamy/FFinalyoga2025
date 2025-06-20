import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_test_formDetail_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/_form.gsp" }
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
expressionOut.print(formDetailInstance?.apllicationNo)
printHtmlPart(2)
}
printHtmlPart(3)
expressionOut.print(formDetailInstance?.firstName)
printHtmlPart(4)
expressionOut.print(formDetailInstance?.lastName)
printHtmlPart(5)
expressionOut.print(formDetailInstance?.fName)
printHtmlPart(6)
expressionOut.print(formDetailInstance?.mName)
printHtmlPart(7)
expressionOut.print(formDetailInstance?.phoneNumber)
printHtmlPart(8)
expressionOut.print(formDetailInstance?.hNo)
printHtmlPart(9)
expressionOut.print(formDetailInstance?.street)
printHtmlPart(10)
expressionOut.print(formDetailInstance?.village)
printHtmlPart(11)
expressionOut.print(formDetailInstance?.taluka)
printHtmlPart(12)
expressionOut.print(formDetailInstance?.district)
printHtmlPart(13)
expressionOut.print(formDetailInstance?.state)
printHtmlPart(14)
expressionOut.print(formDetailInstance?.pinCode)
printHtmlPart(15)
expressionOut.print(formDetailInstance?.subcast)
printHtmlPart(16)
expressionOut.print(formDetailInstance?.kvcNo)
printHtmlPart(17)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.fvcDate))
printHtmlPart(18)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.dob))
printHtmlPart(19)
expressionOut.print(formDetailInstance?.hkRDNO)
printHtmlPart(20)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.hkIssueDate))
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675924275979L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
