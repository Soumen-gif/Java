class sumArray{
public static void main(String[] args){

int a[]={10,5,4,1,-12,2};
boolean rs=subArray(a);
  if(rs==true)
  System.out.println("its true");
  else
  System.out.println("its false");

}
   public static boolean subArray(int[] a)
      {
         for(int i=0;i<a.length;i++)
         {
          int sum=0;
         for(int j=i;j<a.length;j++)
          {
          sum=sum+a[j];
          if(sum==0)
           {
            return true;
         }
      }
   }
    return false;
}
}

