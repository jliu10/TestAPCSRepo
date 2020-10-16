public class Demo{
  public static void printLoop(int n){
    int multiplier=n;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=multiplier;j++){
        System.out.print(i);
      }
      System.out.println();
      multiplier--;
    }
  }
/*
  public static void printLoop(){
    int multiplier=5;
    for(int i=1;i<=5;i++){
      for(int j=1;j<=multiplier;j++){
        System.out.print(i);
      }
      System.out.println();
      multiplier--;
    }
  }
*/
  public static void main(String[] args){
    if (args.length>0){
      int a=Integer.parseInt(args[0]);
      printLoop(a);
    } else printLoop(5);
  }
}
