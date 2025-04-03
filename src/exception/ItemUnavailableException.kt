package exception

import model.product.Product

class ItemUnavailableException(itemName: String) :
    OrderException("Товар '$itemName' отсутствует или недоступен"){
    fun unavailableItem(){
        if()
    }
}