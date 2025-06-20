import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_test_formDetail_educationform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/_educationform.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(formdt?.id)
printHtmlPart(1)
expressionOut.print(formdt?.apllicationNo)
printHtmlPart(2)
expressionOut.print(formDetailInstance?.sslc)
printHtmlPart(3)
expressionOut.print(formDetailInstance?.obtainedsslc)
printHtmlPart(4)
expressionOut.print(formDetailInstance?.maximumsslc)
printHtmlPart(5)
expressionOut.print(formDetailInstance?.percentagesslc)
printHtmlPart(6)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.sslcyear))
printHtmlPart(7)
expressionOut.print(formDetailInstance?.boardUniversitysslc)
printHtmlPart(8)
expressionOut.print(formDetailInstance?.puc)
printHtmlPart(9)
expressionOut.print(formDetailInstance?.obtainedpuc)
printHtmlPart(10)
expressionOut.print(formDetailInstance?.maximumpuc)
printHtmlPart(11)
expressionOut.print(formDetailInstance?.percentagepuc)
printHtmlPart(12)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.pucyear))
printHtmlPart(13)
expressionOut.print(formDetailInstance?.boardUniversitypuc)
printHtmlPart(14)
expressionOut.print(formDetailInstance?.degreeNameBachelors)
printHtmlPart(15)
expressionOut.print(formDetailInstance?.bachelorsDegree)
printHtmlPart(16)
expressionOut.print(formDetailInstance?.percentagebachelorsDegree)
printHtmlPart(17)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.bachelorsDegreeyear))
printHtmlPart(18)
expressionOut.print(formDetailInstance?.boardUniversitybachelorsDegree)
printHtmlPart(19)
expressionOut.print(formDetailInstance?.subjectMaster)
printHtmlPart(20)
expressionOut.print(formDetailInstance?.mastersDegree)
printHtmlPart(21)
expressionOut.print(formDetailInstance?.percentagemastersDegree)
printHtmlPart(22)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.mastersDegreeyear))
printHtmlPart(23)
expressionOut.print(formDetailInstance?.boardUniversitymastersDegree)
printHtmlPart(24)
expressionOut.print(formDetailInstance?.pHD)
printHtmlPart(25)
expressionOut.print(formDetailInstance?.pHDSubject)
printHtmlPart(26)
expressionOut.print(formDetailInstance?.percentagepHD)
printHtmlPart(27)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.pHDyear))
printHtmlPart(28)
expressionOut.print(formDetailInstance?.boardUniversitypHD)
printHtmlPart(29)
if(true && (params?.action != "edit")) {
printHtmlPart(30)
expressionOut.print(formDetailInstance?.otherDegrees1?.nameofDegree)
printHtmlPart(31)
}
else {
printHtmlPart(30)
expressionOut.print(formDetailInstance?.otherDegrees1?.nameofDegree.last())
printHtmlPart(31)
}
printHtmlPart(32)
if(true && (params?.action != "edit")) {
printHtmlPart(33)
}
else {
printHtmlPart(34)
}
printHtmlPart(35)
if(true && (params?.action != "edit")) {
printHtmlPart(36)
expressionOut.print(formDetailInstance?.otherDegrees1?.otherDiploma)
printHtmlPart(31)
}
else {
printHtmlPart(36)
expressionOut.print(formDetailInstance?.otherDegrees1?.otherDiploma.last())
printHtmlPart(31)
}
printHtmlPart(37)
if(true && (params?.action != "edit")) {
printHtmlPart(38)
expressionOut.print(formDetailInstance?.otherDegrees1?.percentageotherDiploma)
printHtmlPart(31)
}
else {
printHtmlPart(38)
expressionOut.print(formDetailInstance?.otherDegrees1?.percentageotherDiploma.last())
printHtmlPart(31)
}
printHtmlPart(39)
if(true && (params?.action != "edit")) {
printHtmlPart(40)
}
else {
printHtmlPart(41)
}
printHtmlPart(42)
if(true && (params?.action != "edit")) {
printHtmlPart(43)
expressionOut.print(formDetailInstance?.otherDegrees1?.boardUniversityotherDiploma)
printHtmlPart(31)
}
else {
printHtmlPart(43)
expressionOut.print(formDetailInstance?.otherDegrees1?.boardUniversityotherDiploma.last())
printHtmlPart(31)
}
printHtmlPart(44)
invokeTag('hiddenField','g',794,['name':("reportId"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(45)
invokeTag('actionSubmit','g',796,['class':("btn yellow"),'id':("add_field_button1"),'value':("Add More")],-1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768100091L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
