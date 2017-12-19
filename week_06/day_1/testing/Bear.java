class Bear{
  private String name;
  private int age;
  private double weight;

// instance variables above

  public Bear(String name, int age, double weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

// method

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public double getWeight(){
    return this.weight;
  }
  
  public boolean readyToHibernate(){
    return this.weight > 200.00;
  }

}
