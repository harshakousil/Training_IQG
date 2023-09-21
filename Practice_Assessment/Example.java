/*
Section I:

 

1 -> Option-B 
2 -> Option-D
3 -> Option-D
4 -> Option-B
5 -> Option - E
6 -> Option- J
7 -> Option- A
8 ->  Options A & B
9 -> Options A, B & C
10 -> Options D & E
11 -> Options A, B & C
12 -> Option B
13 -> Options B, C, D & E
14 -> Option B
15 -> Option B & D
16 -> Option C
17 -> Option E
18 -> Option B
19 -> Option B
20 -> Different Types of Drivers are
        1. JDBC - ODBC Bridge Driver
        2. Native JDBC Driver
        3. All Java JDBC Net Driver
        4. Native Protocol All Java Driver
*/


//Section-2 in java assessment


/*
section - 2
---------------------------
1) error 1 - Public class Main  and

   error 2 - variable t might not have been initialized .

2) Not Same

 

3) Total 2 Objects Created

 

4) temp variable data type is not mentioned and in system.out.println concatenation not done properly.

 

5)  Copy Constructor Called 
   [ 10.0 + 15.0 i ] 

6)  invalid method declaration;
    return type required

7)   Base Class Constructor Called
    Derived Class Constructor Called 

8)   X = 10 Y = 20

 

9) Derived has not extended Base so we cannot create object of base type

 

10 In a Nested Class Method

*/



//section-3 in java assessment



//1.question



package training.iqgateway;

 
// Importing  connection and other modules.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

 
//creating a class called SampleCRUDOperations
public class SampleCRUDOperations {


//1.Read opration is done below
    public static void readFromDB(Connection con){
    String query = "SELECT * FROM DEPARTMENTS";

//Creating a prepared Statement
        try {
			PreparedStatement pt;
            pt = con.prepareStatement(query);

            ResultSet rs = pt.executeQuery();

            while(rs.next()){
	
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
            }
//closing the prepareStatement and databaseConnection.
            pt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

//Delete opertion

    public static void  deleteFromDB(Connection con){
    String query = "DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID= ?";

    try{
	//creating a prepared statemnet 
        PreparedStatement pt = con.prepareStatement(query);
            pt.setInt(1, 118);
        pt.executeUpdate();
        pt.close();
        con.close();
        }
        catch (SQLException e) {
                    e.printStackTrace();
                }
    }

//Update operation 
    public static void updateInDB(Connection con){
    String query = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME = ? WHERE DEPARTMENT_ID=?";


    try{
	
        PreparedStatement pt = con.prepareStatement(query);
        pt.setString(1, "STAFF");
        pt.setInt(2, 456);
        pt.executeUpdate();
        pt.close();
        con.close();
        }
        catch (SQLException e) {
                    e.printStackTrace();
                }
    }

//Inserting Operation

    public static void insertIntoDB(Connection con){
    String statement = "INSERT INTO DEPARTMENTS VALUES(?,?,?,?)";

//creating prepared statement.
    try{
        PreparedStatement pt = con.prepareStatement(statement);
        pt.setInt(1, 101);
        pt.setString(2, "STAFF");
        pt.setInt(3, 123);
        pt.setString(4, "vijayawada");
        pt.executeUpdate();
        pt.close();
        con.close();
        }
        catch (SQLException e) {
                    e.printStackTrace();
                }
    }


//Main method to create a classpath and connection to the DB.
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);

        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
//creating a connetion to the database.

          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "HR", "HR");
//calling the read opetion         
 readFromDB(con);
 //calling the delete operation
          deleteFromDB(con);
//calling the update operation
		  updateInDB(con);
		  
//calling the insertion operation
          insertIntoDB(con);
            
      }
     catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



//2.question

//What is an Inner class write a sample program to illustrate the Member level Inner Class


//Ans . Java programming language allows us to define a class within another class.
//Such class is  called Inner class

//Syntax :- 

// class OuterClass{
//	....
//		class NestedClass{
//			.....
//		}


//}


//A nested class is a  member of  its enclosing class/parent class
//Inner classes hav access to other members of enclosing class,even if they are declared private.
// Static Inner classes do not have access to other members of the enclosing class.

// Objects that are  instances of an inner class exist within an instance of outer class.

//TO instantiate an inner class,we must first instantiate the outer class.Then create the inner object within the outer object



//Example for a inner class in java

public class OuterClass{


		//inner class
		
		class InnerClass
		{
		 public void show()
		 {
		  System.out.println("In a nested Inner class method");
		 }
		}
		public static void main(String[] args)
		{
		//calling a inner class method by creating a outerclass instance and then innerclass from the outerclass object.
		OuterClass.InnerClass in = new OuterClass(). new InnerClass();
		 in.show();
		}
}


// 3.question

//Explain Different Types of Constructors in Java, with Sample to Demonstrate All the
//Constructors


//Ans 

// In Java, Constructors  can be divided into 3 types:

/*
1. No-Arg Constructor
2. Parameterized Constructor
3. Default Constructor




1. No-Argument constructors

In java Constructors may or may not have any parameters same as methods.

If a constructor does not accept any paramters, It is known as no argument constructor

syntax :-

		Access specifier  ConstructorName()
		{
			....
		}
*/



//Program for  No-Arg constructor


class NoArg
{
	int i;
	
	
	//constructor with no parameters
	private NoArg()
	{
		i=5;
		System.out.println("Constructor is called");
		
	}
	
	
	public static void main(String args[])
	{
		//Calling the constructor without any parameters
		
		NoArg obj =new NoArg();
		System.out.println("Vlaue of I is : "+ obj.i);
	
		
	}
	
}
//output :- constructor i is called
//Value of I is : 5.   


        
// 2)parameterized constructor
//the constrcutor whivch takes arguments while calling is called  parameterzied constructor.

Example :  
class Main {
 String languages;
 // constructor accepting single value
   (String lang) {
       languages = lang;
       System.out.println(languages + " Programming Language");
      }
                                      
public static void main(String[] args) {

  // call constructor by passing a single value
  Main obj1 = new Main("Java");
  Main obj2 = new Main("Python");
  Main obj3 = new Main("C");
  }
}


//Default constrcutor

/*
for default constrcutors 

1.The name of constrcutor must be same as the class Name
2.The constrcutor must have no return Type.
*/

//Example

public class Student
{
	String Name;
	int age;
	
	//Student class Constructor.
	public Student()
	{
		Name ="Kousil Lakkapragada";
		age=22;
	}
	
	public static void main(Sytring args[])
	{
		Student StudentDet=new Student();
		
		System.out.println(StudentDet.age);
		
	}
}

//output :- 22;




//4th question

/*
Create a class to construct an ArrayList of Customer objects, and then provide a method to
find and return a Customer object for a given ID. The Order class needs to be modified to
contain an ArrayList of order items, requiring a method to add items into the ArrayList, and
another method to remove the items.
*/

import java.util.*;

/**

*

* @author kousil.lakkapragada

*/

public class ArryListExample {
	
	//creating a arrayList called customers

    private static List<Customer> customers = new ArrayList<>();


    public static void buildCustomers(){

        if(!customers.isEmpty()) return;

        customers.add(new Customer("kousil lakkapragada", "vijayawada, AP", "123.456.876"));

        customers.add(new Customer("harsha kousil", "Hyderabad, TS", "107.295.290"));

    }


    static{

        buildCustomers();
    }


    public static Customer findCustomerById(int custId){

        for(Customer customer : customers){

            if (custId == customer.getId()) return customer;

        }

        return null;

    }


}


//
import java.util.ArrayList;

 

/**

*

* @author kousil.lakkapragada

*/

public class OrderList {

    ArrayList items = new ArrayList(10);


    public void addOrder(int product){

      OrderItem item = null;

      boolean productFound = false;

      for(int i=0; i < items.size() && !productFound; i++){

          item = (OrderItem) items.get(i);

          productFound = (item.getProduct() == product);

      }

      if(productFound){

          item.setQuantity(item.getQuantity() + 1);

      }

      else {

          item= new OrderItem(product, 5.0);

          items.add(item);

          item.setLineNbr(items.size());

      }

      orderTotal += item.getUnitPrice();

    }


    public void removeOrder(int product){


      OrderItem item = null;

      boolean productFound = false;

      for(int i=0; i < items.size() && !productFound; i++){

          item = (OrderItem) items.get(i);

          productFound = (item.getProduct() == product);

      }

      if(productFound){

          orderTotal -= item.getUnitPrice()*item.getQuantity();

          items.remove(item);

      }
    }

}

//5th question



/*
Explain Java SE New Features [ Usage of Lambda Expression, Different Functional
Interfaces and Modular Programming in Java ]
*/


//Answer

/*
Lambda Expression:
    A lambda expression is a short block of code which takes in parameters and returns a value. 
    Lambda expressions are similar to methods, but they do not need a name and they can be implemented on the go of a method call.

 

Example - (x,y) -> x+y

 

Functional Interfaces:
    1.Lamba expressions rely on functional interfaces
    2.Functional interfaces comes under the package java.util.function 
      there are diffrent functions like predicate, consumer, primitive interface like ToDoubleFunction

Modular Programming in Java:
    Modules is set of packages that was introduced in JDK 9
    It is like higher level of aggregation above packages
    A module consists of exported packages and concealed packages.
    A module must be declared in a module-info.java filename
    Each module declaration begins with keyword module
Example -     module modulename
            {

            }




To create a module in Java, you define a module descriptor (module-info.java) that specifies the module name, dependencies, and exported packages.

 

module com.trainig.example {
    requires java.util.*;
    requires training.Walk;
    requires  App.MyAge  ;
    exports com.example.Example.Solve;
}
*/
