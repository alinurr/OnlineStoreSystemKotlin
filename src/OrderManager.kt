import model.product.Product

class OrderManager<T : Product>(order: Order<T>) {
    fun process(){
        changeStatus()
    }
}