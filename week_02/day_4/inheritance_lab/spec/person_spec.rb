require('minitest/autorun')
require_relative('../person')

class TestPerson < MiniTest:: Test

    def setup()
      @person = Person.new( "James" , "Bond")
    end

  def test_person_name__first

    assert_equal( "James", @person.first_name)
  end

  def test_person_name__last

    assert_equal( "Bond",@person.last_name)
  end

  def test_person_talks

    assert_equal("My name is James Bond", @person.talks)
  end


end
#{first_name} #{last_name}
