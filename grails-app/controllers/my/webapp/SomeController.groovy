package my.webapp

import grails.gsp.PageRenderer
import org.grails.web.util.GrailsApplicationAttributes
import org.springframework.beans.factory.annotation.Autowired

class SomeController {

    @Autowired
    PageRenderer pageRenderer

    /**
     * Symptom discovered during Grails 2 -> 3 migration
     */
    def index() {
        // force controller-name: some -> other
        request.setAttribute(GrailsApplicationAttributes.CONTROLLER_NAME_ATTRIBUTE,'other')

//        String result = g.render(template: "/some/temp", model: [targetControllerName: 'other']) // Grails 2 syntax
        String result = pageRenderer.render(template: "/some/temp", model: [targetControllerName: 'other'])
        return result
    }
}
