package exception

class AlreadyShippedException : OrderException("Нельзя отменить заказ — он уже был отправлен") {
}