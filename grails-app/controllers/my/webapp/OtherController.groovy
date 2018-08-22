package my.webapp

class OtherController {

    /**
     * Reference: works both during unit-test and runtime
     */
    def index() {
        render template: 'summary'
    }
}
