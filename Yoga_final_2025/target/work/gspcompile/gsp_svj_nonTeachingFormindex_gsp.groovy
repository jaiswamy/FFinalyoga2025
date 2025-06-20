import com.hiideals.jobForm.NonTeachingForm
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_nonTeachingFormindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nonTeachingForm/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',58,[:],1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',157,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',158,['roles':("ROLE_ADMIN")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',164,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',165,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(11)
invokeTag('render','g',170,['template':("/header/topBar")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(i+1)
printHtmlPart(15)
invokeTag('set','g',218,['var':("userssss"),'value':(nonTeachingFormInstance?.experiences1)],-1)
printHtmlPart(16)
invokeTag('set','g',222,['var':("userss"),'value':(nonTeachingFormInstance?.achievements1)],-1)
printHtmlPart(16)
invokeTag('set','g',224,['var':("user"),'value':(nonTeachingFormInstance?.otherDegrees1)],-1)
printHtmlPart(16)
if(true && (nonTeachingFormInstance?.apllicationNo != null && nonTeachingFormInstance?.seven != null  &&  user.size() != 0  && userss.size() != 0 && userssss.size() != 0 &&  nonTeachingFormInstance?.picture != null)) {
printHtmlPart(17)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(18)
createClosureForHtmlPart(19, 5)
invokeTag('link','g',231,['action':("makePayment"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(15)
}
else {
printHtmlPart(20)
createClosureForHtmlPart(21, 5)
invokeTag('link','g',236,['action':("report"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(15)
}
printHtmlPart(22)
}
else {
printHtmlPart(23)
}
printHtmlPart(22)
if(true && (nonTeachingFormInstance?.apllicationNo == null)) {
printHtmlPart(24)
createTagBody(4, {->
printHtmlPart(25)
invokeTag('message','g',251,['code':("default.button.Report Print.label"),'default':("personal Status")],-1)
printHtmlPart(26)
})
invokeTag('link','g',252,['class':("btn "),'action':("create"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(15)
}
else {
printHtmlPart(27)
expressionOut.print(i)
printHtmlPart(28)
}
printHtmlPart(29)
if(true && (nonTeachingFormInstance?.apllicationNo != null)) {
printHtmlPart(16)
if(true && (nonTeachingFormInstance?.seven == null)) {
printHtmlPart(30)
createTagBody(5, {->
printHtmlPart(25)
invokeTag('message','g',276,['code':("default.button.Report Print.label"),'default':("Add Education Details")],-1)
printHtmlPart(26)
})
invokeTag('link','g',277,['class':("btn "),'action':("createEducation"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(31)
}
else {
printHtmlPart(32)
expressionOut.print(i)
printHtmlPart(28)
}
printHtmlPart(16)
}
printHtmlPart(33)
if(true && (nonTeachingFormInstance?.apllicationNo != null && nonTeachingFormInstance?.seven != null)) {
printHtmlPart(22)
invokeTag('set','g',293,['var':("user"),'value':(nonTeachingFormInstance?.otherDegrees1)],-1)
printHtmlPart(34)
if(true && (user.size() == 0)) {
printHtmlPart(35)
createTagBody(5, {->
printHtmlPart(36)
invokeTag('message','g',303,['code':("default.button.Report Print.label"),'default':("Add Additional Details")],-1)
printHtmlPart(26)
})
invokeTag('link','g',304,['class':("btn "),'action':("createAdditional"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(37)
}
else {
printHtmlPart(38)
expressionOut.print(i)
printHtmlPart(39)
}
printHtmlPart(15)
}
else {
printHtmlPart(40)
}
printHtmlPart(41)
if(true && (nonTeachingFormInstance?.apllicationNo != null && nonTeachingFormInstance?.seven != null  &&  user.size() != 0)) {
printHtmlPart(22)
invokeTag('set','g',326,['var':("userss"),'value':(nonTeachingFormInstance?.achievements1)],-1)
printHtmlPart(42)
if(true && (userss.size() == 0)) {
printHtmlPart(35)
createTagBody(5, {->
printHtmlPart(36)
invokeTag('message','g',335,['code':("default.button.Report Print.label"),'default':("Add Achievements Details")],-1)
printHtmlPart(26)
})
invokeTag('link','g',336,['class':("btn "),'action':("createAchievements"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(37)
}
else {
printHtmlPart(43)
expressionOut.print(i)
printHtmlPart(44)
}
printHtmlPart(45)
}
else {
printHtmlPart(40)
}
printHtmlPart(46)
if(true && (nonTeachingFormInstance?.apllicationNo != null && nonTeachingFormInstance?.seven != null  &&  user.size() != 0  && userss.size() != 0)) {
printHtmlPart(22)
invokeTag('set','g',359,['var':("userssss"),'value':(nonTeachingFormInstance?.experiences1)],-1)
printHtmlPart(42)
if(true && (userssss.size() == 0)) {
printHtmlPart(35)
createTagBody(5, {->
printHtmlPart(36)
invokeTag('message','g',368,['code':("default.button.Report Print.label"),'default':("Add Experience Details")],-1)
printHtmlPart(26)
})
invokeTag('link','g',369,['class':("btn "),'action':("createExperience"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(37)
}
else {
printHtmlPart(47)
expressionOut.print(i)
printHtmlPart(44)
}
printHtmlPart(45)
}
else {
printHtmlPart(40)
}
printHtmlPart(48)
if(true && (nonTeachingFormInstance?.apllicationNo != null && nonTeachingFormInstance?.seven != null  &&  user.size() != 0  && userss.size() != 0 && userssss.size() != 0)) {
printHtmlPart(49)
if(true && (nonTeachingFormInstance?.picture == null)) {
printHtmlPart(50)
createTagBody(5, {->
printHtmlPart(36)
invokeTag('message','g',401,['code':("default.button.Report Print.label"),'default':("Add Documents ")],-1)
printHtmlPart(26)
})
invokeTag('link','g',402,['class':("btn "),'action':("createDocuments"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(51)
}
else {
printHtmlPart(52)
expressionOut.print(i)
printHtmlPart(28)
}
printHtmlPart(53)
}
else {
printHtmlPart(40)
}
printHtmlPart(54)
if(true && (nonTeachingFormInstance?.apllicationNo != null && nonTeachingFormInstance?.seven != null  &&  user.size() != 0  && userss.size() != 0 && userssss.size() != 0 &&  nonTeachingFormInstance?.picture != null)) {
printHtmlPart(55)
createTagBody(4, {->
printHtmlPart(16)
invokeTag('hiddenField','g',432,['name':("userListid"),'value':(nonTeachingFormInstance?.id)],-1)
printHtmlPart(56)
createTagBody(5, {->
printHtmlPart(16)
createTagBody(6, {->
printHtmlPart(57)
invokeTag('message','g',437,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(58)
})
invokeTag('link','g',438,['class':("btn btn-transparent yellow btn-outline btn-circle btn-sm active"),'action':("edit"),'resource':(nonTeachingFormInstance)],6)
printHtmlPart(58)
})
invokeTag('ifAnyGranted','sec',439,['roles':("ROLE_ADMIN")],5)
printHtmlPart(59)
createTagBody(5, {->
printHtmlPart(25)
invokeTag('message','g',445,['code':("default.button.Report Print.label"),'default':("Application Status")],-1)
printHtmlPart(26)
})
invokeTag('link','g',446,['class':("btn btn-transparent green btn-outline btn-circle btn-sm active"),'action':("report"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(60)
expressionOut.print(i)
printHtmlPart(61)
invokeTag('message','g',451,['code':("default.button.show.label"),'default':("Details of the Application")],-1)
printHtmlPart(62)
})
invokeTag('formRemote','g',453,['name':("kk"),'url':([action:'adminEdit']),'update':("update1")],4)
printHtmlPart(63)
}
else {
printHtmlPart(23)
}
printHtmlPart(64)
i++
}
}
printHtmlPart(65)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(66)
expressionOut.print(i)
printHtmlPart(67)
expressionOut.print(nonTeachingFormInstance?.apllicationNo)
printHtmlPart(68)
expressionOut.print(nonTeachingFormInstance?.appliyingPost)
printHtmlPart(69)
expressionOut.print(nonTeachingFormInstance?.firstName)
printHtmlPart(70)
expressionOut.print(nonTeachingFormInstance?.lastName)
printHtmlPart(71)
expressionOut.print(nonTeachingFormInstance?.fName)
printHtmlPart(72)
expressionOut.print(nonTeachingFormInstance?.mName)
printHtmlPart(73)
expressionOut.print(nonTeachingFormInstance?.gender)
printHtmlPart(74)
invokeTag('formatDate','g',539,['date':(nonTeachingFormInstance.dob),'format':("dd-MM-yyyy")],-1)
printHtmlPart(75)
expressionOut.print(nonTeachingFormInstance?.email)
printHtmlPart(76)
expressionOut.print(nonTeachingFormInstance?.phoneNumber)
printHtmlPart(77)
expressionOut.print(nonTeachingFormInstance?.hNo)
printHtmlPart(78)
expressionOut.print(nonTeachingFormInstance?.street)
printHtmlPart(79)
expressionOut.print(nonTeachingFormInstance?.village)
printHtmlPart(80)
expressionOut.print(nonTeachingFormInstance?.taluka)
printHtmlPart(81)
expressionOut.print(nonTeachingFormInstance?.district)
printHtmlPart(82)
expressionOut.print(nonTeachingFormInstance?.state)
printHtmlPart(83)
expressionOut.print(nonTeachingFormInstance?.pinCode)
printHtmlPart(84)
expressionOut.print(nonTeachingFormInstance?.country)
printHtmlPart(85)
expressionOut.print(nonTeachingFormInstance?.socialcategory)
printHtmlPart(86)
expressionOut.print(nonTeachingFormInstance?.subcast)
printHtmlPart(87)
expressionOut.print(nonTeachingFormInstance?.religion)
printHtmlPart(88)
expressionOut.print(nonTeachingFormInstance?.woman)
printHtmlPart(89)
expressionOut.print(nonTeachingFormInstance?.ruralstdy)
printHtmlPart(90)
expressionOut.print(nonTeachingFormInstance?.exServiceMan)
printHtmlPart(91)
expressionOut.print(nonTeachingFormInstance?.kannadaMedium)
printHtmlPart(92)
expressionOut.print(nonTeachingFormInstance?.projectDisplacedPerson)
printHtmlPart(93)
expressionOut.print(nonTeachingFormInstance?.j371)
printHtmlPart(94)
expressionOut.print(nonTeachingFormInstance?.pwd)
printHtmlPart(95)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('form','g',687,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(96)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',697,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(99)
}
printHtmlPart(100)
i++
}
}
printHtmlPart(101)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(102)
expressionOut.print(i)
printHtmlPart(103)
if(true && (nonTeachingFormInstance?.seven != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.seven)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.obtainedseven != "")) {
printHtmlPart(106)
expressionOut.print(nonTeachingFormInstance?.obtainedseven)
printHtmlPart(105)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.maximumseven != "")) {
printHtmlPart(108)
expressionOut.print(nonTeachingFormInstance?.maximumseven)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.percentageseven != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentageseven)
printHtmlPart(110)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.sevenyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',788,['date':(nonTeachingFormInstance.sevenyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.boardUniversityseven != "")) {
printHtmlPart(113)
expressionOut.print(nonTeachingFormInstance?.boardUniversityseven)
printHtmlPart(105)
}
printHtmlPart(114)
if(true && (nonTeachingFormInstance?.sslc != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.sslc)
printHtmlPart(105)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.obtainedsslc != "")) {
printHtmlPart(106)
expressionOut.print(nonTeachingFormInstance?.obtainedsslc)
printHtmlPart(105)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.maximumsslc != "")) {
printHtmlPart(108)
expressionOut.print(nonTeachingFormInstance?.maximumsslc)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.percentagesslc != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentagesslc)
printHtmlPart(110)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.sslcyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',843,['date':(nonTeachingFormInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(57)
if(true && (nonTeachingFormInstance?.boardUniversitysslc != "")) {
printHtmlPart(116)
expressionOut.print(nonTeachingFormInstance?.boardUniversitysslc)
printHtmlPart(117)
}
printHtmlPart(118)
if(true && (nonTeachingFormInstance?.puc != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.puc)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.obtainedpuc != "")) {
printHtmlPart(106)
expressionOut.print(nonTeachingFormInstance?.obtainedpuc)
printHtmlPart(105)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.maximumpuc != "")) {
printHtmlPart(108)
expressionOut.print(nonTeachingFormInstance?.maximumpuc)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.percentagepuc != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentagepuc)
printHtmlPart(110)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.pucyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',898,['date':(nonTeachingFormInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(58)
if(true && (nonTeachingFormInstance?.boardUniversitypuc != "")) {
printHtmlPart(116)
expressionOut.print(nonTeachingFormInstance?.boardUniversitypuc)
printHtmlPart(105)
}
printHtmlPart(119)
if(true && (nonTeachingFormInstance?.degreeNameBachelors != "")) {
printHtmlPart(120)
expressionOut.print(nonTeachingFormInstance?.degreeNameBachelors)
printHtmlPart(105)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.bachelorsDegree != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.bachelorsDegree)
printHtmlPart(105)
}
printHtmlPart(121)
if(true && (nonTeachingFormInstance?.percentagebachelorsDegree != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentagebachelorsDegree)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance.bachelorsDegreeyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',947,['date':(nonTeachingFormInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(121)
if(true && (nonTeachingFormInstance?.boardUniversitybachelorsDegree != "")) {
printHtmlPart(122)
expressionOut.print(nonTeachingFormInstance?.boardUniversitybachelorsDegree)
printHtmlPart(105)
}
printHtmlPart(123)
if(true && (nonTeachingFormInstance?.subjectMaster != "")) {
printHtmlPart(124)
expressionOut.print(nonTeachingFormInstance?.subjectMaster)
printHtmlPart(125)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.mastersDegree != "")) {
printHtmlPart(126)
expressionOut.print(nonTeachingFormInstance?.mastersDegree)
printHtmlPart(125)
}
printHtmlPart(127)
if(true && (nonTeachingFormInstance?.percentagemastersDegree != "")) {
printHtmlPart(128)
expressionOut.print(nonTeachingFormInstance?.percentagemastersDegree)
printHtmlPart(125)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance.mastersDegreeyear != null)) {
printHtmlPart(129)
invokeTag('formatDate','g',999,['date':(nonTeachingFormInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(130)
}
printHtmlPart(127)
if(true && (nonTeachingFormInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(131)
expressionOut.print(nonTeachingFormInstance?.boardUniversitymastersDegree)
printHtmlPart(125)
}
printHtmlPart(132)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('form','g',1025,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(96)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',1029,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(99)
}
printHtmlPart(100)
i++
}
}
printHtmlPart(133)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(134)
expressionOut.print(i)
printHtmlPart(135)
loop:{
int l = 0
for( loc11 in (nonTeachingFormInstance?.otherDegrees1) ) {
printHtmlPart(136)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(137)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(138)
expressionOut.print(loc11?.additionalType)
printHtmlPart(139)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(140)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(141)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(142)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(143)
}
printHtmlPart(144)
l++
}
}
printHtmlPart(145)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('form','g',1133,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(96)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',1137,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(99)
}
printHtmlPart(100)
i++
}
}
printHtmlPart(146)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(147)
expressionOut.print(i)
printHtmlPart(148)
loop:{
int l = 0
for( loc221 in (nonTeachingFormInstance?.achievements1) ) {
printHtmlPart(136)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(149)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(150)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(151)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(152)
expressionOut.print(loc221?.level)
printHtmlPart(153)
}
printHtmlPart(154)
l++
}
}
printHtmlPart(155)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('form','g',1226,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(96)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',1230,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(99)
}
printHtmlPart(100)
i++
}
}
printHtmlPart(156)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(157)
expressionOut.print(i)
printHtmlPart(158)
loop:{
int l = 0
for( loc31 in (nonTeachingFormInstance?.experiences1) ) {
printHtmlPart(136)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(159)
expressionOut.print(loc31?.workExperience)
printHtmlPart(160)
expressionOut.print(loc31?.companyName)
printHtmlPart(161)
expressionOut.print(loc31?.postHeld)
printHtmlPart(162)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(163)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(164)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(165)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(166)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(167)
expressionOut.print(loc31?.basicPay)
printHtmlPart(168)
}
printHtmlPart(154)
l++
}
}
printHtmlPart(169)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('form','g',1343,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(96)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',1349,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(99)
}
printHtmlPart(100)
i++
}
}
printHtmlPart(170)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(171)
expressionOut.print(i)
printHtmlPart(172)
if(true && (nonTeachingFormInstance?.picture?.id != null)) {
printHtmlPart(173)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.picture?.id))
printHtmlPart(174)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.signature?.id != null)) {
printHtmlPart(175)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.signature?.id))
printHtmlPart(176)
}
printHtmlPart(177)
if(true && (nonTeachingFormInstance?.sevemMarksSheet?.id != null)) {
printHtmlPart(178)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.sevemMarksSheet?.id))
printHtmlPart(179)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(180)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.sslcMarksSheet?.id))
printHtmlPart(179)
}
printHtmlPart(181)
if(true && (nonTeachingFormInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(182)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.pucMarksSheet?.id))
printHtmlPart(183)
}
printHtmlPart(184)
if(true && (nonTeachingFormInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(185)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.bachelorsMarksSheet?.id))
printHtmlPart(179)
}
printHtmlPart(186)
if(true && (nonTeachingFormInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(187)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.masterMarksSheet?.id))
printHtmlPart(188)
}
printHtmlPart(189)
if(true && (nonTeachingFormInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(190)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.casteIncomeCertificate?.id))
printHtmlPart(179)
}
printHtmlPart(191)
if(true && (nonTeachingFormInstance?.ruralCertificate?.id != null)) {
printHtmlPart(192)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.ruralCertificate?.id))
printHtmlPart(188)
}
printHtmlPart(193)
if(true && (nonTeachingFormInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(194)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.exServicemenCertificate?.id))
printHtmlPart(179)
}
printHtmlPart(195)
if(true && (nonTeachingFormInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(196)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.kannadaMediumCertificate?.id))
printHtmlPart(188)
}
printHtmlPart(197)
if(true && (nonTeachingFormInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(198)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(199)
}
printHtmlPart(186)
if(true && (nonTeachingFormInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(200)
expressionOut.print(createLink(controller:'nonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(188)
}
printHtmlPart(201)
if(true && (nonTeachingFormInstance?.experienceCertificate?.id != null)) {
printHtmlPart(202)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.experienceCertificate?.id))
printHtmlPart(203)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.experienceCertificate?.id))
printHtmlPart(204)
}
printHtmlPart(205)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('form','g',1593,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(96)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',1597,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(99)
}
printHtmlPart(100)
i++
}
}
printHtmlPart(206)
loop:{
int i = 0
for( nonTeachingFormInstance in (formdet?.reverse()) ) {
printHtmlPart(207)
expressionOut.print(i)
printHtmlPart(208)
expressionOut.print(nonTeachingFormInstance?.apllicationNo)
printHtmlPart(68)
expressionOut.print(nonTeachingFormInstance?.appliyingPost)
printHtmlPart(69)
expressionOut.print(nonTeachingFormInstance?.firstName)
printHtmlPart(70)
expressionOut.print(nonTeachingFormInstance?.lastName)
printHtmlPart(71)
expressionOut.print(nonTeachingFormInstance?.fName)
printHtmlPart(72)
expressionOut.print(nonTeachingFormInstance?.mName)
printHtmlPart(73)
expressionOut.print(nonTeachingFormInstance?.gender)
printHtmlPart(74)
invokeTag('formatDate','g',1682,['date':(nonTeachingFormInstance.dob),'format':("dd-MM-yyyy")],-1)
printHtmlPart(75)
expressionOut.print(nonTeachingFormInstance?.email)
printHtmlPart(76)
expressionOut.print(nonTeachingFormInstance?.phoneNumber)
printHtmlPart(77)
expressionOut.print(nonTeachingFormInstance?.hNo)
printHtmlPart(78)
expressionOut.print(nonTeachingFormInstance?.street)
printHtmlPart(79)
expressionOut.print(nonTeachingFormInstance?.village)
printHtmlPart(80)
expressionOut.print(nonTeachingFormInstance?.taluka)
printHtmlPart(81)
expressionOut.print(nonTeachingFormInstance?.district)
printHtmlPart(82)
expressionOut.print(nonTeachingFormInstance?.state)
printHtmlPart(83)
expressionOut.print(nonTeachingFormInstance?.pinCode)
printHtmlPart(84)
expressionOut.print(nonTeachingFormInstance?.country)
printHtmlPart(85)
expressionOut.print(nonTeachingFormInstance?.socialcategory)
printHtmlPart(86)
expressionOut.print(nonTeachingFormInstance?.subcast)
printHtmlPart(87)
expressionOut.print(nonTeachingFormInstance?.religion)
printHtmlPart(209)
expressionOut.print(nonTeachingFormInstance?.woman)
printHtmlPart(89)
expressionOut.print(nonTeachingFormInstance?.ruralstdy)
printHtmlPart(90)
expressionOut.print(nonTeachingFormInstance?.exServiceMan)
printHtmlPart(91)
expressionOut.print(nonTeachingFormInstance?.kannadaMedium)
printHtmlPart(92)
expressionOut.print(nonTeachingFormInstance?.projectDisplacedPerson)
printHtmlPart(93)
expressionOut.print(nonTeachingFormInstance?.j371)
printHtmlPart(94)
expressionOut.print(nonTeachingFormInstance?.pwd)
printHtmlPart(210)
if(true && (nonTeachingFormInstance?.seven != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.seven)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.obtainedseven != "")) {
printHtmlPart(106)
expressionOut.print(nonTeachingFormInstance?.obtainedseven)
printHtmlPart(105)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.maximumseven != "")) {
printHtmlPart(108)
expressionOut.print(nonTeachingFormInstance?.maximumseven)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.percentageseven != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentageseven)
printHtmlPart(110)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.sevenyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',1866,['date':(nonTeachingFormInstance.sevenyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.boardUniversityseven != "")) {
printHtmlPart(113)
expressionOut.print(nonTeachingFormInstance?.boardUniversityseven)
printHtmlPart(105)
}
printHtmlPart(114)
if(true && (nonTeachingFormInstance?.sslc != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.sslc)
printHtmlPart(105)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.obtainedsslc != "")) {
printHtmlPart(106)
expressionOut.print(nonTeachingFormInstance?.obtainedsslc)
printHtmlPart(105)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.maximumsslc != "")) {
printHtmlPart(108)
expressionOut.print(nonTeachingFormInstance?.maximumsslc)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.percentagesslc != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentagesslc)
printHtmlPart(110)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.sslcyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',1923,['date':(nonTeachingFormInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(57)
if(true && (nonTeachingFormInstance?.boardUniversitysslc != "")) {
printHtmlPart(116)
expressionOut.print(nonTeachingFormInstance?.boardUniversitysslc)
printHtmlPart(117)
}
printHtmlPart(118)
if(true && (nonTeachingFormInstance?.puc != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.puc)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.obtainedpuc != "")) {
printHtmlPart(106)
expressionOut.print(nonTeachingFormInstance?.obtainedpuc)
printHtmlPart(105)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.maximumpuc != "")) {
printHtmlPart(108)
expressionOut.print(nonTeachingFormInstance?.maximumpuc)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.percentagepuc != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentagepuc)
printHtmlPart(110)
}
printHtmlPart(107)
if(true && (nonTeachingFormInstance?.pucyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',1979,['date':(nonTeachingFormInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(58)
if(true && (nonTeachingFormInstance?.boardUniversitypuc != "")) {
printHtmlPart(116)
expressionOut.print(nonTeachingFormInstance?.boardUniversitypuc)
printHtmlPart(105)
}
printHtmlPart(119)
if(true && (nonTeachingFormInstance?.degreeNameBachelors != "")) {
printHtmlPart(120)
expressionOut.print(nonTeachingFormInstance?.degreeNameBachelors)
printHtmlPart(105)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.bachelorsDegree != "")) {
printHtmlPart(104)
expressionOut.print(nonTeachingFormInstance?.bachelorsDegree)
printHtmlPart(105)
}
printHtmlPart(121)
if(true && (nonTeachingFormInstance?.percentagebachelorsDegree != "")) {
printHtmlPart(109)
expressionOut.print(nonTeachingFormInstance?.percentagebachelorsDegree)
printHtmlPart(105)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance.bachelorsDegreeyear != null)) {
printHtmlPart(111)
invokeTag('formatDate','g',2029,['date':(nonTeachingFormInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(112)
}
printHtmlPart(121)
if(true && (nonTeachingFormInstance?.boardUniversitybachelorsDegree != "")) {
printHtmlPart(122)
expressionOut.print(nonTeachingFormInstance?.boardUniversitybachelorsDegree)
printHtmlPart(105)
}
printHtmlPart(211)
if(true && (nonTeachingFormInstance?.subjectMaster != "")) {
printHtmlPart(124)
expressionOut.print(nonTeachingFormInstance?.subjectMaster)
printHtmlPart(125)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance?.mastersDegree != "")) {
printHtmlPart(126)
expressionOut.print(nonTeachingFormInstance?.mastersDegree)
printHtmlPart(125)
}
printHtmlPart(127)
if(true && (nonTeachingFormInstance?.percentagemastersDegree != "")) {
printHtmlPart(128)
expressionOut.print(nonTeachingFormInstance?.percentagemastersDegree)
printHtmlPart(125)
}
printHtmlPart(96)
if(true && (nonTeachingFormInstance.mastersDegreeyear != null)) {
printHtmlPart(212)
invokeTag('formatDate','g',2082,['date':(nonTeachingFormInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(130)
}
printHtmlPart(127)
if(true && (nonTeachingFormInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(131)
expressionOut.print(nonTeachingFormInstance?.boardUniversitymastersDegree)
printHtmlPart(125)
}
printHtmlPart(213)
loop:{
int l = 0
for( loc11 in (nonTeachingFormInstance?.otherDegrees1) ) {
printHtmlPart(136)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(137)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(138)
expressionOut.print(loc11?.additionalType)
printHtmlPart(139)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(140)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(141)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(142)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(143)
}
printHtmlPart(144)
l++
}
}
printHtmlPart(214)
loop:{
int l = 0
for( loc221 in (nonTeachingFormInstance?.achievements1) ) {
printHtmlPart(136)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(149)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(150)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(151)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(152)
expressionOut.print(loc221?.level)
printHtmlPart(153)
}
printHtmlPart(154)
l++
}
}
printHtmlPart(215)
loop:{
int l = 0
for( loc31 in (nonTeachingFormInstance?.experiences1) ) {
printHtmlPart(136)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(159)
expressionOut.print(loc31?.workExperience)
printHtmlPart(160)
expressionOut.print(loc31?.companyName)
printHtmlPart(161)
expressionOut.print(loc31?.postHeld)
printHtmlPart(162)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(163)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(164)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(165)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(166)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(167)
expressionOut.print(loc31?.basicPay)
printHtmlPart(168)
}
printHtmlPart(154)
l++
}
}
printHtmlPart(216)
if(true && (nonTeachingFormInstance?.picture?.id != null)) {
printHtmlPart(173)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.picture?.id))
printHtmlPart(217)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.signature?.id != null)) {
printHtmlPart(175)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.signature?.id))
printHtmlPart(218)
}
printHtmlPart(177)
if(true && (nonTeachingFormInstance?.sevemMarksSheet?.id != null)) {
printHtmlPart(178)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.sevemMarksSheet?.id))
printHtmlPart(219)
}
printHtmlPart(115)
if(true && (nonTeachingFormInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(180)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.sslcMarksSheet?.id))
printHtmlPart(219)
}
printHtmlPart(181)
if(true && (nonTeachingFormInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(182)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.pucMarksSheet?.id))
printHtmlPart(220)
}
printHtmlPart(184)
if(true && (nonTeachingFormInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(185)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.bachelorsMarksSheet?.id))
printHtmlPart(221)
}
printHtmlPart(186)
if(true && (nonTeachingFormInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(187)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.masterMarksSheet?.id))
printHtmlPart(222)
}
printHtmlPart(189)
if(true && (nonTeachingFormInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(190)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.casteIncomeCertificate?.id))
printHtmlPart(221)
}
printHtmlPart(191)
if(true && (nonTeachingFormInstance?.ruralCertificate?.id != null)) {
printHtmlPart(192)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.ruralCertificate?.id))
printHtmlPart(222)
}
printHtmlPart(193)
if(true && (nonTeachingFormInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(194)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.exServicemenCertificate?.id))
printHtmlPart(221)
}
printHtmlPart(195)
if(true && (nonTeachingFormInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(196)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.kannadaMediumCertificate?.id))
printHtmlPart(222)
}
printHtmlPart(197)
if(true && (nonTeachingFormInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(198)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(221)
}
printHtmlPart(186)
if(true && (nonTeachingFormInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(200)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:nonTeachingFormInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(222)
}
printHtmlPart(223)
if(true && (nonTeachingFormInstance?.experienceCertificate?.id != null)) {
printHtmlPart(202)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.experienceCertificate?.id))
printHtmlPart(203)
expressionOut.print(createLink(controller:'NonTeachingForm', action:'viewimg', id:nonTeachingFormInstance?.experienceCertificate?.id))
printHtmlPart(204)
}
printHtmlPart(224)
if(true && (nonTeachingFormInstance?.paymentInfoId?.transactionId == null)) {
printHtmlPart(96)
createTagBody(4, {->
printHtmlPart(225)
createTagBody(5, {->
printHtmlPart(57)
invokeTag('message','g',2478,['code':("default.button.Pay Now.label"),'default':("Pay Now")],-1)
printHtmlPart(58)
})
invokeTag('link','g',2478,['class':("btn yellow"),'action':("makePayment"),'resource':(nonTeachingFormInstance)],5)
printHtmlPart(226)
})
invokeTag('form','g',2479,['url':([resource:nonTeachingFormInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(96)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',2484,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(nonTeachingFormInstance)],4)
printHtmlPart(99)
}
printHtmlPart(100)
i++
}
}
printHtmlPart(227)
})
invokeTag('captureBody','sitemesh',2628,['class':("page-container-bg-solid")],1)
printHtmlPart(228)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1672826254000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
