package my.webapp

class SummaryTaglibTagLib {

    static defaultEncodeAs = 'none'
    static namespace = 'summary'

    Closure section = { attrs, body ->
        String template = attrs.template

        out << g.render(template: template)
    }

}
