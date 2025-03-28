package model.product

interface Product {
    val name: String
    fun isAvailable(): Boolean
}