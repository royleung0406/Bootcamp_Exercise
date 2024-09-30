public class Person2 {
  private String name;
  private  String sex ;

  public Person2 (String name, String sex){
    this.name = name;
    this.sex = sex;
  }
  public String getName(){
    return this.name;
  }

  public String getSex(){
    return this.sex;
  }

  @Override
  public String toString(){
    return "" + this.name;
  } 
}
