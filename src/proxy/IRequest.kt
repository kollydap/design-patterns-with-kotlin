package proxy

interface IRequest {
    val method: String
    val url: String
    val headers: HashMap<String, String>
    val params: HashMap<String, String>
}