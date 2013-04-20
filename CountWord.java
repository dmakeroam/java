package testheap;
import java.util.Scanner;
import java.util.TreeSet;
public class CountWord{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int round=0;
    char [] checkLower=new char[52];
    for(int i=97;i<=122;i++){
      checkLower[i-97]=(char)i;
    }
    for(int i=65;i<=90;i++){ 
      checkLower[i-39]=(char)i;   // 26-51
    }
    System.out.print("Enter a string : ");
    char[] strArray=sc.next().toCharArray(); 
    int [][] count=new int[52][strArray.length];
    int i=0;    
    for(int j=0;j<checkLower.length;){ 
      if(strArray[i]==checkLower[j]){  // abbb  > 1 
        count[j][round]++;  
      }
      else{
        round++;
        i=round;
        if(i!=strArray.length){
          continue;
        }
        else{
          i=0;
          round=0;
          j++;
        }
      }      
      i++;
      if(i==strArray.length){
        round++;
        i=round;
        if(i!=strArray.length){
          continue;
        }
        else{
          i=0;
          round=0;
          j++;
        }
      }
    }
    int [] maxBefore=new int[52];
    int [] maxBeforeIndex=new int[52];
    for(i=0;i<count.length;i++){
      maxBefore[i]=count[i][0];
      maxBeforeIndex[i]=0;
      for(int j=1;j<count[i].length;j++){
        if(count[i][j]>maxBefore[i]){
          maxBefore[i]=count[i][j];
          maxBeforeIndex[i]=j;
        }
      }
    }
    int j=0;
    int [] maxCount=new int[52]; 
    for(i=0;i<count.length;i++){
      if(j<maxCount.length){
        maxCount[j]=count[i][maxBeforeIndex[i]];
      }
      j++;
    }
    int max=maxCount[0];
    int maxIndex=0;
    TreeSet <Integer> maxForPrint2=new TreeSet<>();
    for(i=1;i<maxCount.length;i++){
      if(maxCount[i]>max){
        max=maxCount[i];
        maxIndex=i;
      }
    }  
    for(i=0;i<maxCount.length;i++){
      if(maxCount[i]==max){
        maxForPrint2.add(maxBeforeIndex[i]);
      }
    }
    System.out.println(max);
    for(int elements : maxForPrint2){
      System.out.println(strArray[elements]);
    }
  }
}
