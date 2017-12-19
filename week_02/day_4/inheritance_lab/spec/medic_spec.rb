require('minitest/autorun')
require_relative('../medic')
require_relative('../person')

class TestMedic < MiniTest:: Test


  def setup()
    @medic = Medic.new( "Kwai", "Chan" )
    # @person = Person.new( "James" , "Bond")
  end

  def test_medic_talk

    assert_equal( "Yield, and you may be healed.", @medic.talk)

  end


end

# method for healing, which can also return a string. (eg. "Yield, and you may be healed.")
