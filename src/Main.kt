import model.product.PhysicalProduct

fun main() {
    println("Hello World!")

    val iPhone = PhysicalProduct("iPhone 15", 2)
    val order1 = Order(1, iPhone, OrderStatus.CREATED)
    val orderManager1 = OrderManager(order1)
    orderManager1.process()
}