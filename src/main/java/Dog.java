class Dog {

private String myname;
private String mysound;
private double myweight;
public boolean iamEvil;

public Dog(String name,String sound,double weight,boolean isEvil){
  myname = name;
  mysound = sound;
  myweight = weight;
  iamEvil = isEvil;
}

public void bark(){
  System.out.println(mysound);
}

public double getWeight(){
  return myweight;
}
public String getName(){
  return myname;
}


}
