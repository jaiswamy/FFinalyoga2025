import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_test_formDetailshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/show.gsp" }
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
invokeTag('captureHead','sitemesh',53,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',136,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',136,['roles':("ROLE_ADMIN")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',143,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(8)
})
invokeTag('ifAnyGranted','sec',143,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(10)
invokeTag('render','g',149,['template':("/header/topBar")],-1)
printHtmlPart(11)
expressionOut.print(formDetailInstance?.apllicationNo)
printHtmlPart(12)
expressionOut.print(formDetailInstance?.appliyingPost)
printHtmlPart(13)
expressionOut.print(formDetailInstance?.appliyingSub)
printHtmlPart(14)
expressionOut.print(formDetailInstance?.firstName)
printHtmlPart(15)
expressionOut.print(formDetailInstance?.lastName)
printHtmlPart(16)
expressionOut.print(formDetailInstance?.fName)
printHtmlPart(17)
expressionOut.print(formDetailInstance?.mName)
printHtmlPart(18)
expressionOut.print(formDetailInstance?.gender)
printHtmlPart(19)
invokeTag('formatDate','g',216,['date':(formDetailInstance.dob),'format':("mm-dd-yyyy")],-1)
printHtmlPart(20)
expressionOut.print(formDetailInstance?.email)
printHtmlPart(21)
expressionOut.print(formDetailInstance?.phoneNumber)
printHtmlPart(22)
expressionOut.print(formDetailInstance?.hNo)
printHtmlPart(23)
expressionOut.print(formDetailInstance?.street)
printHtmlPart(24)
expressionOut.print(formDetailInstance?.village)
printHtmlPart(25)
expressionOut.print(formDetailInstance?.taluka)
printHtmlPart(26)
expressionOut.print(formDetailInstance?.district)
printHtmlPart(27)
expressionOut.print(formDetailInstance?.state)
printHtmlPart(28)
expressionOut.print(formDetailInstance?.pinCode)
printHtmlPart(29)
expressionOut.print(formDetailInstance?.country)
printHtmlPart(30)
expressionOut.print(formDetailInstance?.socialcategory)
printHtmlPart(31)
expressionOut.print(formDetailInstance?.subcast)
printHtmlPart(32)
expressionOut.print(formDetailInstance?.religion)
printHtmlPart(33)
expressionOut.print(formDetailInstance?.kvcNo)
printHtmlPart(34)
invokeTag('formatDate','g',299,['date':(formDetailInstance.fvcDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(35)
expressionOut.print(formDetailInstance?.neteducation)
printHtmlPart(36)
expressionOut.print(formDetailInstance?.age)
printHtmlPart(37)
expressionOut.print(formDetailInstance?.ageRelax)
printHtmlPart(38)
expressionOut.print(formDetailInstance?.ageCat)
printHtmlPart(39)
expressionOut.print(formDetailInstance?.woman)
printHtmlPart(40)
expressionOut.print(formDetailInstance?.ruralstdy)
printHtmlPart(41)
expressionOut.print(formDetailInstance?.exServiceMan)
printHtmlPart(42)
expressionOut.print(formDetailInstance?.kannadaMedium)
printHtmlPart(43)
expressionOut.print(formDetailInstance?.pwd)
printHtmlPart(44)
expressionOut.print(formDetailInstance?.j371)
printHtmlPart(45)
invokeTag('formatDate','g',383,['date':(formDetailInstance.hkIssueDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(46)
expressionOut.print(formDetailInstance?.hkRDNO)
printHtmlPart(47)
expressionOut.print(formDetailInstance?.sslc)
printHtmlPart(48)
expressionOut.print(formDetailInstance?.obtainedsslc)
printHtmlPart(49)
expressionOut.print(formDetailInstance?.maximumsslc)
printHtmlPart(50)
expressionOut.print(formDetailInstance?.percentagesslc)
printHtmlPart(51)
invokeTag('formatDate','g',442,['date':(formDetailInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(52)
expressionOut.print(formDetailInstance?.boardUniversitysslc)
printHtmlPart(53)
expressionOut.print(formDetailInstance?.puc)
printHtmlPart(48)
expressionOut.print(formDetailInstance?.obtainedpuc)
printHtmlPart(49)
expressionOut.print(formDetailInstance?.maximumpuc)
printHtmlPart(50)
expressionOut.print(formDetailInstance?.percentagepuc)
printHtmlPart(51)
invokeTag('formatDate','g',493,['date':(formDetailInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(52)
expressionOut.print(formDetailInstance?.boardUniversitypuc)
printHtmlPart(54)
expressionOut.print(formDetailInstance?.kannadaLanguage)
printHtmlPart(55)
expressionOut.print(formDetailInstance?.kpsckannadaexam)
printHtmlPart(56)
expressionOut.print(formDetailInstance?.degreeNameBachelors)
printHtmlPart(57)
expressionOut.print(formDetailInstance?.bachelorsDegree)
printHtmlPart(58)
expressionOut.print(formDetailInstance?.percentagebachelorsDegree)
printHtmlPart(59)
invokeTag('formatDate','g',566,['date':(formDetailInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(60)
expressionOut.print(formDetailInstance?.boardUniversitybachelorsDegree)
printHtmlPart(61)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(62)
if(true && (formDetailInstance?.subjectMaster != "")) {
printHtmlPart(63)
expressionOut.print(formDetailInstance?.subjectMaster)
printHtmlPart(64)
}
printHtmlPart(65)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(66)
expressionOut.print(formDetailInstance?.mastersDegree)
printHtmlPart(64)
}
printHtmlPart(67)
if(true && (formDetailInstance?.percentagemastersDegree != "")) {
printHtmlPart(68)
expressionOut.print(formDetailInstance?.percentagemastersDegree)
printHtmlPart(64)
}
printHtmlPart(65)
if(true && (formDetailInstance.mastersDegreeyear != null)) {
printHtmlPart(69)
invokeTag('formatDate','g',624,['date':(formDetailInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(70)
}
printHtmlPart(67)
if(true && (formDetailInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(71)
expressionOut.print(formDetailInstance?.boardUniversitymastersDegree)
printHtmlPart(64)
}
printHtmlPart(72)
}
printHtmlPart(73)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(74)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(66)
expressionOut.print(formDetailInstance?.pHD)
printHtmlPart(64)
}
printHtmlPart(65)
if(true && (formDetailInstance?.percentagepHD != "")) {
printHtmlPart(75)
expressionOut.print(formDetailInstance?.percentagepHD)
printHtmlPart(64)
}
printHtmlPart(67)
if(true && (formDetailInstance?.pHDSubject != "")) {
printHtmlPart(76)
expressionOut.print(formDetailInstance?.pHDSubject)
printHtmlPart(64)
}
printHtmlPart(65)
if(true && (formDetailInstance.pHDyear != null)) {
printHtmlPart(69)
invokeTag('formatDate','g',682,['date':(formDetailInstance.pHDyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(70)
}
printHtmlPart(67)
if(true && (formDetailInstance?.boardUniversitypHD != "")) {
printHtmlPart(71)
expressionOut.print(formDetailInstance?.boardUniversitypHD)
printHtmlPart(64)
}
printHtmlPart(77)
}
printHtmlPart(78)
loop:{
int l = 0
for( loc11 in (formDetailInstance?.otherDegrees1) ) {
printHtmlPart(79)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(80)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(81)
expressionOut.print(loc11?.additionalType)
printHtmlPart(82)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(83)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(84)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(85)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(86)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(88)
loop:{
int l = 0
for( loc221 in (formDetailInstance?.achievements1) ) {
printHtmlPart(79)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(89)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(90)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(91)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(92)
expressionOut.print(loc221?.level)
printHtmlPart(93)
}
printHtmlPart(94)
l++
}
}
printHtmlPart(95)
loop:{
int l = 0
for( loc2221 in (formDetailInstance?.specialAttainment1) ) {
printHtmlPart(79)
if(true && (loc2221?.particular || loc2221?.cadre || loc2221?.year || loc2221?.details  != null)) {
printHtmlPart(96)
expressionOut.print(loc2221?.particular)
printHtmlPart(97)
expressionOut.print(loc2221?.cadre)
printHtmlPart(98)
expressionOut.print(loc2221?.year)
printHtmlPart(99)
expressionOut.print(loc2221?.details)
printHtmlPart(93)
}
printHtmlPart(94)
l++
}
}
printHtmlPart(100)
loop:{
int l = 0
for( loc22221 in (formDetailInstance?.patent1) ) {
printHtmlPart(8)
if(true && (loc22221?.details1 || loc22221?.year1  != null)) {
printHtmlPart(101)
expressionOut.print(loc22221?.details1)
printHtmlPart(102)
expressionOut.print(loc22221?.year1)
printHtmlPart(103)
}
printHtmlPart(94)
l++
}
}
printHtmlPart(104)
loop:{
int l = 0
for( locs1 in (formDetailInstance?.fproject) ) {
printHtmlPart(79)
if(true && (locs1?.projectTitle || locs1?.cadre2 || locs1?.details2 || locs1?.projectOutlay  != null)) {
printHtmlPart(105)
expressionOut.print(locs1?.projectTitle)
printHtmlPart(97)
expressionOut.print(locs1?.cadre2)
printHtmlPart(106)
expressionOut.print(locs1?.details2)
printHtmlPart(107)
expressionOut.print(locs1?.projectOutlay)
printHtmlPart(93)
}
printHtmlPart(94)
l++
}
}
printHtmlPart(108)
loop:{
int l = 0
for( locs11 in (formDetailInstance?.wshop) ) {
printHtmlPart(79)
if(true && (locs11?.particulars3 || locs11?.level3 || locs11?.year3 || locs11?.details3 || locs11?.type10  != null)) {
printHtmlPart(109)
expressionOut.print(locs11?.particulars3)
printHtmlPart(110)
expressionOut.print(locs11?.level3)
printHtmlPart(106)
expressionOut.print(locs11?.details3)
printHtmlPart(111)
expressionOut.print(locs11?.year3)
printHtmlPart(112)
expressionOut.print(locs11?.type10)
printHtmlPart(113)
}
printHtmlPart(94)
l++
}
}
printHtmlPart(114)
loop:{
int l = 0
for( loc31 in (formDetailInstance?.experiences1) ) {
printHtmlPart(79)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(115)
expressionOut.print(loc31?.workExperience)
printHtmlPart(116)
expressionOut.print(loc31?.companyName)
printHtmlPart(117)
expressionOut.print(loc31?.postHeld)
printHtmlPart(118)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(119)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(120)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(121)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(122)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(123)
expressionOut.print(loc31?.basicPay)
printHtmlPart(124)
}
printHtmlPart(94)
l++
}
}
printHtmlPart(125)
loop:{
int l = 0
for( loc111 in (formDetailInstance?.specialAwards2) ) {
printHtmlPart(79)
if(true && (loc111?.particularsAwards || loc111?.noofAwards || loc111.awardsYear || loc111?.awardedfor != null)) {
printHtmlPart(126)
expressionOut.print(loc111?.particularsAwards)
printHtmlPart(127)
expressionOut.print(loc111?.noofAwards)
printHtmlPart(128)
expressionOut.print(loc111.awardsYear)
printHtmlPart(129)
expressionOut.print(loc111?.awardedfor)
printHtmlPart(93)
}
printHtmlPart(94)
l++
}
}
printHtmlPart(130)
if(true && (formDetailInstance?.picture?.id != null)) {
printHtmlPart(131)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(133)
}
printHtmlPart(134)
if(true && (formDetailInstance?.signature?.id != null)) {
printHtmlPart(135)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(136)
}
printHtmlPart(137)
if(true && (formDetailInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(138)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(133)
}
printHtmlPart(134)
if(true && (formDetailInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(139)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(140)
}
printHtmlPart(141)
if(true && (formDetailInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(142)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(133)
}
printHtmlPart(143)
if(true && (formDetailInstance?.ugPDC?.id != null)) {
printHtmlPart(144)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(133)
}
printHtmlPart(145)
if(true && (formDetailInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(146)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(140)
}
printHtmlPart(147)
if(true && (formDetailInstance?.pgPDC?.id != null)) {
printHtmlPart(148)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(140)
}
printHtmlPart(149)
if(true && (formDetailInstance?.phDCertificate?.id != null)) {
printHtmlPart(150)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(133)
}
printHtmlPart(143)
if(true && (formDetailInstance?.phdPDc?.id != null)) {
printHtmlPart(151)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(133)
}
printHtmlPart(152)
if(true && (formDetailInstance?.nETCertificate?.id != null)) {
printHtmlPart(153)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(140)
}
printHtmlPart(154)
if(true && (formDetailInstance?.experienceCertificate?.id != null)) {
printHtmlPart(155)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(140)
}
printHtmlPart(156)
if(true && (formDetailInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(157)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(133)
}
printHtmlPart(134)
if(true && (formDetailInstance?.ruralCertificate?.id != null)) {
printHtmlPart(158)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(140)
}
printHtmlPart(141)
if(true && (formDetailInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(159)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(133)
}
printHtmlPart(160)
if(true && (formDetailInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(161)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(140)
}
printHtmlPart(162)
if(true && (formDetailInstance?.kpsckannadaCertificate?.id != null)) {
printHtmlPart(163)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(140)
}
printHtmlPart(141)
if(true && (formDetailInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(164)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(133)
}
printHtmlPart(134)
if(true && (formDetailInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(165)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(140)
}
printHtmlPart(141)
if(true && (formDetailInstance?.kVCCertificate?.id != null)) {
printHtmlPart(166)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(133)
}
printHtmlPart(143)
if(true && (formDetailInstance?.kvc2?.id != null)) {
printHtmlPart(167)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(133)
}
printHtmlPart(168)
if(true && (formDetailInstance?.uploade10?.id != null)) {
printHtmlPart(169)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(132)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(140)
}
printHtmlPart(170)
if(true && (formDetailInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(171)
createTagBody(3, {->
printHtmlPart(172)
createTagBody(4, {->
printHtmlPart(173)
invokeTag('message','g',1438,['code':("default.button.Pay Now.label"),'default':("Pay Now")],-1)
printHtmlPart(160)
})
invokeTag('link','g',1438,['class':("btn yellow"),'action':("makePayment"),'resource':(formDetailInstance)],4)
printHtmlPart(174)
})
invokeTag('form','g',1439,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(175)
}
else {
printHtmlPart(176)
}
printHtmlPart(177)
})
invokeTag('captureBody','sitemesh',1510,['class':("page-container-bg-solid"),'id':("printableArea")],1)
printHtmlPart(178)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768294653L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
