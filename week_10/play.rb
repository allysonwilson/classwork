# phone_numbers = {}
#
# phone_numbers[:pizza] = '07568 1234'
# puts phone_numbers[:pizza]

birthdays = [
  ["sam", "1984/04/01"],
  ["pam", "1984/04/01"],
  ["tam", "1984/04/01"]

  for birthday in birthdays
    if( birthday[0] == "pam")
      puts birthday[1]
    end
  end
  # time complexity (n) iterating through each item

]

birthdays = {
  ["sam" => "1984/04/01"],
  ["pam" => "1984/04/01"],
  ["tam" => "1984/04/01"]
}

puts birthdays["pam"]
# constant time
