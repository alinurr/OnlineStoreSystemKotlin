package exception

class ItemUnavailableException(item: String) : OrderException("Товар '${item?.name}' отсутствует или недоступен"){
}