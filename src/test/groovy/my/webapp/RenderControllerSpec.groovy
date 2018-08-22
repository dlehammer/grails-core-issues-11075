package my.webapp

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class RenderControllerSpec extends Specification implements ControllerUnitTest<RenderController> {

    def setup() {
        mockTagLibs(SummaryTaglibTagLib)
    }

    def cleanup() {
    }

    /**
     * Fails with:
     * <p>
     * GrailsTagException: [views/some/_temp.gsp:1] [views/other/_summary.gsp:1] Template not found for name [participant] and path [/other/_participant.gsp]
     */
    void "test index"() {
        when:
        controller.index()

        then:
        controller.response.text == '''Hello world,

Best regards,

participant

'''
    }
}
