package factory

class SmsNotification : Notification {
    override fun notifyUser() {
        println("SMS Notification created")
    }
}