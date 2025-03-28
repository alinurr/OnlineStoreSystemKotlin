package model.product

class DigitalProduct (override val name: String, val licenseKey: String) : Product {
    override fun isAvailable(): Boolean {
        return licenseKey.isBlank()
    }
}