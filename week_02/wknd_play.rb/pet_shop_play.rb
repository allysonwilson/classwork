def pet_shop_name(pet_shop)
  return pet_shop[:name]
end

def total_cash (pet_shop)
  return pet_shop[:admin][:total_cash]
end

def add_or_remove_cash(pet_shop , cash)
  return pet_shop[:admin][:total_cash] += cash
end

def pets_sold(sold)
  return @pet_shop[:admin][:pets_sold]
end

def increase_pets_sold(pet_shop , sold)
  return pet_shop[:admin][:pets_sold] += sold
end

def stock_count( pet_shop)
  return pet_shop[:pets].count
end

def customer_can_afford_pet(customer , pet)
  return customer[:cash] >= pet[:price]
end

def find_pet_by_name
  return pet_shop[:name]
  
end
