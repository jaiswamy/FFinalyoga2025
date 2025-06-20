import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_formDetailuserlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/userlist.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',57,[:],1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',179,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',180,['roles':("ROLE_ADMIN")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',186,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',187,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(11)
invokeTag('render','g',192,['template':("/header/topBar")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( formDetailInstance in (formdet) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(i+1)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "username"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "password"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "email"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "phoneNo"))
printHtmlPart(17)
invokeTag('formatDate','g',251,['date':(formDetailInstance.dateCreated)],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance.address, field: "city"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: formDetailInstance.address, field: "state"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',401,['class':("page-container-bg-solid")],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675861243165L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
