package proxy

class MainServer : IServer {
    override fun run(request: IRequest): IRequest {
        println("Starting server on main server")
        return request
    }

    override fun destroy(request: IRequest) {
        println("Destroying server on main server")
    }

    override fun process(request: IRequest): IRequest {
        println("Starting process on main server")
        return request
    }

}