# numbers = [2, 3, 4, 2, 1]
# total = 0
# for  current_number in numbers do
#   total += current_number
# end
#
# puts "total is: #{total}"

# chickens = ['Margaret','Hetty', 'Henrietta', 'Audrey', 'Mabel', 'Craig' ]
#
# for chicken in chickens do
#   puts chicken
# end

# chicken_hashes = [
#   {name: 'Margaret', age: 1, eggs: 2},
#   {name: 'Hetty', age: 3, eggs: 3},
#   {name: 'Mabel', age:1, eggs: 4},
#   {name: 'Craig', age:3, eggs: 0}
# ]
#
# for chicken in chicken_hashes do
#   puts "#{chicken[:name]} is #{chicken[:age]}"
# end
#
#
# total_eggs = 0
#   for egg_machine in chicken_hashes do
#
# if egg_machine[:eggs] > 0
#   puts "Yay, eggs!"
# end
#
#
#     total_eggs += egg_machine[:eggs]
# end
# puts "#{total_eggs} eggs collected"

chicken_hashes = [
  {name: 'Margaret', age: 1, eggs: 2},
  {name: 'Hetty', age: 3, eggs: 3},
  {name: 'Mabel', age:1, eggs: 4},
  {name: 'Craig', age:3, eggs: 0}
]
def find_lazy_chicken(chickens)
  lazy_chickens = []
  for chicken in chickens do
    if chicken[:eggs] <= 0
      lazy_chickens.push(chicken)
    end
  end

return lazy_chickens

end




#for loops- ruby infers you mean a variable by "chicken" because of the placement in statement.

#in top example because total is next to the operator += Ruby infers you actually mean total.
