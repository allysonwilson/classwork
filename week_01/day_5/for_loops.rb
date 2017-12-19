letters = ['a', 'b', 'c', 'd']

string = ''

counter = 0

while counter < letters.length() do
letter = letters [counter]

  string += letter

  counter += 1

end


###############


for letter in letters do
  string += letter

end


puts string
