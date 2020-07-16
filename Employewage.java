                              //Check Employee is Present or Absent
 class Employewage{
public static void main(String[] args) 
    {
     		int IsPresent=1;
		double empCheck=Math.floor(Math.random() * 10 ) %2;
		if (empCheck==IsPresent){
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
