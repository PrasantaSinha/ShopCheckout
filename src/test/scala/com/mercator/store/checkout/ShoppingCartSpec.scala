package com.mercator.store.checkout

import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper
import org.scalatest.wordspec.AnyWordSpec

class ShoppingCartSpec extends AnyWordSpec {

  "A ShoppingCart" should {
    "return total cost of item list" in {
      val itemList = List(Apple(0.60), Apple(0.60), Orange(0.25), Orange(0.25), Orange(0.25), Apple(0.60))
      ShoppingCart(itemList).total mustEqual 1.45
    }
    "apply buy-one-get-one on apple" in {
      val itemList = List(Apple(0.60), Apple(0.60), Orange(0.25), Apple(0.60))
      ShoppingCart(itemList).buyOneGeOneDiscountOnApple mustEqual 0.60
    }
    "apply three for two on oranges" in {
      val itemList = List(Apple(0.60), Apple(0.60), Orange(0.25), Orange(0.25), Orange(0.25), Orange(0.25), Apple(0.60))
      ShoppingCart(itemList).threeForTwoDiscountOnOrange mustEqual 0.50
    }
  }

}
