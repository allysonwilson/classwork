require 'minitest/autorun'
require_relative './Fibonacci_example'

class TestFibonacci_Example < MiniTest::Test

  def test_fibonacci_example

    assert_equal(144 , fibonacci(12))
  end

end
