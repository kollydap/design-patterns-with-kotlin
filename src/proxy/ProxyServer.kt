package proxy

import proxy.enums.RequestMethod

class ProxyServer (private val server: IServer): IServer {
    override fun run(request: IRequest): IRequest {
        if(request.method != RequestMethod.GET.method) {
            println("Request method ${request.method} is not GET method")
            return request
        }
        return server.run(request)
    }

    override fun destroy(request: IRequest) {
        if(request.method != RequestMethod.GET.method) {
            println("Request method ${request.method} is not GET method")
            return
        }
        return server.destroy(request)
    }

    override fun process(request: IRequest): IRequest {
        if(request.method != RequestMethod.GET.method) {
            println("Request method ${request.method} is not GET method")
            return request
        }
        if (request.url == ""){
            return request
        }
        return server.process(request)
    }

}