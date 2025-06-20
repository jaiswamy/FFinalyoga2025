import com.hiideals.form.Certificate
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_yoga_certificateadminindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/certificate/adminindex.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'certificate.label', default: 'Certificate'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('message','g',13,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',17,['code':("default.home.label")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',19,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',20,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',25,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',37,['property':("firstName"),'title':(message(code: 'certificate.firstName.label', default: 'First Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',40,['property':("lastName"),'title':(message(code: 'certificate.lastName.label', default: 'Last Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',43,['property':("phoneNo"),'title':(message(code: 'certificate.phoneNo.label', default: 'Phone No'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',46,['property':("dob"),'title':(message(code: 'certificate.dob.label', default: 'Dob'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',49,['property':("gender"),'title':(message(code: 'certificate.gender.label', default: 'Gender'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',52,['property':("Certificates"),'title':(message(code: 'certificate.Certificates.label', default: 'Certificates'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( certificateInstance in (formdet) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(fieldValue(bean: certificateInstance, field: "firstName"))
printHtmlPart(19)
})
invokeTag('link','g',63,['action':("show"),'id':(certificateInstance.id)],3)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: certificateInstance, field: "lastName"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: certificateInstance, field: "phoneNo"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: certificateInstance, field: "dob"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: certificateInstance, field: "gender"))
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',83,['action':("report"),'resource':(certificateInstance)],3)
printHtmlPart(24)
i++
}
}
printHtmlPart(25)
invokeTag('paginate','g',92,['total':(certificateInstanceCount ?: 0)],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',95,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1686142316000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
