package factory

class EmailNotification : Notification {
    override fun notifyUser() {
        println("Email Notification created")
    }
}