import java.util.Scanner;
public class Ad{


static int[] min(){
int min[]={1,2,3,4,5};
return min;
}


public static void main(String arg[]){

int array[][]= new int[3][];
array[0]=new int[2];
array[1]=new int[3];
array[2]=new int[4];
int count=0;
for(int i=0;i<array.length;i++){
for(int j=0;j<array[i].length;j++)
array[i][j]=count++;
}
for(int i=0;i<array.length;i++){
for(int j=0;j<array[i].length;j++)
System.out.print(array[i][j]);
System.out.println();
}
 



}
}