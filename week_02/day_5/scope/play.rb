# def calculator(a,b)
#   return yield(a, b)
# end
# puts calculator( 3,4 ){ |a, b| a * b }
# puts calculator( 3,4 ){ |a, b| a / b }
# puts calculator( 3,4 ){ |a, b| a - b }
# puts calculator( 3,4 ){ |a, b| a ** b }

#
# numbers = [ 3, 4, 5, 6 ]
#
# print numbers.map() { |n| n * 2}

# def print_name( name )
#   puts(name)
# end
# # puts add (6 , 7)
#  returns nil just logs to screen
# print_name( "rick")


class Bear

  def initialize
    @age = 0
  end

  def birthday
    @age = @age + 1
    # return " Happy birthday, you are now #{@age}"
  end

end

yogi = Bear.new()
yogi.birthday()

functions don't have to "return" anything sometimes they just update property




# def add( a, b )
#
#   return a + b
# end
#
# def multiply (a, b)
# return a * b
#
# end
#
# puts add( 3, 4 )
#
# puts multiply( 3, 4 )
