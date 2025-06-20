import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_yogaday_certificatecreate_gsp extends GroovyPage {
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
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(7)
expressionOut.print(error.field)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('message','g',43,['error':(error)],-1)
printHtmlPart(10)
})
invokeTag('eachError','g',43,['bean':(certificateInstance),'var':("error")],3)
printHtmlPart(11)
})
invokeTag('hasErrors','g',46,['bean':(certificateInstance)],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('render','g',47,['template':("form")],-1)
printHtmlPart(14)
invokeTag('submitButton','g',56,['name':("create"),'class':("btn btn-dark"),'value':(message(code: 'default.button.Generate Certificate.label', default: 'Generate Certificate')),'button type':("submit"),'style':("    background-color: orangered;font-size: large;font-weight:bold;display: flex;margin: auto;")],-1)
printHtmlPart(15)
})
invokeTag('form','g',56,['url':([resource:certificateInstance, action:'save'])],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1686293000000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
