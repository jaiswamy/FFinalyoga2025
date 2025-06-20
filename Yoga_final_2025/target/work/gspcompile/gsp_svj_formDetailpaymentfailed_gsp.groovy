import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_formDetailpaymentfailed_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/paymentfailed.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',57,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',315,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',316,['roles':("ROLE_ADMIN")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',322,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',323,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
invokeTag('message','g',345,['code':("default.button.Click here.label"),'default':("Click here")],-1)
printHtmlPart(13)
})
invokeTag('link','g',345,['class':("btn btn-primary"),'action':("adminformDetails"),'resource':(formDetailInstance)],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',346,['roles':("ROLE_ADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
invokeTag('message','g',357,['code':("default.button.Click here.label"),'default':("Click here")],-1)
printHtmlPart(13)
})
invokeTag('link','g',357,['class':("btn green"),'action':("index"),'resource':(formDetailInstance)],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',358,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',465,['class':("page-container-bg-solid")],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1677302760351L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
