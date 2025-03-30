package observer

class NewsChannel: Channel {
    private var news : String = "News"
    override fun update(news : String) {
        this.news = news
        println("NewsChannel received news update: $news")
    }
}