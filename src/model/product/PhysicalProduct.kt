package model.product

class PhysicalProduct( override val name: String, val stock: Int) : Product {
    override fun isAvailable(): Boolean {
        return stock > 0
    }

}