import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_intyoga_certificatecreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/certificate/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'certificate.label', default: 'Certificate'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(8)
expressionOut.print(error.field)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('message','g',39,['error':(error)],-1)
printHtmlPart(11)
})
invokeTag('eachError','g',40,['bean':(certificateInstance),'var':("error")],3)
printHtmlPart(12)
})
invokeTag('hasErrors','g',42,['bean':(certificateInstance)],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('render','g',43,['template':("form")],-1)
printHtmlPart(15)
invokeTag('submitButton','g',52,['name':("create"),'class':("btn btn-dark"),'value':(message(code: 'default.button.Generate Certificate.label', default: 'Generate Certificate')),'button type':("submit"),'style':("background-color: orangered;font-size: large;font-weight:bold;display: flex;margin: auto;")],-1)
printHtmlPart(16)
})
invokeTag('form','g',52,['url':([resource:certificateInstance, action:'save'])],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',86,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1686832704000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
