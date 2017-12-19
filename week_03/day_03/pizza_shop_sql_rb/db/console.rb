require("pry-byebug")
require_relative("../models/pizza_order")
require_relative("../models/customer")

PizzaOrder.delete_all()
Customer.delete_all()

customer1 = Customer.new({'name' => 'Craig Morton'})
customer1.save()



order1 = PizzaOrder.new({
  "customer_id" => customer1.id,
  "topping" => "Mushroom",
  "quantity" => "1"
})
order1.save()

binding.pry
nil

#
# order2 = PizzaOrder.new({
#   "first_name" => "Darth",
#   "last_name" => "Vader",
#   "topping" => "Luke's Hand",
#   "quantity" => "1"
# })
#

# order2.save()

#call functions to test output in pry
