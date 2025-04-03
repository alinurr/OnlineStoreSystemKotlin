package exception

import OrderStatus

class StatusException(var currentStatus: OrderStatus) :
    OrderException("Операция недопустима в текущем статусе: $currentStatus") {
    fun invalidStatus(){
        if (currentStatus == OrderStatus.DELIVERED && currentStatus == OrderStatus.SHIPPED
            && currentStatus == OrderStatus.CANCELLED){
                println("Операция недопустима в текущем статусе: $currentStatus")
        }
    }
}