import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_loginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/auth.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',23,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',24,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',24,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',25,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',26,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',27,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Animate Research"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',28,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',63,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
expressionOut.print(postUrl)
printHtmlPart(9)
expressionOut.print(message(code: "springSecurity.login.button"))
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(12)
invokeTag('textField','g',152,['name':("username"),'class':("form-control"),'placeholder':("Username"),'value':(usersInstance?.username),'required':("true")],-1)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(usersInstance?.username)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(17)
expressionOut.print(usersInstance?.password)
printHtmlPart(18)
}
else {
printHtmlPart(17)
expressionOut.print(usersInstance?.password)
printHtmlPart(19)
}
printHtmlPart(20)
expressionOut.print(usersInstance?.phoneNo)
printHtmlPart(21)
expressionOut.print(usersInstance?.address?.email)
printHtmlPart(22)
expressionOut.print(usersInstance?.address?.city)
printHtmlPart(23)
expressionOut.print(usersInstance?.address?.state)
printHtmlPart(24)
if(true && (params?.action !="adminEdit")) {
printHtmlPart(25)
invokeTag('actionSubmit','g',233,['action':("SaveCommanUsers"),'class':("btn btn-success uppercase pull-right"),'style':("background-color: #1740c2 !important; border-color: #86cd92 !important;"),'value':("Submit")],-1)
printHtmlPart(26)
}
else {
printHtmlPart(27)
invokeTag('hiddenField','g',243,['name':("userListid"),'value':(usersInstance?.id)],-1)
printHtmlPart(13)
invokeTag('actionSubmit','g',247,['action':("updateCommanUsers"),'class':("btn btn-primary"),'value':("Update Details")],-1)
printHtmlPart(28)
}
printHtmlPart(29)
})
invokeTag('form','g',248,['class':("register-form"),'controller':("commanUsers"),'enctype':("multipart/form-data"),'name':("validateip")],2)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',379,['class':(" login"),'style':("background-image: url('../assets1/pages/img/B6.png'); background-repeat: no-repeat; background-attachment: fixed; background-position: center; background-size: cover; position: relative; margin: -78px auto 0 !important;")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1677238608843L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
