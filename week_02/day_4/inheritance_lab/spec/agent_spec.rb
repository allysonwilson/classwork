require('minitest/autorun')
require_relative('../agent')

class TestAgent < MiniTest:: Test

  def talks
    assert_equal("The name's #{last_name}, #{first_name} #{last_name}")
end

  end
