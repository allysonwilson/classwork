class Bus
  attr_reader( :route_number , :destination, :passengers )
  attr_writer( :route_number, :destination, :passengers)

  def initialize(route_number , destination )
    @route_number = route_number
    @destination = destination
    @passengers = []
  #passengers array was commented out? with @passengers= passengers instead?

  end


  def drive()
    return "Vroom vroom..."
  end

  def number_passengers
   @passengers.count()

  end

  def add_folk( passenger1 )
  return @passengers.push( passenger1.name )
  end

  def drop_off( passenger2 )
    return @passengers.delete( passenger2 )
    # @passengers.slice!( index, 1)

  end

def everybody_off
    return @passengers.clear
    # @passengers = []

end


end
