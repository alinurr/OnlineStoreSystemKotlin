import exception.AlreadyShippedException
import exception.StatusException
import model.product.Product

class OrderManager<T : Product>(val order: Order<T>) {
    fun process(){
        if (order.status == OrderStatus.CREATED){
            order.changeStatus(OrderStatus.PROCESSING)
        }
    }

    fun ship(){
        if (order.status == OrderStatus.PROCESSING){
            order.changeStatus(OrderStatus.SHIPPED)
        }
    }

    fun deliver(){
        if (order.status == OrderStatus.SHIPPED){
            order.changeStatus(OrderStatus.DELIVERED)
        }
        if (order.status == OrderStatus.CANCELLED){
            throw StatusException(order.status)
        }
    }

    fun cancel(){
        if (order.status == OrderStatus.CREATED && order.status == OrderStatus.PROCESSING){
            order.changeStatus(OrderStatus.CANCELLED)
        }
        if (order.status == OrderStatus.DELIVERED && order.status == OrderStatus.SHIPPED) {
            throw AlreadyShippedException()
        }
    }
}