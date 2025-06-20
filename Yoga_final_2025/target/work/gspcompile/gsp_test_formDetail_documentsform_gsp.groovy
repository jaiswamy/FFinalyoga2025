import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_test_formDetail_documentsform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/_documentsform.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(formdt?.id)
printHtmlPart(1)
expressionOut.print(formdt?.apllicationNo)
printHtmlPart(2)
if(true && (formdt?.neteducation != "Yes")) {
printHtmlPart(3)
}
else {
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (formdt?.neteducation != "Yes")) {
printHtmlPart(6)
}
else {
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (formdt?.socialcategory != "GM")) {
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (formdt?.ruralstdy == "Yes")) {
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (formdt?.exServiceMan == "Yes")) {
printHtmlPart(13)
}
printHtmlPart(10)
if(true && (formdt?.kannadaMedium == "Yes")) {
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (formdt?.j371 == "Yes")) {
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (formdt?.kpsckannadaexam == "Yes")) {
printHtmlPart(18)
}
printHtmlPart(19)
loop:{
int l = 0
for( loc31 in (formdt?.experiences1) ) {
printHtmlPart(20)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(21)
}
printHtmlPart(17)
l++
}
}
printHtmlPart(22)
if(true && (formdt?.neteducation == "Yes")) {
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (formdt?.pwd == "Yes")) {
printHtmlPart(25)
}
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675948289732L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
