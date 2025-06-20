import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_formDetailreport_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/report.gsp" }
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
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',143,['controller':("formDetail"),'action':("adminformDetails")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',143,['roles':("ROLE_ADMIN")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',150,['controller':("formDetail"),'action':("index")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',150,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(10)
invokeTag('render','g',156,['template':("/header/topBar")],-1)
printHtmlPart(11)
expressionOut.print(formdet?.apllicationNo)
printHtmlPart(12)
expressionOut.print(formdet?.appliyingPost)
printHtmlPart(13)
expressionOut.print(formdet?.firstName)
printHtmlPart(14)
expressionOut.print(formdet?.fName)
printHtmlPart(15)
expressionOut.print(formdet?.mName)
printHtmlPart(16)
if(true && (formdet?.picture !=null)) {
printHtmlPart(17)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formdet?.picture?.id))
printHtmlPart(18)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formdet?.picture?.id))
printHtmlPart(19)
}
else {
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('formatDate','g',278,['date':(formdet.dob),'format':("dd-MM-yyyy")],-1)
printHtmlPart(22)
expressionOut.print(formdet?.gender)
printHtmlPart(23)
expressionOut.print(formdet?.email)
printHtmlPart(24)
expressionOut.print(formdet?.phoneNumber)
printHtmlPart(25)
expressionOut.print(formdet?.hNo)
printHtmlPart(26)
expressionOut.print(formdet?.street)
printHtmlPart(26)
expressionOut.print(formdet?.village)
printHtmlPart(27)
expressionOut.print(formdet?.city)
printHtmlPart(26)
expressionOut.print(formdet?.taluka)
printHtmlPart(26)
expressionOut.print(formdet?.district)
printHtmlPart(26)
expressionOut.print(formdet?.state)
printHtmlPart(26)
expressionOut.print(formdet?.pinCode)
printHtmlPart(27)
expressionOut.print(formdet?.country)
printHtmlPart(28)
expressionOut.print(formdet?.socialcategory)
printHtmlPart(29)
expressionOut.print(formdet?.subcast)
printHtmlPart(30)
expressionOut.print(formdet?.religion)
printHtmlPart(31)
if(true && (formdet?.paymentInfoId?.paymentId != null)) {
printHtmlPart(32)
expressionOut.print(formdet?.paymentInfoId?.paymentId)
printHtmlPart(33)
expressionOut.print(formdet?.paymentInfoId?.transactionId)
printHtmlPart(33)
expressionOut.print(formdet?.paymentInfoId?.status)
printHtmlPart(34)
invokeTag('formatDate','g',381,['date':(formdet?.paymentInfoId?.createddate)],-1)
printHtmlPart(35)
expressionOut.print(formdet?.paymentInfoId?.totalamount)
printHtmlPart(36)
}
printHtmlPart(37)
expressionOut.print(formdet?.firstName)
printHtmlPart(38)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(39)
}
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',576,['class':("page-container-bg-solid")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1677302498247L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
