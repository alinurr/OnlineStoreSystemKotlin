package exception

class StatusException(currentStatus: String) :
    OrderException("Операция недопустима в текущем статусе: $currentStatus") {
}