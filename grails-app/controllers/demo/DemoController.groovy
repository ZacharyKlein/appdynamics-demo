package demo

import groovy.util.logging.Slf4j
import groovyx.gpars.GParsPool

@Slf4j
class DemoController {

    DemoService demoService
    WidgetService widgetService

    def index() {
        demoService.doWork()
        render widgetService.listWidgets()
    }
}
