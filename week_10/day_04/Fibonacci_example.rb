require "Benchmark"

time = Benchmark.realtime do



  def fibonacci(n)
    if n == 1
      1

    elsif n == 2
      1

    else
      fibonacci( n - 1 ) + fibonacci(n - 2)
    end
  end



end
puts "Time elapsed #{time} seconds"
