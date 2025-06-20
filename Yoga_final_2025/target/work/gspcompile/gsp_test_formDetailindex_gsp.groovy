import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_test_formDetailindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/index.gsp" }
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
invokeTag('link','g',178,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',179,['roles':("ROLE_ADMIN")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',185,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',186,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(11)
invokeTag('render','g',191,['template':("/header/topBar")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(i+1)
printHtmlPart(15)
invokeTag('set','g',239,['var':("user"),'value':(formDetailInstance?.achievements1)],-1)
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null &&  user.size() != 0 && formDetailInstance?.picture != null)) {
printHtmlPart(17)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(18)
createClosureForHtmlPart(19, 5)
invokeTag('link','g',251,['action':("makePayment"),'resource':(formDetailInstance)],5)
printHtmlPart(20)
}
else {
printHtmlPart(21)
createClosureForHtmlPart(22, 5)
invokeTag('link','g',258,['action':("report"),'resource':(formDetailInstance)],5)
printHtmlPart(20)
}
printHtmlPart(16)
}
else {
printHtmlPart(23)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo == null)) {
printHtmlPart(24)
createTagBody(4, {->
printHtmlPart(25)
invokeTag('message','g',276,['code':("default.button.Report Print.label"),'default':("Application Status")],-1)
printHtmlPart(26)
})
invokeTag('link','g',277,['class':("btn "),'action':("create"),'resource':(formDetailInstance)],4)
printHtmlPart(27)
}
else {
printHtmlPart(28)
expressionOut.print(i)
printHtmlPart(29)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null)) {
printHtmlPart(17)
if(true && (formDetailInstance?.sslc == null)) {
printHtmlPart(30)
createTagBody(5, {->
printHtmlPart(31)
invokeTag('message','g',301,['code':("default.button.Report Print.label"),'default':("Add Education Details")],-1)
printHtmlPart(32)
})
invokeTag('link','g',301,['class':("btn "),'action':("createEducations"),'resource':(formDetailInstance)],5)
printHtmlPart(33)
}
else {
printHtmlPart(34)
expressionOut.print(i)
printHtmlPart(35)
}
printHtmlPart(16)
}
else {
printHtmlPart(36)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null)) {
printHtmlPart(37)
invokeTag('set','g',330,['var':("user"),'value':(formDetailInstance?.achievements1)],-1)
printHtmlPart(38)
if(true && (user.size() == 0)) {
printHtmlPart(39)
createTagBody(5, {->
printHtmlPart(31)
invokeTag('message','g',342,['code':("default.button.Report Print.label"),'default':("Add More Details")],-1)
printHtmlPart(32)
})
invokeTag('link','g',342,['class':("btn "),'action':("createAddmore"),'resource':(formDetailInstance)],5)
printHtmlPart(40)
}
else {
printHtmlPart(41)
expressionOut.print(i)
printHtmlPart(42)
}
printHtmlPart(27)
}
else {
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null &&  user.size() != 0)) {
printHtmlPart(17)
if(true && (formDetailInstance?.picture == null)) {
printHtmlPart(30)
createTagBody(5, {->
printHtmlPart(31)
invokeTag('message','g',376,['code':("default.button.Report Print.label"),'default':("Upload Documents")],-1)
printHtmlPart(32)
})
invokeTag('link','g',376,['class':("btn"),'action':("createdocumentss"),'resource':(formDetailInstance)],5)
printHtmlPart(44)
}
else {
printHtmlPart(45)
expressionOut.print(i)
printHtmlPart(46)
}
printHtmlPart(16)
}
else {
printHtmlPart(47)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null &&  user.size() != 0 && formDetailInstance?.picture != null)) {
printHtmlPart(24)
createTagBody(4, {->
printHtmlPart(25)
invokeTag('hiddenField','g',405,['name':("userListid"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(48)
createTagBody(5, {->
printHtmlPart(32)
createTagBody(6, {->
printHtmlPart(31)
invokeTag('message','g',408,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(32)
})
invokeTag('link','g',409,['class':("btn btn-primary"),'action':("edit"),'resource':(formDetailInstance)],6)
printHtmlPart(25)
})
invokeTag('ifAnyGranted','sec',409,['roles':("ROLE_ADMIN")],5)
printHtmlPart(48)
createTagBody(5, {->
printHtmlPart(32)
invokeTag('message','g',420,['code':("default.button.Report Print.label"),'default':("Application Status")],-1)
printHtmlPart(25)
})
invokeTag('link','g',421,['class':("btn btn-transparent green btn-outline btn-circle btn-sm active"),'action':("report"),'resource':(formDetailInstance)],5)
printHtmlPart(49)
expressionOut.print(i)
printHtmlPart(50)
invokeTag('message','g',428,['code':("default.button.show.label"),'default':("Details of the Application")],-1)
printHtmlPart(51)
})
invokeTag('formRemote','g',430,['name':("kk"),'url':([action:'adminEdit']),'update':("update1")],4)
printHtmlPart(27)
}
else {
printHtmlPart(23)
}
printHtmlPart(52)
i++
}
}
printHtmlPart(53)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(54)
expressionOut.print(i)
printHtmlPart(55)
expressionOut.print(formDetailInstance?.apllicationNo)
printHtmlPart(56)
expressionOut.print(formDetailInstance?.appliyingPost)
printHtmlPart(57)
expressionOut.print(formDetailInstance?.appliyingSub)
printHtmlPart(58)
expressionOut.print(formDetailInstance?.firstName)
printHtmlPart(59)
expressionOut.print(formDetailInstance?.lastName)
printHtmlPart(60)
expressionOut.print(formDetailInstance?.fName)
printHtmlPart(61)
expressionOut.print(formDetailInstance?.mName)
printHtmlPart(62)
expressionOut.print(formDetailInstance?.gender)
printHtmlPart(63)
invokeTag('formatDate','g',533,['date':(formDetailInstance.dob),'format':("mm-dd-yyyy")],-1)
printHtmlPart(64)
expressionOut.print(formDetailInstance?.email)
printHtmlPart(65)
expressionOut.print(formDetailInstance?.phoneNumber)
printHtmlPart(66)
expressionOut.print(formDetailInstance?.hNo)
printHtmlPart(67)
expressionOut.print(formDetailInstance?.street)
printHtmlPart(68)
expressionOut.print(formDetailInstance?.village)
printHtmlPart(69)
expressionOut.print(formDetailInstance?.taluka)
printHtmlPart(70)
expressionOut.print(formDetailInstance?.district)
printHtmlPart(71)
expressionOut.print(formDetailInstance?.state)
printHtmlPart(72)
expressionOut.print(formDetailInstance?.pinCode)
printHtmlPart(73)
expressionOut.print(formDetailInstance?.country)
printHtmlPart(74)
expressionOut.print(formDetailInstance?.socialcategory)
printHtmlPart(75)
expressionOut.print(formDetailInstance?.subcast)
printHtmlPart(76)
expressionOut.print(formDetailInstance?.religion)
printHtmlPart(77)
expressionOut.print(formDetailInstance?.kvcNo)
printHtmlPart(78)
invokeTag('formatDate','g',619,['date':(formDetailInstance.fvcDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(79)
expressionOut.print(formDetailInstance?.neteducation)
printHtmlPart(80)
expressionOut.print(formDetailInstance?.age)
printHtmlPart(81)
expressionOut.print(formDetailInstance?.ageRelax)
printHtmlPart(82)
expressionOut.print(formDetailInstance?.ageCat)
printHtmlPart(83)
expressionOut.print(formDetailInstance?.woman)
printHtmlPart(84)
expressionOut.print(formDetailInstance?.ruralstdy)
printHtmlPart(85)
expressionOut.print(formDetailInstance?.exServiceMan)
printHtmlPart(86)
expressionOut.print(formDetailInstance?.kannadaMedium)
printHtmlPart(87)
expressionOut.print(formDetailInstance?.pwd)
printHtmlPart(88)
expressionOut.print(formDetailInstance?.j371)
printHtmlPart(89)
invokeTag('formatDate','g',715,['date':(formDetailInstance.hkIssueDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(90)
expressionOut.print(formDetailInstance?.hkRDNO)
printHtmlPart(91)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(17)
createClosureForHtmlPart(92, 4)
invokeTag('form','g',746,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(16)
}
else {
printHtmlPart(17)
createClosureForHtmlPart(93, 4)
invokeTag('link','g',751,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(16)
}
printHtmlPart(94)
i++
}
}
printHtmlPart(95)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(96)
expressionOut.print(i)
printHtmlPart(97)
expressionOut.print(formDetailInstance?.sslc)
printHtmlPart(98)
expressionOut.print(formDetailInstance?.obtainedsslc)
printHtmlPart(99)
expressionOut.print(formDetailInstance?.maximumsslc)
printHtmlPart(100)
expressionOut.print(formDetailInstance?.percentagesslc)
printHtmlPart(101)
invokeTag('formatDate','g',831,['date':(formDetailInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(102)
expressionOut.print(formDetailInstance?.boardUniversitysslc)
printHtmlPart(103)
expressionOut.print(formDetailInstance?.puc)
printHtmlPart(98)
expressionOut.print(formDetailInstance?.obtainedpuc)
printHtmlPart(99)
expressionOut.print(formDetailInstance?.maximumpuc)
printHtmlPart(100)
expressionOut.print(formDetailInstance?.percentagepuc)
printHtmlPart(104)
invokeTag('formatDate','g',882,['date':(formDetailInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(102)
expressionOut.print(formDetailInstance?.boardUniversitypuc)
printHtmlPart(105)
expressionOut.print(formDetailInstance?.kannadaLanguage)
printHtmlPart(106)
expressionOut.print(formDetailInstance?.kpsckannadaexam)
printHtmlPart(107)
expressionOut.print(formDetailInstance?.degreeNameBachelors)
printHtmlPart(108)
expressionOut.print(formDetailInstance?.bachelorsDegree)
printHtmlPart(109)
expressionOut.print(formDetailInstance?.percentagebachelorsDegree)
printHtmlPart(110)
invokeTag('formatDate','g',952,['date':(formDetailInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(111)
expressionOut.print(formDetailInstance?.boardUniversitybachelorsDegree)
printHtmlPart(112)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(113)
if(true && (formDetailInstance?.subjectMaster != "")) {
printHtmlPart(114)
expressionOut.print(formDetailInstance?.subjectMaster)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(117)
expressionOut.print(formDetailInstance?.mastersDegree)
printHtmlPart(115)
}
printHtmlPart(118)
if(true && (formDetailInstance?.percentagemastersDegree != "")) {
printHtmlPart(119)
expressionOut.print(formDetailInstance?.percentagemastersDegree)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance.mastersDegreeyear != null)) {
printHtmlPart(120)
invokeTag('formatDate','g',1012,['date':(formDetailInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(121)
}
printHtmlPart(118)
if(true && (formDetailInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(122)
expressionOut.print(formDetailInstance?.boardUniversitymastersDegree)
printHtmlPart(115)
}
printHtmlPart(123)
}
printHtmlPart(124)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(125)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(117)
expressionOut.print(formDetailInstance?.pHD)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance?.percentagepHD != "")) {
printHtmlPart(126)
expressionOut.print(formDetailInstance?.percentagepHD)
printHtmlPart(115)
}
printHtmlPart(118)
if(true && (formDetailInstance?.pHDSubject != "")) {
printHtmlPart(127)
expressionOut.print(formDetailInstance?.pHDSubject)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance.pHDyear != null)) {
printHtmlPart(120)
invokeTag('formatDate','g',1067,['date':(formDetailInstance.pHDyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(121)
}
printHtmlPart(118)
if(true && (formDetailInstance?.boardUniversitypHD != "")) {
printHtmlPart(122)
expressionOut.print(formDetailInstance?.boardUniversitypHD)
printHtmlPart(115)
}
printHtmlPart(128)
}
printHtmlPart(129)
loop:{
int l = 0
for( loc11 in (formDetailInstance?.otherDegrees1) ) {
printHtmlPart(130)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(131)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(132)
expressionOut.print(loc11?.additionalType)
printHtmlPart(133)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(134)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(135)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(136)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(137)
}
printHtmlPart(138)
l++
}
}
printHtmlPart(139)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(116)
createClosureForHtmlPart(140, 4)
invokeTag('form','g',1152,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(116)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(141, 4)
invokeTag('link','g',1158,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(142)
}
printHtmlPart(143)
i++
}
}
printHtmlPart(144)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(145)
expressionOut.print(i)
printHtmlPart(146)
loop:{
int l = 0
for( loc221 in (formDetailInstance?.achievements1) ) {
printHtmlPart(130)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(147)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(148)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(149)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(150)
expressionOut.print(loc221?.level)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(153)
loop:{
int l = 0
for( loc2221 in (formDetailInstance?.specialAttainment1) ) {
printHtmlPart(130)
if(true && (loc2221?.particular || loc2221?.cadre || loc2221?.year || loc2221?.details  != null)) {
printHtmlPart(154)
expressionOut.print(loc2221?.particular)
printHtmlPart(155)
expressionOut.print(loc2221?.cadre)
printHtmlPart(156)
expressionOut.print(loc2221?.year)
printHtmlPart(157)
expressionOut.print(loc2221?.details)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(158)
loop:{
int l = 0
for( loc22221 in (formDetailInstance?.patent1) ) {
printHtmlPart(9)
if(true && (loc22221?.details1 || loc22221?.year1  != null)) {
printHtmlPart(159)
expressionOut.print(loc22221?.details1)
printHtmlPart(160)
expressionOut.print(loc22221?.year1)
printHtmlPart(161)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(162)
loop:{
int l = 0
for( locs1 in (formDetailInstance?.fproject) ) {
printHtmlPart(130)
if(true && (locs1?.projectTitle || locs1?.cadre2 || locs1?.details2 || locs1?.projectOutlay  != null)) {
printHtmlPart(163)
expressionOut.print(locs1?.projectTitle)
printHtmlPart(155)
expressionOut.print(locs1?.cadre2)
printHtmlPart(164)
expressionOut.print(locs1?.details2)
printHtmlPart(165)
expressionOut.print(locs1?.projectOutlay)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(166)
loop:{
int l = 0
for( locs11 in (formDetailInstance?.wshop) ) {
printHtmlPart(130)
if(true && (locs11?.particulars3 || locs11?.level3 || locs11?.year3 || locs11?.details3  != null)) {
printHtmlPart(167)
expressionOut.print(locs11?.particulars3)
printHtmlPart(168)
expressionOut.print(locs11?.level3)
printHtmlPart(164)
expressionOut.print(locs11?.details3)
printHtmlPart(169)
expressionOut.print(locs11?.year3)
printHtmlPart(170)
expressionOut.print(locs11?.type10)
printHtmlPart(171)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(172)
loop:{
int l = 0
for( loc31 in (formDetailInstance?.experiences1) ) {
printHtmlPart(130)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(173)
expressionOut.print(loc31?.workExperience)
printHtmlPart(174)
expressionOut.print(loc31?.companyName)
printHtmlPart(175)
expressionOut.print(loc31?.postHeld)
printHtmlPart(176)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(177)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(178)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(179)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(180)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(181)
expressionOut.print(loc31?.basicPay)
printHtmlPart(182)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(183)
loop:{
int l = 0
for( loc111 in (formDetailInstance?.specialAwards2) ) {
printHtmlPart(130)
if(true && (loc111?.particularsAwards || loc111?.noofAwards || loc111.awardsYear || loc111?.awardedfor != null)) {
printHtmlPart(184)
expressionOut.print(loc111?.particularsAwards)
printHtmlPart(185)
expressionOut.print(loc111?.noofAwards)
printHtmlPart(186)
expressionOut.print(loc111.awardsYear)
printHtmlPart(187)
expressionOut.print(loc111?.awardedfor)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(188)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(116)
createClosureForHtmlPart(140, 4)
invokeTag('form','g',1529,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(116)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(141, 4)
invokeTag('link','g',1538,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(142)
}
printHtmlPart(189)
i++
}
}
printHtmlPart(190)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(191)
expressionOut.print(i)
printHtmlPart(192)
if(true && (formDetailInstance?.picture?.id != null)) {
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(195)
}
printHtmlPart(196)
if(true && (formDetailInstance?.signature?.id != null)) {
printHtmlPart(197)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(198)
}
printHtmlPart(199)
if(true && (formDetailInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(200)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(201)
}
printHtmlPart(196)
if(true && (formDetailInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(202)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(203)
}
printHtmlPart(204)
if(true && (formDetailInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(205)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(201)
}
printHtmlPart(206)
if(true && (formDetailInstance?.ugPDC?.id != null)) {
printHtmlPart(207)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(201)
}
printHtmlPart(208)
if(true && (formDetailInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(209)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(203)
}
printHtmlPart(210)
if(true && (formDetailInstance?.pgPDC?.id != null)) {
printHtmlPart(211)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(203)
}
printHtmlPart(212)
if(true && (formDetailInstance?.phDCertificate?.id != null)) {
printHtmlPart(213)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(201)
}
printHtmlPart(206)
if(true && (formDetailInstance?.phdPDc?.id != null)) {
printHtmlPart(214)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(201)
}
printHtmlPart(215)
if(true && (formDetailInstance?.nETCertificate?.id != null)) {
printHtmlPart(216)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(217)
if(true && (formDetailInstance?.experienceCertificate?.id != null)) {
printHtmlPart(218)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(219)
if(true && (formDetailInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(220)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(201)
}
printHtmlPart(196)
if(true && (formDetailInstance?.ruralCertificate?.id != null)) {
printHtmlPart(221)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(204)
if(true && (formDetailInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(222)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(201)
}
printHtmlPart(223)
if(true && (formDetailInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(224)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(225)
if(true && (formDetailInstance?.kpsckannadaCertificate?.id != null)) {
printHtmlPart(226)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(204)
if(true && (formDetailInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(227)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(201)
}
printHtmlPart(196)
if(true && (formDetailInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(228)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(204)
if(true && (formDetailInstance?.kVCCertificate?.id != null)) {
printHtmlPart(229)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(201)
}
printHtmlPart(206)
if(true && (formDetailInstance?.kvc2?.id != null)) {
printHtmlPart(230)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(201)
}
printHtmlPart(231)
if(true && (formDetailInstance?.uploade10?.id != null)) {
printHtmlPart(232)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(203)
}
printHtmlPart(233)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(116)
createClosureForHtmlPart(234, 4)
invokeTag('form','g',1909,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(116)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(141, 4)
invokeTag('link','g',1912,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(142)
}
printHtmlPart(189)
i++
}
}
printHtmlPart(235)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(236)
expressionOut.print(i)
printHtmlPart(237)
expressionOut.print(formDetailInstance?.apllicationNo)
printHtmlPart(238)
expressionOut.print(formDetailInstance?.appliyingPost)
printHtmlPart(239)
expressionOut.print(formDetailInstance?.appliyingSub)
printHtmlPart(240)
expressionOut.print(formDetailInstance?.firstName)
printHtmlPart(241)
expressionOut.print(formDetailInstance?.lastName)
printHtmlPart(242)
expressionOut.print(formDetailInstance?.fName)
printHtmlPart(243)
expressionOut.print(formDetailInstance?.mName)
printHtmlPart(244)
expressionOut.print(formDetailInstance?.gender)
printHtmlPart(245)
invokeTag('formatDate','g',1983,['date':(formDetailInstance.dob),'format':("mm-dd-yyyy")],-1)
printHtmlPart(246)
expressionOut.print(formDetailInstance?.email)
printHtmlPart(247)
expressionOut.print(formDetailInstance?.phoneNumber)
printHtmlPart(248)
expressionOut.print(formDetailInstance?.hNo)
printHtmlPart(249)
expressionOut.print(formDetailInstance?.street)
printHtmlPart(250)
expressionOut.print(formDetailInstance?.village)
printHtmlPart(251)
expressionOut.print(formDetailInstance?.taluka)
printHtmlPart(252)
expressionOut.print(formDetailInstance?.district)
printHtmlPart(253)
expressionOut.print(formDetailInstance?.state)
printHtmlPart(254)
expressionOut.print(formDetailInstance?.pinCode)
printHtmlPart(255)
expressionOut.print(formDetailInstance?.country)
printHtmlPart(256)
expressionOut.print(formDetailInstance?.socialcategory)
printHtmlPart(257)
expressionOut.print(formDetailInstance?.subcast)
printHtmlPart(258)
expressionOut.print(formDetailInstance?.religion)
printHtmlPart(259)
expressionOut.print(formDetailInstance?.kvcNo)
printHtmlPart(260)
invokeTag('formatDate','g',2033,['date':(formDetailInstance.fvcDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(261)
expressionOut.print(formDetailInstance?.neteducation)
printHtmlPart(262)
expressionOut.print(formDetailInstance?.age)
printHtmlPart(263)
expressionOut.print(formDetailInstance?.ageRelax)
printHtmlPart(264)
expressionOut.print(formDetailInstance?.ageCat)
printHtmlPart(265)
expressionOut.print(formDetailInstance?.woman)
printHtmlPart(266)
expressionOut.print(formDetailInstance?.ruralstdy)
printHtmlPart(267)
expressionOut.print(formDetailInstance?.exServiceMan)
printHtmlPart(268)
expressionOut.print(formDetailInstance?.kannadaMedium)
printHtmlPart(269)
expressionOut.print(formDetailInstance?.pwd)
printHtmlPart(270)
expressionOut.print(formDetailInstance?.j371)
printHtmlPart(271)
invokeTag('formatDate','g',2092,['date':(formDetailInstance.hkIssueDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(272)
expressionOut.print(formDetailInstance?.hkRDNO)
printHtmlPart(273)
expressionOut.print(formDetailInstance?.sslc)
printHtmlPart(98)
expressionOut.print(formDetailInstance?.obtainedsslc)
printHtmlPart(99)
expressionOut.print(formDetailInstance?.maximumsslc)
printHtmlPart(100)
expressionOut.print(formDetailInstance?.percentagesslc)
printHtmlPart(101)
invokeTag('formatDate','g',2156,['date':(formDetailInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(102)
expressionOut.print(formDetailInstance?.boardUniversitysslc)
printHtmlPart(274)
expressionOut.print(formDetailInstance?.kannadaLanguage)
printHtmlPart(106)
expressionOut.print(formDetailInstance?.kpsckannadaexam)
printHtmlPart(275)
expressionOut.print(formDetailInstance?.puc)
printHtmlPart(98)
expressionOut.print(formDetailInstance?.obtainedpuc)
printHtmlPart(99)
expressionOut.print(formDetailInstance?.maximumpuc)
printHtmlPart(100)
expressionOut.print(formDetailInstance?.percentagepuc)
printHtmlPart(104)
invokeTag('formatDate','g',2231,['date':(formDetailInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(102)
expressionOut.print(formDetailInstance?.boardUniversitypuc)
printHtmlPart(107)
expressionOut.print(formDetailInstance?.degreeNameBachelors)
printHtmlPart(108)
expressionOut.print(formDetailInstance?.bachelorsDegree)
printHtmlPart(109)
expressionOut.print(formDetailInstance?.percentagebachelorsDegree)
printHtmlPart(110)
invokeTag('formatDate','g',2276,['date':(formDetailInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(111)
expressionOut.print(formDetailInstance?.boardUniversitybachelorsDegree)
printHtmlPart(112)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(113)
if(true && (formDetailInstance?.subjectMaster != "")) {
printHtmlPart(114)
expressionOut.print(formDetailInstance?.subjectMaster)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(117)
expressionOut.print(formDetailInstance?.mastersDegree)
printHtmlPart(115)
}
printHtmlPart(118)
if(true && (formDetailInstance?.percentagemastersDegree != "")) {
printHtmlPart(119)
expressionOut.print(formDetailInstance?.percentagemastersDegree)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance.mastersDegreeyear != null)) {
printHtmlPart(120)
invokeTag('formatDate','g',2342,['date':(formDetailInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(121)
}
printHtmlPart(118)
if(true && (formDetailInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(122)
expressionOut.print(formDetailInstance?.boardUniversitymastersDegree)
printHtmlPart(115)
}
printHtmlPart(123)
}
printHtmlPart(124)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(125)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(117)
expressionOut.print(formDetailInstance?.pHD)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance?.percentagepHD != "")) {
printHtmlPart(126)
expressionOut.print(formDetailInstance?.percentagepHD)
printHtmlPart(115)
}
printHtmlPart(118)
if(true && (formDetailInstance?.pHDSubject != "")) {
printHtmlPart(127)
expressionOut.print(formDetailInstance?.pHDSubject)
printHtmlPart(115)
}
printHtmlPart(116)
if(true && (formDetailInstance.pHDyear != null)) {
printHtmlPart(120)
invokeTag('formatDate','g',2401,['date':(formDetailInstance.pHDyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(121)
}
printHtmlPart(118)
if(true && (formDetailInstance?.boardUniversitypHD != "")) {
printHtmlPart(122)
expressionOut.print(formDetailInstance?.boardUniversitypHD)
printHtmlPart(115)
}
printHtmlPart(128)
}
printHtmlPart(129)
loop:{
int l = 0
for( loc11 in (formDetailInstance?.otherDegrees1) ) {
printHtmlPart(130)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(131)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(132)
expressionOut.print(loc11?.additionalType)
printHtmlPart(133)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(134)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(135)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(136)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(276)
}
printHtmlPart(138)
l++
}
}
printHtmlPart(277)
loop:{
int l = 0
for( loc221 in (formDetailInstance?.achievements1) ) {
printHtmlPart(130)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(147)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(148)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(149)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(150)
expressionOut.print(loc221?.level)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(153)
loop:{
int l = 0
for( loc2221 in (formDetailInstance?.specialAttainment1) ) {
printHtmlPart(130)
if(true && (loc2221?.particular || loc2221?.cadre || loc2221?.year || loc2221?.details  != null)) {
printHtmlPart(154)
expressionOut.print(loc2221?.particular)
printHtmlPart(155)
expressionOut.print(loc2221?.cadre)
printHtmlPart(156)
expressionOut.print(loc2221?.year)
printHtmlPart(157)
expressionOut.print(loc2221?.details)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(158)
loop:{
int l = 0
for( loc22221 in (formDetailInstance?.patent1) ) {
printHtmlPart(9)
if(true && (loc22221?.details1 || loc22221?.year1  != null)) {
printHtmlPart(159)
expressionOut.print(loc22221?.details1)
printHtmlPart(160)
expressionOut.print(loc22221?.year1)
printHtmlPart(161)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(162)
loop:{
int l = 0
for( locs1 in (formDetailInstance?.fproject) ) {
printHtmlPart(130)
if(true && (locs1?.projectTitle || locs1?.cadre2 || locs1?.details2 || locs1?.projectOutlay  != null)) {
printHtmlPart(163)
expressionOut.print(locs1?.projectTitle)
printHtmlPart(155)
expressionOut.print(locs1?.cadre2)
printHtmlPart(164)
expressionOut.print(locs1?.details2)
printHtmlPart(165)
expressionOut.print(locs1?.projectOutlay)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(166)
loop:{
int l = 0
for( locs11 in (formDetailInstance?.wshop) ) {
printHtmlPart(130)
if(true && (locs11?.particulars3 || locs11?.level3 || locs11?.year3 || locs11?.details3  != null)) {
printHtmlPart(167)
expressionOut.print(locs11?.particulars3)
printHtmlPart(168)
expressionOut.print(locs11?.level3)
printHtmlPart(164)
expressionOut.print(locs11?.details3)
printHtmlPart(169)
expressionOut.print(locs11?.year3)
printHtmlPart(170)
expressionOut.print(locs11?.type10)
printHtmlPart(171)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(172)
loop:{
int l = 0
for( loc31 in (formDetailInstance?.experiences1) ) {
printHtmlPart(130)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(173)
expressionOut.print(loc31?.workExperience)
printHtmlPart(174)
expressionOut.print(loc31?.companyName)
printHtmlPart(175)
expressionOut.print(loc31?.postHeld)
printHtmlPart(176)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(177)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(178)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(179)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(180)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(181)
expressionOut.print(loc31?.basicPay)
printHtmlPart(182)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(278)
loop:{
int l = 0
for( loc in (formDetailInstance?.sp) ) {
printHtmlPart(130)
if(true && (loc?.particulars || loc?.titlesPapers || loc?.publisher  || loc?.types || loc?.detailsss != null)) {
printHtmlPart(184)
expressionOut.print(loc?.particulars)
printHtmlPart(279)
expressionOut.print(loc?.titlesPapers)
printHtmlPart(280)
expressionOut.print(loc?.publisher)
printHtmlPart(281)
expressionOut.print(loc?.types)
printHtmlPart(282)
expressionOut.print(loc?.detailsss)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(283)
loop:{
int l = 0
for( loc111 in (formDetailInstance?.specialAwards2) ) {
printHtmlPart(130)
if(true && (loc111?.particularsAwards || loc111?.noofAwards || loc111.awardsYear || loc111?.awardedfor != null)) {
printHtmlPart(184)
expressionOut.print(loc111?.particularsAwards)
printHtmlPart(185)
expressionOut.print(loc111?.noofAwards)
printHtmlPart(186)
expressionOut.print(loc111.awardsYear)
printHtmlPart(187)
expressionOut.print(loc111?.awardedfor)
printHtmlPart(151)
}
printHtmlPart(152)
l++
}
}
printHtmlPart(284)
if(true && (formDetailInstance?.picture?.id != null)) {
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(201)
}
printHtmlPart(196)
if(true && (formDetailInstance?.signature?.id != null)) {
printHtmlPart(197)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(198)
}
printHtmlPart(199)
if(true && (formDetailInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(200)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(201)
}
printHtmlPart(196)
if(true && (formDetailInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(202)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(203)
}
printHtmlPart(204)
if(true && (formDetailInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(205)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(201)
}
printHtmlPart(206)
if(true && (formDetailInstance?.ugPDC?.id != null)) {
printHtmlPart(207)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(195)
}
printHtmlPart(208)
if(true && (formDetailInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(209)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(203)
}
printHtmlPart(210)
if(true && (formDetailInstance?.pgPDC?.id != null)) {
printHtmlPart(211)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(203)
}
printHtmlPart(212)
if(true && (formDetailInstance?.phDCertificate?.id != null)) {
printHtmlPart(213)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(195)
}
printHtmlPart(206)
if(true && (formDetailInstance?.phdPDc?.id != null)) {
printHtmlPart(214)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(195)
}
printHtmlPart(215)
if(true && (formDetailInstance?.nETCertificate?.id != null)) {
printHtmlPart(216)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(285)
}
printHtmlPart(217)
if(true && (formDetailInstance?.experienceCertificate?.id != null)) {
printHtmlPart(218)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(285)
}
printHtmlPart(219)
if(true && (formDetailInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(220)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(195)
}
printHtmlPart(196)
if(true && (formDetailInstance?.ruralCertificate?.id != null)) {
printHtmlPart(221)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(285)
}
printHtmlPart(204)
if(true && (formDetailInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(222)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(195)
}
printHtmlPart(223)
if(true && (formDetailInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(224)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(285)
}
printHtmlPart(286)
if(true && (formDetailInstance?.kpsckannadaCertificate?.id != null)) {
printHtmlPart(226)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(287)
if(true && (formDetailInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(227)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(195)
}
printHtmlPart(196)
if(true && (formDetailInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(228)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(203)
}
printHtmlPart(204)
if(true && (formDetailInstance?.kVCCertificate?.id != null)) {
printHtmlPart(288)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(201)
}
printHtmlPart(206)
if(true && (formDetailInstance?.kvc2?.id != null)) {
printHtmlPart(289)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(201)
}
printHtmlPart(290)
if(true && (formDetailInstance?.uploade1?.id != null)) {
printHtmlPart(291)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade1?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade1?.id))
printHtmlPart(201)
}
printHtmlPart(196)
if(true && (formDetailInstance?.uploade2?.id != null)) {
printHtmlPart(292)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade2?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade2?.id))
printHtmlPart(293)
}
printHtmlPart(196)
if(true && (formDetailInstance?.uploade3?.id != null)) {
printHtmlPart(294)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade3?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade3?.id))
printHtmlPart(295)
}
printHtmlPart(196)
if(true && (formDetailInstance?.uploade4?.id != null)) {
printHtmlPart(296)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade4?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade4?.id))
printHtmlPart(297)
}
printHtmlPart(204)
if(true && (formDetailInstance?.uploade5?.id != null)) {
printHtmlPart(298)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade5?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade5?.id))
printHtmlPart(295)
}
printHtmlPart(196)
if(true && (formDetailInstance?.uploade6?.id != null)) {
printHtmlPart(299)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade6?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade6?.id))
printHtmlPart(297)
}
printHtmlPart(300)
if(true && (formDetailInstance?.uploade7?.id != null)) {
printHtmlPart(301)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade7?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade7?.id))
printHtmlPart(295)
}
printHtmlPart(116)
if(true && (formDetailInstance?.uploade8?.id != null)) {
printHtmlPart(302)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade8?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade8?.id))
printHtmlPart(297)
}
printHtmlPart(287)
if(true && (formDetailInstance?.uploade9?.id != null)) {
printHtmlPart(303)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade9?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade9?.id))
printHtmlPart(295)
}
printHtmlPart(196)
if(true && (formDetailInstance?.uploade10?.id != null)) {
printHtmlPart(232)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(203)
}
printHtmlPart(233)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(116)
createTagBody(4, {->
printHtmlPart(304)
createTagBody(5, {->
printHtmlPart(300)
invokeTag('message','g',3371,['code':("default.button.Pay Now.label"),'default':("Pay Now")],-1)
printHtmlPart(223)
})
invokeTag('link','g',3372,['class':("btn yellow"),'action':("makePayment"),'resource':(formDetailInstance)],5)
printHtmlPart(305)
})
invokeTag('form','g',3374,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(116)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(141, 4)
invokeTag('link','g',3376,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(142)
}
printHtmlPart(189)
i++
}
}
printHtmlPart(306)
})
invokeTag('captureBody','sitemesh',3457,['class':("page-container-bg-solid")],1)
printHtmlPart(307)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768252124L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
