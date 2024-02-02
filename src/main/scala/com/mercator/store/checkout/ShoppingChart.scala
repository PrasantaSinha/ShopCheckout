package com.mercator.store.checkout

trait Item {def price: Double}
case class Apple(price: Double) extends Item
case class Orange(price: Double) extends Item

trait ShoppingChart {
  def total(): Double
}

class ShoppingCart(items: List[Item]) extends ShoppingChart {

  override def total(): Double = items.map(_.price).sum

}

object ShoppingCart {
  def apply(itemList: List[Item]) = new ShoppingCart(itemList)
}
