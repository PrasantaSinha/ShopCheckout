package com.mercator.store.checkout

trait Item {def price: BigDecimal}
case class Apple(price: BigDecimal) extends Item
case class Orange(price: BigDecimal) extends Item

trait ShoppingChart {
  def total(): BigDecimal
}

class ShoppingCart(items: List[Item]) extends ShoppingChart {

  val buyOneGeOneDiscountOnApple = buyOneGetOneDiscount(Apple(0.60))
  val threeForTwoDiscountOnOrange = threeForTwoDiscount(Orange(0.25))
  override def total() = items.map(_.price).sum - (buyOneGeOneDiscountOnApple + threeForTwoDiscountOnOrange)
  private def buyOneGetOneDiscount(item: Item) = items.count(i => i == item) / 2 * item.price
  private def threeForTwoDiscount(item: Item) = items.count(i => i == item) / 3 * 2 * item.price
}

object ShoppingCart {
  def apply(itemList: List[Item]) = new ShoppingCart(itemList)
}
