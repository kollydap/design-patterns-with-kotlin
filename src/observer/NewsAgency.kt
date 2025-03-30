package observer


class NewsAgency {
    private val channels : MutableList <Channel> = mutableListOf()
    private var latestNews : String = ""
    fun add (channel : Channel) {
        this.channels.add(channel)
    }
    fun remove(channel : Channel) {
        this.channels.remove(channel)
    }

    fun setNews(news : String) {
      this.latestNews = news
        broadcastNews()

    }
    private fun broadcastNews() {
        for (channel in channels) {
            channel.update(latestNews)
        }
    }


}