
def fizz_buzz(number)

  divides_by_5 = number % 5 == 0
  divides_by_3 = number % 3 == 0

if divides_by_3 &&  divides_by_5
      return "Fizz_Buzz"
    end

  return "Buzz" if divides_by_5

  return "Fizz" if divides_by_3
  return number.to_s()

end


#input: integer
# return "Fizz" if input divides by 3
# " "Buzz" if input divides by 5
# " "FizzBuzz" input divides by 3 and 5
# otherwise return number as string
