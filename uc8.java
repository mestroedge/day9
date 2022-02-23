package emp;
class empwagess{
	int parttimehr=4;
	int fulltimehr=8;
	int dmart = 30;
	int more = 45;
	public float wage_for_month(int type, int wageperhr, int numberofdays)
	{	
		System.out.println("Welcome to employee wage calculator program... ");
		float wagepermonth;
		if(type==1)
		{
			System.out.println("Employee works as part timer");
			wagepermonth = parttimehr * wageperhr * numberofdays;
		}
		else
		{
			System.out.println("Employee works as full timer");
			wagepermonth = fulltimehr * wageperhr * numberofdays;

		}
		return wagepermonth;
	}
}

public class uc8 {
	public static void main(String ar[])
	{
		empwagess emp = new empwagess();
		float sal= emp.wage_for_month(1, 20 , 15);
		System.out.println("Salary of the employee is: "+ sal);
		System.out.println("Salary of the employee is: "+ emp.wage_for_month(2, 20, 50));
		System.out.println("Salary of the employee in dmart is: "+ emp.wage_for_month(2, emp.dmart, 50));
		System.out.println("Salary of the employee in more is: "+ emp.wage_for_month(2, emp.more, 40));
}

}
