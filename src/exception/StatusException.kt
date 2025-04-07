package exception

import OrderStatus

class StatusException(var currentStatus: OrderStatus) :
    OrderException("Операция недопустима в текущем статусе: $currentStatus") {
}