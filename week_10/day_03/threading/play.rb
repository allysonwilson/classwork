def get_greeting(name)
  sleep 5
  return "Hello #{name}"
end

question = 'Who should I say hello to?'
puts question
input = gets.chomp
while input != 'quit'
  puts 'okay!'

  Thread.new do
  greeting = get_greeting(input)
  puts greeting
end


  puts question
  input = gets.chomp
end
