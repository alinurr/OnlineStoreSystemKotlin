import exception.ItemUnavailableException
import exception.OrderException
import exception.StatusException
import model.product.PhysicalProduct

fun main() {

    try {
        val iPhone = PhysicalProduct("iPhone 15", 2)
        val order1 = Order(1, iPhone, OrderStatus.CREATED)
        val orderManager1 = OrderManager(order1)
        orderManager1.process()
        orderManager1.ship()
        orderManager1.deliver()
        println("OK: заказ выполнен корректно")

        val samsung = PhysicalProduct("Samsung S25", 0)
        samsung.isAvailable()
        val order2 = Order(2, samsung, OrderStatus.CREATED)
        val orderManager2 = OrderManager(order2)
        orderManager2.process()

    }catch (e: ItemUnavailableException){
        println("OK: сработала ожидаемая проверка ${e.message}")
    }catch (e: StatusException){
        println("OK: сработала ожидаемая проверка ${e.message}")
    }catch (e: OrderException){
        println("OK: сработала ожидаемая проверка ${e.message}")
    }catch (e: Exception){
        println("ERROR: неожиданная ошибка — ${e.message}")
    }
}