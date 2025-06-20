import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingFormunusedData_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/unusedData.gsp" }
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
invokeTag('link','g',164,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',165,['roles':("ROLE_ADMIN")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',171,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',172,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(11)
invokeTag('render','g',177,['template':("/header/topBar")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdets) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(i+1)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: nonTeachingFormInstance, field: "apllicationNo"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
invokeTag('hiddenField','g',233,['name':("userListid"),'value':(nonTeachingFormInstance?.id)],-1)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
createTagBody(4, {->
printHtmlPart(21)
invokeTag('message','g',244,['code':("default.button.All Delete.label"),'default':("All Delete")],-1)
printHtmlPart(22)
})
invokeTag('link','g',245,['class':("btn btn-transparent yellow btn-outline btn-circle btn-sm active"),'action':("deleteData"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(20)
})
invokeTag('ifAnyGranted','sec',245,['roles':("ROLE_ADMIN")],3)
printHtmlPart(23)
})
invokeTag('formRemote','g',246,['name':("kk"),'style':("text-align:center"),'url':([action:'adminEdit']),'update':("update1")],2)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',389,['class':("page-container-bg-solid")],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1673671930000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
