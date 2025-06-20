import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingForm_educationform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/_educationform.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(formdt?.id)
printHtmlPart(1)
expressionOut.print(formdt?.apllicationNo)
printHtmlPart(2)
expressionOut.print(nonTeachingFormInstance?.seven)
printHtmlPart(3)
expressionOut.print(nonTeachingFormInstance?.obtainedseven)
printHtmlPart(4)
expressionOut.print(nonTeachingFormInstance?.maximumseven)
printHtmlPart(5)
expressionOut.print(nonTeachingFormInstance?.percentageseven)
printHtmlPart(6)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.sevenyear))
printHtmlPart(7)
expressionOut.print(nonTeachingFormInstance?.boardUniversityseven)
printHtmlPart(8)
expressionOut.print(nonTeachingFormInstance?.sslc)
printHtmlPart(9)
expressionOut.print(nonTeachingFormInstance?.obtainedsslc)
printHtmlPart(10)
expressionOut.print(nonTeachingFormInstance?.maximumsslc)
printHtmlPart(11)
expressionOut.print(nonTeachingFormInstance?.percentagesslc)
printHtmlPart(12)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.sslcyear))
printHtmlPart(13)
expressionOut.print(nonTeachingFormInstance?.boardUniversitysslc)
printHtmlPart(14)
expressionOut.print(nonTeachingFormInstance?.puc)
printHtmlPart(15)
expressionOut.print(nonTeachingFormInstance?.obtainedpuc)
printHtmlPart(16)
expressionOut.print(nonTeachingFormInstance?.maximumpuc)
printHtmlPart(17)
expressionOut.print(nonTeachingFormInstance?.percentagepuc)
printHtmlPart(18)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.pucyear))
printHtmlPart(19)
expressionOut.print(nonTeachingFormInstance?.boardUniversitypuc)
printHtmlPart(20)
expressionOut.print(nonTeachingFormInstance?.degreeNameBachelors)
printHtmlPart(21)
expressionOut.print(nonTeachingFormInstance?.bachelorsDegree)
printHtmlPart(22)
expressionOut.print(nonTeachingFormInstance?.percentagebachelorsDegree)
printHtmlPart(23)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.bachelorsDegreeyear))
printHtmlPart(24)
expressionOut.print(nonTeachingFormInstance?.boardUniversitybachelorsDegree)
printHtmlPart(25)
expressionOut.print(nonTeachingFormInstance?.subjectMaster)
printHtmlPart(26)
expressionOut.print(nonTeachingFormInstance?.mastersDegree)
printHtmlPart(27)
expressionOut.print(nonTeachingFormInstance?.percentagemastersDegree)
printHtmlPart(28)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:nonTeachingFormInstance?.mastersDegreeyear))
printHtmlPart(29)
expressionOut.print(nonTeachingFormInstance?.boardUniversitymastersDegree)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1668748458000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
