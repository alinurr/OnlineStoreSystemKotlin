package model.product

class Subscription(override val name: String, val active: Boolean) : Product{
    override fun isAvailable(): Boolean {
        return active
    }
}