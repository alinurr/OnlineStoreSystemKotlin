import model.product.Product

class OrderManager<T : Product>(val order: Order<T>) {
    fun process(){
        if (order.status == OrderStatus.CREATED){
            order.changeStatus(OrderStatus.PROCESSING)
        }
    }
}