public class Main{

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int sum=0;
    //for (int i = 0; i < arr.length; i++)
        //System.out.println("ARRAY IS "+arr[i]);
for(int x:arr){//foreach for separte the element
    sum+=x;
    System.out.println("for each"+x);
    System.out.println("sum is:"+sum);
}
}
}
