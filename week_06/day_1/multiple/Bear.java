public class Bear{
  private String name;
  private Salmon[] belly;

  public Bear(String name){
    this.name = name;
    this.belly = new Salmon[5];
  }

  public void eat(Salmon salmon){
    int foodCount = foodCount();
      belly[foodCount] = salmon;
  }

  public boolean isBellyFull(){
    return this.foodCount() == this.belly.length;
  }


  public void sleep(){
    this.belly = new Salmon[5];
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    int count = 0;
    for ( Salmon foodItem : this.belly ){
      if ( foodItem != null ){
          count++;
      }
    }
    return count;
  }


}
