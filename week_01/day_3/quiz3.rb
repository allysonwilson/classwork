secret_number = 7

puts "Guess my number"

guess = gets.to_i()


while guess != secret_number do
  guess = gets.to_i()

  puts "guess higher" if guess < secret_number
    guess = gets.to_i()

  puts "guess lower" if guess > secret_number
    guess = gets.to_i()
  end

  puts "Yay! It was  #{secret_number}!"
