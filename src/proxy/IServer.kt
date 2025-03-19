package proxy

interface IServer {

    fun run(request : IRequest): IRequest
    fun destroy(request : IRequest)
    fun process(request : IRequest): IRequest
}