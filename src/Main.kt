import adapter1.FileAdapter
import adapter1.FileReaderImpl
import adapter1.JsonFileReaderImpl
import proxy.Client
import proxy.HTTPSRequest
import proxy.MainServer
import proxy.ProxyServer
import proxy.enums.ClientAction

fun main() {
    println("Hello World!")
    proxy()
//    adapter()
}


fun adapter(){
    val adapter : FileAdapter = FileAdapter(fileReader = FileReaderImpl(), jsonFileReader = JsonFileReaderImpl() )
//    adapter.getSize("Hello World")
    println(adapter.getSize("src/file.txt"))
}

fun proxy(){
    val client: Client = Client(
        server = ProxyServer(server = MainServer()),
        request = HTTPSRequest(
            method = "GET",  // Replace with the appropriate HTTP method
            url = "https://example.com",  // Replace with the actual URL
            headers = hashMapOf("Content-Type" to "application/json"),  // Add necessary headers
            params = hashMapOf("query" to "value")  // Add necessary query parameters
        )
    )
    print(client.makeRequest(ClientAction.RUN))
}