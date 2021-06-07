package demo

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class WidgetServiceSpec extends Specification implements ServiceUnitTest<WidgetService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
