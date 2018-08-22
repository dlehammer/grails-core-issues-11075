package my.webapp

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class OtherControllerSpec extends Specification implements ControllerUnitTest<OtherController> {

    def setup() {
        mockTagLibs(SummaryTaglibTagLib)
    }

    def cleanup() {
    }

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
