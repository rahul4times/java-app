public class Main{

  public static String dollar = "$";

  public static void main(String[] args){

    //System.out.println(dollar + tip(10, 0.2));

    Dog fido = new Dog("Fido the Great", "woof", 44.9, false);
    Dog suzie = new Dog("Suzie the Great", "aaaaarff!", 34.2, false);
    Dog cujo = new Dog("Cujo", "MEOWWWWRRRRRR", 2.2, true);

    System.out.println(compareDogs(cujo,suzie)) ;
  }

  // public static double tip(double amt, double percentage){
  //   return amt * percentage;
  // }

  private static String compareDogs(Dog dog1, Dog dog2){
    if(dog1.getWeight() > dog2.getWeight()){
      return dog1.getName();
    } else{
      return dog2.getName();
    }
  }

}
