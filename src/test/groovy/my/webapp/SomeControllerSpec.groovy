package my.webapp

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class SomeControllerSpec extends Specification implements ControllerUnitTest<SomeController> {

    def setup() {
        mockTagLibs(SummaryTaglibTagLib)
    }

    def cleanup() {
    }

    /**
     * Fails with:
     * <p>
     * NoSuchBeanDefinitionException: No qualifying bean of type 'grails.gsp.PageRenderer' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired ( r e q u i r e d = t r u e )}
     *
     * As I've been unable to setup the required dependency in unit-test context.
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
