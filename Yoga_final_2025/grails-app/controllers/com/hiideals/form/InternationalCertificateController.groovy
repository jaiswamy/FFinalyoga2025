package com.hiideals.form



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class InternationalCertificateController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond InternationalCertificate.list(params), model:[internationalCertificateInstanceCount: InternationalCertificate.count()]
    }

    def show(InternationalCertificate internationalCertificateInstance) {
        respond internationalCertificateInstance
    }

    def create() {
        respond new InternationalCertificate(params)
    }
	
	def thankyou() {
	
}
	
	def report(){
		
		def  formdet=InternationalCertificate.findById(params.id)
		model:[formdet:formdet]
	}
	
	@Secured(["ROLE_ADMIN"])
	def adminindex(){
		def  formdet=InternationalCertificate.findAll()
		model:[formdet: formdet]
	}

    @Transactional
    def save(InternationalCertificate internationalCertificateInstance) {
        if (internationalCertificateInstance == null) {
            notFound()
            return
        }

        if (internationalCertificateInstance.hasErrors()) {
            respond internationalCertificateInstance.errors, view:'create'
            return
        }

        internationalCertificateInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'internationalCertificate.label', default: 'InternationalCertificate'), internationalCertificateInstance.id])
                redirect internationalCertificateInstance
            }
            '*' { respond internationalCertificateInstance, [status: CREATED] }
        }
    }

    def edit(InternationalCertificate internationalCertificateInstance) {
        respond internationalCertificateInstance
    }

    @Transactional
    def update(InternationalCertificate internationalCertificateInstance) {
        if (internationalCertificateInstance == null) {
            notFound()
            return
        }

        if (internationalCertificateInstance.hasErrors()) {
            respond internationalCertificateInstance.errors, view:'edit'
            return
        }

        internationalCertificateInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'InternationalCertificate.label', default: 'InternationalCertificate'), internationalCertificateInstance.id])
                redirect internationalCertificateInstance
            }
            '*'{ respond internationalCertificateInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(InternationalCertificate internationalCertificateInstance) {

        if (internationalCertificateInstance == null) {
            notFound()
            return
        }

        internationalCertificateInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'InternationalCertificate.label', default: 'InternationalCertificate'), internationalCertificateInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'internationalCertificate.label', default: 'InternationalCertificate'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
