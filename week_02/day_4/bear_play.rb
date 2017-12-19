require("pry")

class Bear

  attr_reader( :name)
  def initialize( bear_name)

    @name = bear_name
    # @stomach = []
    # @age = 0
  end
end
#
# #getter method , replaced by reader
# # def get_my_name
# #   return @name
# # end
#
#   def eat( river_fish )
#   @stomach << river_fish.pop()
#   end
#
#
# end
#
# class Fish
#   def initialize( fish_type )
#   @type = fish_type
#   end
#
#
# end
#
# river_fish = [ Fish.new( "Salmon" ), Fish.new( "Trout" ) ]





#this is creating a bear obect - called an instance
yogi =  Bear.new( "yogi")
harrison = Bear.new( "harrison")

# binding.pry
# nil


# yogi = Bear.new("yogi")
# harrison = Bear.new( "harrison")
