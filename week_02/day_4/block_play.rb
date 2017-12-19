def my_name

  weather = "it's raining :("

  puts "Hello " + yield( weather , 3 ) #yield goes to block, block gets passed to yield
end

my_name() { |weather, time| "Rick, "  + weather + time.to_s + "o'clock"}
my_name() { |w| w + "Stewart"  }



def each()

  x = 0
  while x < 5
    puts yield()
    x += 1
  end
end
each() { "2 + 4 =  #{2 + 4} "}


def each( array )

    for element in array
    puts yield(element)
    end
end

each( [3, 6, 9, 8] ) { |n| n * 2}
each( [ "blocks", "are", "cool"] ) { |string| string.upcase()}



def map( array )
  result= []
  for item in array
    result.push( yield (item) )
  end
  return result
end

print map ( [ 2, 3, 4 ] ) { |i| (i.to_f / 2 )}
print map ( [ "blocks", "are", "cool" ]) { |i| i.capitalize() }
