package proxy

import proxy.enums.ClientAction

class Client(private val server: IServer, private val request: IRequest) {

    fun makeRequest(action: ClientAction): String {
        return when (action) {
            ClientAction.RUN -> (server.run(request)).toString()
            ClientAction.DESTROY -> (server.destroy(request)).toString()
            ClientAction.PROCESS -> server.process(request).toString()
            else -> "Wrong action $action"
        }
    }
}
