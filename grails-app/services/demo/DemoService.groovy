package demo

import grails.gorm.transactions.Transactional

class DemoService {

    LoggingService loggingService

    def doWork() {
        def range = 1..100000
        range.each { num ->
            loggingService.printLog("Doing work [${num}]...")
        }
    }
}
