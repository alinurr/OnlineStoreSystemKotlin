import model.product.Product

open class Order<T : Product>(var id: Int, var item: T?, var status: OrderStatus) {
     fun changeStatus(newStatus: OrderStatus) {
         val oldStatus = this.status
         this.status = newStatus
         println("Order #<id> ${this.id}: <OLD_STATUS> $oldStatus → <NEW_STATUS> ${this.status}")
     }

    protected open fun onStatusChanged(newStatus: OrderStatus){
        val oldStatus = this.status
        this.status = newStatus
        println("Order #<id> ${this.id}: <OLD_STATUS> $oldStatus → <NEW_STATUS> ${this.status}")
    }

    internal fun logInternalState(){
        println("Order #<id> ${this.id}: item=${this.item?.name}, status=${this.status}")
    }
}