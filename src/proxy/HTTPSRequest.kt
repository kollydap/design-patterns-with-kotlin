package proxy

class HTTPSRequest(
    override val method: String,
    override val url: String,
    override val headers: HashMap<String, String>,
    override val params: HashMap<String, String>
) : IRequest {

}