package my.webapp

import org.grails.web.util.GrailsApplicationAttributes

class RenderController {

    /**
     * Works runtime, but exposes symptom during unit-test
     */
    def index() {
        // force controller-name: some -> other
        request.setAttribute(GrailsApplicationAttributes.CONTROLLER_NAME_ATTRIBUTE,'other')

//        String result = g.render(template: "/some/temp", model: [targetControllerName: 'other']) // Grails 2 syntax
        String result = render(template: "/some/temp", model: [targetControllerName: 'other'])
        return result
    }
}
