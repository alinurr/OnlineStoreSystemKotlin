import exception.AlreadyShippedException
import exception.ItemUnavailableException
import exception.OrderException
import exception.StatusException
import model.product.PhysicalProduct
import model.product.Subscription

fun main() {
    val iPhone = PhysicalProduct("iPhone 15", 2)
    val order1 = Order(1, iPhone, OrderStatus.CREATED)
    val orderManager1 = OrderManager(order1)
    orderManager1.process()
    orderManager1.ship()
    orderManager1.deliver()
    println("OK: заказ выполнен корректно")


    val macBook = PhysicalProduct("Macbook 14 M3", 1)
    val order2 = Order(2, macBook, OrderStatus.CREATED)
    val orderManager2 = OrderManager(order2)
    orderManager2.cancel()

    val googlePixel = PhysicalProduct("Google Pixel ", 4)
    val order3 = PremiumOrder(3, googlePixel, OrderStatus.CREATED)
    val orderManager3 = OrderManager(order3)
    orderManager3.process()
    orderManager3.ship()
    orderManager3.deliver()
    println("OK: заказ выполнен корректно")

    val samsung = PhysicalProduct("Samsung S25", 0)
    try {
        if (!samsung.isAvailable()){
            throw ItemUnavailableException(samsung.name)
        }

    }catch (e: ItemUnavailableException){
        println("OK: сработала ожидаемая проверка ${e.message}")
    }catch (e: Exception){
        println("ERROR: неожиданная ошибка — ${e.message}")
    }

    try {
        orderManager1.cancel()
    }catch (e: AlreadyShippedException){
        println("OK: сработала ожидаемая проверка ${e.message}")
    }

    try {
        orderManager2.deliver()
    }catch (e: StatusException){
        println("OK: сработала ожидаемая проверка ${e.message}")
    }
}