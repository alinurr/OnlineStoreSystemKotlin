import model.product.Product

class Order<T : Product>(val id: Int, val item: T?, var status: OrderStatus) {
     fun changeStatus(newStatus: OrderStatus){
         val oldStatus = this.status
         this.status = newStatus
         println("Order #<id> ${this.id}: <OLD_STATUS> $oldStatus → <NEW_STATUS> ${this.status}")

     }

    protected open fun onStatusChanged() {}

    internal fun logInternalState(){
        println("Order #<id>: item=<item.name>, status=<status>")
    }
}