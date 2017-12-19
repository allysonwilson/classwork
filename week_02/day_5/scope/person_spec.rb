require('minitest/autorun')

class PersonSpec < MiniTest::Test

  def setup()
    @person = Person.new( "Sarah", 50 )
    person2 = Person.new("name" , 999 )
  end

  def make_person_speak( person )
  return "Hey, I am #{person.name}!"
  end

  make_person_speak( person )
end
