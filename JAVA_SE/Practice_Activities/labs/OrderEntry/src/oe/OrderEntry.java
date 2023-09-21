package oe;

public class OrderEntry
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Order Entry Application");
		/**
		* Decalring two varibales of doubl data type and initilizing with values.
		*/
		double rentalItem1=2.95, rentalItem2=3.50;
		
		
		
		/**
		*  satement printing the values of attributes
		*/
		System.out.println(rentalItem1);
		System.out.println(rentalItem2);
		
		
		/**
		* Provding some more information while printing.
		*/
		System.out.println("First Item costs " +rentalItem1);
		System.out.println("Second Item costs " +rentalItem2);
		
		 /**
		 * decalring a varible to hold the total charge for the rental
		 */
		
		double itemsTotal;
		 
		 /**
		 * Declaring the varibles to hold the number of days and keep track of line 
		 */
		 
		 int line=1,numOfDays=2;
		 
		 /**
		 * Calculation for the toatl rental charge
		 */
		 
		 itemsTotal =((rentalItem1 *numOfDays) +(rentalItem2 *numOfDays));
		 
		 System.out.println("Total cost :" +itemsTotal);
		 
		 
		 /**
		 *Displaying the total cost in customer understandble way
		 */
		 
		 System.out.println("item "+line++ +" is "+rentalItem1+ " * "+numOfDays+" days = " +(rentalItem1 *numOfDays));
		 
		 System.out.println("item "+line++ +" is "+rentalItem2+ " * "+numOfDays+" days = " +(rentalItem2 *numOfDays));



		//Lesson 05 Controlling program flow
		
		
		
		
		/**
		* declaring the variables to hold the values
		*/
		
		int day=25,month=5,year=2000;
		


		/**
		* simple print statement hold the month and day of month
		*/
		
		System.out.println(day + "/"+ month + "/" +year);
		
		/**
		* a statement to check whether given year is leap year or not.
		*/
		boolean isLeapyear =(year %4 ==0)&&((year %100 !=0 )|| (year %400 ==0));
		
		/**
		* Declare a variable caled daysofMonth to hold the number of days in current month
		*/
		
		int daysInMonth;
		
		
		/**
		* a switch case statement to find the number of days in the gievn month;
		*/
		switch (month)
		{
			 case 1 : daysInMonth=31;
					break;
			 case 2 : daysInMonth= ((isLeapyear)?29 :28);
					break;
			 case 3 : daysInMonth=31;
					break;
			 case 4 : daysInMonth=30;
					break;
			 case 5 : daysInMonth=31;
					break;
			 case 6 : daysInMonth=30;
					break;
		     case 7 : daysInMonth=31;
					break;
			 case 8 : daysInMonth=31;
					break;
			 case 9 : daysInMonth=30;
					break;
			 case 10 : daysInMonth=31;
					break;
			 case 11 : daysInMonth=30;
					break;
			 case 12 : daysInMonth=31;
					break;
			 default :daysInMonth=31;
					break;
		}
		/**
		* printing the number of days in the given month
		*/
		
		System.out.println(daysInMonth + " days in month");
	
	/**
	* using a for loop to  print the date from the current day of month to end of the month
	*/
	
	 for( int i=day; i<=daysInMonth;i++)
	 {
		 System.out.println(day + "/"+ month + "/" +year);
	 }
	 
	 /**
	 * using for loop to print  atleast 10 days in the month 
	 */
	 
	 for( int i=day,iter=0; i<=daysInMonth && iter<10;i++,iter++)
	 {
		 System.out.println(day + "/"+ month + "/" +year);
	 }
	 
	 /**
	 *creating variables dueDay,dueMonth,dueyear for printing the rental due date
	 */
	 
	 int dueDay,dueMonth,dueYear;
	 //initailizing the rentDays with 3;
	 
	 int rentDays=3;
	 
	 dueMonth=month;
	 dueYear=year;
	 
	 /**
	 * calcualting the dueDay by adding rentDays and the current day
	 */
	 
	 dueDay=rentDays+day;
	 
	 /**
	 *printh the rental Date , Number of rental Days, Due date 
	 */
	 System.out.println("Rental Date : "+day + "/" + month + "/" +year);
	 
	 System.out.println("Number of rental days : " + rentDays);
	 
	 System.out.println("Date Due back : "+dueDay + "/"+ dueMonth + "/" +dueYear);
	 
	 
	 /**
	 * checking whether a month is valid month or not
	 */
	 if((month >0) && (month <13))
	 {
		 System.out.println(month + "is a valid month");
	 }
	 else
	 {
		 System.out.println(month + "is not a valid month");

	 }
	 

	 /**
	 * checking whether a day is valid day in given month 
	 * if the day is greater than daysIn month then increase the month number
	 */
	 if(dueDay <=daysInMonth)
	 {
		 System.out.println(dueDay + "/" + dueMonth + "/" +dueYear);
	 }
	 else{
		 dueDay =(dueDay-daysInMonth);
		 dueMonth +=1;
	 }
	 
	 /**
	 * checking whether a month is valid month in given year 
	 * if the month is greater than 12 then increase the year number
	 */
	 
	 if(dueMonth >12)
	 {
		 dueMonth=1;
		 dueYear +=1;
	 }
	 else{
		 System.out.println("End of Millennium");
	 }
	 
	
	 // optional worlk
	 
	 /**
	 *Printing all days to end of month using while loop ....
	 */
	 
	System.out.println("Printing all days to end of month using while loop ....");
	 
	 int temp=day;
	 while(temp <=daysInMonth)
	 {
		 System.out.println(temp + "/"+month + "/" +year);
		 temp ++;
	 }
	 
	  /**
	 *Printing atmost 10 days in a month from current day  using while loop ....
	 */
	 
	 int temp1=day;
	 int numSoFar=0;
	 while(temp <=daysInMonth)
	 {
		 System.out.println(temp + "/"+month + "/" +year);
		 temp1 ++;
		 if(++numSoFar ==10)
			 break;
	 }
	 
	}

}