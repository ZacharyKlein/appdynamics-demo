package demo

import grails.gorm.transactions.Transactional

@Transactional
class WidgetService {

    def listWidgets() {
        Widget.list()
    }
}
