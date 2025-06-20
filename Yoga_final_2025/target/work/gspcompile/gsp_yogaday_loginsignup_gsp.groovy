import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_yogaday_loginsignup_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/signup.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Animate Research"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
expressionOut.print(postUrl)
printHtmlPart(11)
expressionOut.print(message(code: "springSecurity.login.button"))
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',130,['controller':("Certificate"),'action':("create")],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(16)
invokeTag('textField','g',164,['name':("username"),'class':("form-control"),'placeholder':("Username"),'value':(usersInstance?.username),'required':("true")],-1)
printHtmlPart(17)
}
else {
printHtmlPart(18)
expressionOut.print(usersInstance?.username)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(21)
expressionOut.print(usersInstance?.password)
printHtmlPart(22)
}
else {
printHtmlPart(21)
expressionOut.print(usersInstance?.password)
printHtmlPart(23)
}
printHtmlPart(24)
expressionOut.print(usersInstance?.phoneNo)
printHtmlPart(25)
expressionOut.print(usersInstance?.address?.email)
printHtmlPart(26)
expressionOut.print(usersInstance?.address?.city)
printHtmlPart(27)
expressionOut.print(usersInstance?.address?.state)
printHtmlPart(28)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(29)
invokeTag('actionSubmit','g',245,['action':("SaveCommanUsers"),'class':("btn btn-success uppercase pull-right"),'style':("background-color: #1740c2 !important; border-color: #86cd92 !important;"),'value':("Submit")],-1)
printHtmlPart(30)
}
else {
printHtmlPart(31)
invokeTag('hiddenField','g',255,['name':("userListid"),'value':(usersInstance?.id)],-1)
printHtmlPart(17)
invokeTag('actionSubmit','g',259,['action':("updateCommanUsers"),'class':("btn btn-primary"),'value':("Update Details")],-1)
printHtmlPart(32)
}
printHtmlPart(33)
})
invokeTag('form','g',260,['class':("register-form"),'controller':("commanUsers"),'enctype':("multipart/form-data"),'name':("validateip")],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',334,['class':(" login")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1686219596000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
