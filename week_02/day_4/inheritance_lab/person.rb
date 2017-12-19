class Person

attr_reader(:first_name, :last_name)
# attr_writer(:first_name, :last_name)

  def initialize(first_name , last_name)
    @first_name = first_name
    @last_name = last_name
  end


  def talks
    return "My name is #{first_name} #{last_name}"

  end

end

#attr_reader creates method of variable you make
