import com.hiideals.jobForm.NonTeachingForm
import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingFormedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',55,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',120,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',121,['roles':("ROLE_ADMIN")],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(8)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',126,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',127,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(9)
invokeTag('render','g',132,['template':("/header/topBar")],-1)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('hiddenField','g',138,['name':("version"),'value':(nonTeachingFormInstance?.version)],-1)
printHtmlPart(11)
invokeTag('render','g',140,['template':("form")],-1)
printHtmlPart(12)
invokeTag('actionSubmit','g',146,['class':("btn green"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(13)
})
invokeTag('form','g',150,['class':("form-horizontal"),'url':([resource:nonTeachingFormInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',335,['class':("page-container-bg-solid")],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1657868842000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
