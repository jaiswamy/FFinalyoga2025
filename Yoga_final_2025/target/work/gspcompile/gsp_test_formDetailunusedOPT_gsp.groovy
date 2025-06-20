import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_test_formDetailunusedOPT_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/unusedOPT.gsp" }
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
expressionOut.print(fieldValue(bean: formDetailInstance, field: "apllicationNo"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
invokeTag('hiddenField','g',242,['name':("userListid"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
createTagBody(4, {->
printHtmlPart(21)
invokeTag('message','g',261,['code':("default.button.All Delete.label"),'default':("All Delete")],-1)
printHtmlPart(20)
})
invokeTag('link','g',261,['class':("btn btn-transparent yellow btn-outline btn-circle btn-sm active"),'action':("deleteOPT"),'resource':(formDetailInstance)],4)
printHtmlPart(18)
})
invokeTag('ifAnyGranted','sec',262,['roles':("ROLE_ADMIN")],3)
printHtmlPart(22)
})
invokeTag('formRemote','g',263,['name':("kk"),'style':("text-align:center"),'url':([action:'adminEdit']),'update':("update1")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',406,['class':("page-container-bg-solid")],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768311638L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
