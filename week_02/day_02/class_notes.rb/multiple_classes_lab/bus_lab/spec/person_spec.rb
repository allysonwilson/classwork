require( 'minitest/autorun' )
require_relative('../person.rb' )

class PersonTest < MiniTest::Test

  def setup
    @person = Person.new( "Allyson" , 35)
  end


end
