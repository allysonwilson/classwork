class BusStop

def initialize( name )

  @name = name
  @queue = []

end

def add_passenger(person)
  @queue.insert( person )
  return @queue.length
end

end
