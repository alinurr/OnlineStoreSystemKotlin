import model.product.Product

class PremiumOrder<T : Product>(id: Int, item : T?, status: OrderStatus) :
    Order<T>(id, item, status){
    override fun onStatusChanged(newStatus: OrderStatus) {
        val oldStatus = this.status
        this.status = newStatus
        println("[PREMIUM] Order #<id> ${this.id}: статус изменён с <OLD> $oldStatus на <NEW> ${this.status}")
    }
}