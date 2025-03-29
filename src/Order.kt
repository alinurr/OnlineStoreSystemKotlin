import model.product.Product

class Order<T : Product>(id: Int, item: T?, status: OrderStatus) {
    internal fun changeStatus(newStatus: OrderStatus){
        println("Order #<id>: <OLD_STATUS> → <NEW_STATUS>")
    }

    protected open fun onStatusChanged() {}

    internal fun logInternalState(){
        println("Order #<id>: item=<item.name>, status=<status>")
    }
}