enum class OrderStatus {
    CREATED,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    fun isFinal() : Boolean{
        return when(this){
            DELIVERED -> true
            CREATED -> false
            PROCESSING -> false
            SHIPPED -> false
            CANCELLED -> true
        }
    }

    fun canBeCacelled(): Boolean{
        return when(this){
            DELIVERED -> false
            CREATED -> true
            PROCESSING -> true
            SHIPPED -> false
            CANCELLED -> false
        }
    }
}