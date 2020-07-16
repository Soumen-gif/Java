 class peakElement{
     public static void main (String [] args){
   int a[]={5, 10, 20, 15};
   int n=a.length;
    for(int i=1;i<n-1;i++)
    {
      if(a[i]>a[i-i] && a[i]>a[i+1])
      System.out.println(a[i]);
     }
   }
}
