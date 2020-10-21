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
  public static String arrToString(int[]arr){
    if (arr.length==0) return "{}";
    String result="{";
    for (int i=0;i<arr.length-1;i++){
      result+=arr[i];
      result+=", ";
    }
    result+=arr[arr.length-1];
    result+="}";
    return result;
  }
  public static String arrayDeepToString(int[][]arr){
    String result="{";
    for (int i=0;i<arr.length-1;i++){
      result+=arrToString(arr[i]);
      result+=", ";
    }
    result+=arrToString(arr[arr.length-1]);
    result+="}";
    return result;
  }
  public static int[][] create2DArray(int rows,int cols,int maxValue){
    int[][]arr=new int[rows][cols];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        arr[i][j]=(int)(Math.random()*(maxValue+1));
      }
    }
    return arr;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols,int maxValue){
    int[][]arr=new int[0][];
    return arr;
  }
  public static void main(String[] args){
    /*
    if (args.length>0){
      int a=Integer.parseInt(args[0]);
      printLoop(a);
    } else printLoop(5);
    */
    System.out.println(arrayDeepToString(create2DArray(2,3,4)).replace("}, ","},\n "));
  }
}

/*
$ git add Demo.java
$ git commit -m "message"
$ git push
*/
