import adapter1.FileAdapter
import adapter1.FileReaderImpl
import adapter1.JsonFileReaderImpl
import bridge.color.problem.Square
import bridge.color.problem.Triangle
import bridge.vehicle.problem.Bike
import bridge.vehicle.problem.Car
import bridge.vehicle.solution.Assemble
import bridge.vehicle.solution.Produce
import bridge.vehicle.solution.Truck
import bridge.vehicle.solution.Vehicle
import composite.Drawing
import decorator.ExtraCheese
import decorator.Peperoni
import decorator.vehicles.Benz
import decorator.vehicles.MichelinTyres
import proxy.Client
import proxy.HTTPSRequest
import proxy.MainServer
import proxy.ProxyServer
import proxy.enums.ClientAction

fun main() {
    println("Hello World!")
//    proxy()
//    adapter
//    vehicleBridge()
//    colorBridge()
//    composite()
    decorator()
}





fun adapter(){
    val adapter : FileAdapter = FileAdapter(fileReader = FileReaderImpl(), jsonFileReader = JsonFileReaderImpl() )
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
fun vehicleBridge(){

    val bike = Bike()
    bike.manufacture()
    val car = Car()
    car.manufacture()


    val truck = Truck(assembleWorkshop = Assemble(), produceWorkshop = Produce())
    truck.manufacture()
}

fun colorBridge(){
//    val square = Square()
//    square.applyColor()
//    val triangle = Triangle()
//    triangle.applyColor()

    val tri = bridge.color.solution.Triangle()
    tri.applyColor()
}

fun composite(){
    val drawing = Drawing()

    drawing.add(shape = composite.Triangle())
    drawing.add(shape = composite.Square())
    drawing.add(shape = composite.Drawing())
    drawing.draw()

}

fun decorator(){
//    val cheese = ExtraCheese(Peperoni())
//    println(cheese.description)
//    println(cheese.getPrice())
//
    val benz = Benz()
    println(benz.description + " " + benz.getPrice() + " " + benz.getSpeed())

    val upgradedBenz = MichelinTyres(benz)  // Store the decorated version
    println(upgradedBenz.description + " " + upgradedBenz.getPrice() + " " + upgradedBenz.getSpeed())

}