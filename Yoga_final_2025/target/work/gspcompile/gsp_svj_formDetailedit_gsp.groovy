import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_formDetailedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/edit.gsp" }
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
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',120,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',121,['roles':("ROLE_ADMIN")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(6)
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
invokeTag('hiddenField','g',141,['name':("version"),'value':(formDetailInstance?.version)],-1)
printHtmlPart(11)
invokeTag('render','g',144,['template':("form")],-1)
printHtmlPart(12)
invokeTag('actionSubmit','g',152,['class':("btn green"),'action':("updateForm"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(13)
})
invokeTag('form','g',154,['class':("form-horizontal"),'enctype':("multipart/form-data"),'url':([resource:formDetailInstance, action:'updateForm']),'method':("PUT")],2)
printHtmlPart(14)
expressionOut.print(formDetailInstance?.otherDegrees1?.nameofDegree.last())
printHtmlPart(15)
expressionOut.print(formDetailInstance?.otherDegrees1?.otherDiploma.last())
printHtmlPart(16)
expressionOut.print(formDetailInstance?.otherDegrees1?.percentageotherDiploma.last())
printHtmlPart(17)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.otherDegrees1?.otherDiplomayear.last()))
printHtmlPart(18)
expressionOut.print(formDetailInstance?.otherDegrees1?.boardUniversityotherDiploma.last())
printHtmlPart(19)
expressionOut.print(formDetailInstance?.languages1?.language.last())
printHtmlPart(20)
expressionOut.print(formDetailInstance?.languages1?.reading.last())
printHtmlPart(21)
expressionOut.print(formDetailInstance?.languages1?.writing.last())
printHtmlPart(22)
expressionOut.print(formDetailInstance?.languages1?.speaking.last())
printHtmlPart(23)
expressionOut.print(formDetailInstance?.languages1?.examinationpassed.last())
printHtmlPart(24)
expressionOut.print(formDetailInstance?.experiences1?.workExperience.last())
printHtmlPart(25)
expressionOut.print(formDetailInstance?.experiences1?.companyName.last())
printHtmlPart(26)
expressionOut.print(formDetailInstance?.experiences1?.postHeld.last())
printHtmlPart(27)
expressionOut.print(formDetailInstance?.experiences1?.nameOfTheEmployeer.last())
printHtmlPart(28)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.experiences1?.dateOfJoining.last()))
printHtmlPart(29)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.experiences1?.dateOfLeaving.last()))
printHtmlPart(30)
expressionOut.print(formDetailInstance?.experiences1?.periodOfService.last())
printHtmlPart(31)
expressionOut.print(formDetailInstance?.experiences1?.reasonOfLeaving.last())
printHtmlPart(32)
expressionOut.print(formDetailInstance?.experiences1?.basicPay.last())
printHtmlPart(33)
expressionOut.print(formDetailInstance?.specialAwards2?.particularsAwards.last())
printHtmlPart(34)
expressionOut.print(formDetailInstance?.specialAwards2?.noofAwards.last())
printHtmlPart(35)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:formDetailInstance?.specialAwards2?.awardsYear.last()))
printHtmlPart(36)
expressionOut.print(formDetailInstance?.specialAwards2?.awardedfor.last())
printHtmlPart(37)
expressionOut.print(formDetailInstance?.sp?.particulars.last())
printHtmlPart(38)
expressionOut.print(formDetailInstance?.sp?.titlesPapers.last())
printHtmlPart(39)
expressionOut.print(formDetailInstance?.sp?.publisher.last())
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',552,['class':("page-container-bg-solid")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768168841L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
