require('minitest/autorun')
require_relative('../bus_stop.rb')
require_relative('../person.rb' )

class BusStopTest < MiniTest::Test

  def setup
    @bus = BusStop.new ( "Linlithgow" )
    @person = Person.new( "Allyson" , 35 )
  end

  def test_add_passenger
    @person = Person.new( "Allyson" , 35 )
    assert_equal( 1 , @bus.add_passenger( @person ) )
  end

end
