package factory

class NotificationFactory {
    fun create(notificationType:String): Notification {
        return when (notificationType.lowercase()) {
            "sms" -> SmsNotification()
            "email" -> EmailNotification()
            "push"-> PushNotification()
            else -> throw IllegalArgumentException("Unknown notification type: $notificationType")
        }
    }
}