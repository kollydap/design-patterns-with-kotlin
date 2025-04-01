import AbstractFactory.FactoryProducer
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
import chainOfResponibility.*
import chainOfResponibility.atm.TenDollars
import chainOfResponibility.atm.ThirtyDollars
import chainOfResponibility.atm.TwentyDollars
import command.*
import composite.Drawing
import decorator.ExtraCheese
import decorator.Peperoni
import decorator.vehicles.Benz
import decorator.vehicles.MichelinTyres
import factory.NotificationFactory
import factory.ShapeFactory
import interpreter.AndExpression
import interpreter.Expression
import interpreter.OrExpression
import interpreter.TerminalExpression
import iterator.MyDataStructure
import observer.NewsAgency
import observer.NewsChannel
import prototype.Point
import proxy.Client
import proxy.HTTPSRequest
import proxy.MainServer
import proxy.ProxyServer
import proxy.enums.ClientAction
import singleton.Database

fun main() {
    println("Hello World!")
//    proxy()
//    adapter
//    vehicleBridge()
//    colorBridge()
//    composite()
//    decorator()
//    singleton()
//    prototype()
//    factory()
//    abstractFactory()
//    observer()
//    iterator()
//    command()
//    chainOfResponsibilities()
    interpreter()
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

fun singleton(){
    val db = Database.getInstance()
    println(db)
}

fun prototype(){
    val p1 = Point(x = 20, y = 40)
    val p2 = p1.clone()
    println(p1)
    println(p2)
}
fun factory(){
    val v1 = ShapeFactory()
    val square = v1.getShape("triangle")
    println(square.paint())

    val v2 = NotificationFactory()
    val sms = v2.create("sms")
    println(sms.notifyUser())
}

fun abstractFactory(){
    val v1 = FactoryProducer.getFactory(isRounded = true)
    val v2 = v1.getShape("triangle")
    println(v2.draw())
}

fun observer(){
    val agency = NewsAgency()
    val channel1 = NewsChannel()
    val channel2 = NewsChannel()

    agency.add(channel1)
    agency.add(channel2)

    agency.setNews("Breaking News: Kotlin Observer Pattern Explained!")
}

fun iterator(){
    val dataStructure = MyDataStructure()
    val iterator = dataStructure.getIterator()

    while (iterator.hasNext()) {
        val name = iterator.next()
        println("Processing: $name")

        // Remove "osaze" from the list
        if (name == "osaze") {
            iterator.remove()
            println("Removed: $name")
        }
    }

    // Verify the remaining elements
    val newIterator = dataStructure.getIterator()
    println("Remaining elements:")
    while (newIterator.hasNext()) {
        println(newIterator.next())
    }
}

fun command(){
    val file = File("document.txt")
    val openCommand = OpenFileOps(file)
    val saveCommand = SaveFileOps(file)

    val invoker = FileOpsInvoker()
    println(invoker.executeOperations(openCommand)) // Opening document.txt
    println(invoker.executeOperations(saveCommand))
}

fun chainOfResponsibilities(){
    val chain1 = AddNumbers()
    val chain2 = SubtractNumber()
    val chain3 = MultiplyNumbers()

    chain1.setNextChain(chain2)
    chain2.setNextChain(chain3)

    val eqn1 = Numbers(10,20, "mul")
    chain1.calculate(eqn1)


    val ch2 = TenDollars()
    val ch3 = TwentyDollars()
    val ch4 = ThirtyDollars()

    ch2.setNextMoneyDistributorChain(ch3)
    ch3.setNextMoneyDistributorChain(ch4)

    ch2.calculate(100)
}

fun interpreter (){
    val jack = TerminalExpression("jack")
    val john = TerminalExpression("john")
    val isMale = OrExpression(jack, john)
    println(isMale.interpret("jack"))

    val sara = TerminalExpression("sara")
    val married = TerminalExpression("married")
    val isMarried  = AndExpression(sara, married)

    println(isMarried.interpret("sara"))
}