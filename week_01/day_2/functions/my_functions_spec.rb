require( 'minitest/autorun' )
require( 'add_pop_density' )
=begin
require_relative( 'my_functions' )

class FunctionsTest < Minitest::Test

def test_greet
  expected = "Good morning, Craig "
  actual = greet("Craig", "morning")
  assert_equal( expected, actual )
end

end
=end

class FunctionsTest < Minitest::Test

  def test_add
    assert_equal( 5, add(2,3) )


    expected = 5
    actual = add(2,3)
    assert_equal( expected, actual)

  end
end
