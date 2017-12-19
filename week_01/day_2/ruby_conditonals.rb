#Guard Statements
score = 6

result = 'fail'

result = " pass" if (score >= 6)

puts result

=begin
If (score >= 6)
puts "Pass"
else
puts "fail"
=end


# Ternary

score = 6
result = (score >= 6)? "pass" : "fail"
# action (condition)? <condition_true : <condition_false>

puts result


# And & Or

craig_hungry = true
craig_tired = true

puts "Craig is hangry" if (craig_hungy && craig_tired)

# OR operator => ||

craig_tired = false

puts "Craig is grumpy!" if (craig_tired || craig_hungry)
