package demo

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class LoggingServiceSpec extends Specification implements ServiceUnitTest<LoggingService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
