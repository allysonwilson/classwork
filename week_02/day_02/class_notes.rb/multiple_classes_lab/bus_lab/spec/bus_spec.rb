require('minitest/autorun')
require_relative('../bus.rb')
require_relative('../person.rb')

class BusTest < MiniTest::Test

  def setup
    # @route_number
    # @destination
    @bus = Bus.new(22 , "Ocean Terminal", [])
    @person = Person.new( "Allyson" , 35 )
  end

  def test_drive
    assert_equal("Vroom vroom..." , @bus.drive)
  end

  def test_number_passengers
    assert_equal( 0 , @bus.number_passengers)
  end

  def test_add_passenger
    @bus.add_folk( @person )
    assert_equal( 1 , @bus.number_passengers)
  end

  def test_drop_off
    @bus.drop_off( @person )
    assert_equal( 0 , @bus.number_passengers)
  end

  def test_everybody_off
    @bus.everybody_off
    assert_equal( 0 , @bus.number_passengers)
  end


end
