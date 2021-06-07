package demo

class BootStrap {
    def init = { servletContext ->

        Widget.withTransaction {
            def range = 1..100000
            range.each { num ->
                new Widget(name: "Widget ${num}").save()
            }
        }

    }
    def destroy = {
    }
}
