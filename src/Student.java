/* tjudge3 - Assignment on Modifying an object */
class Student
{  
 private int id;  
 private String name;
 private int zipcode;

 public Student()
  {
   id = 8;
   name = "John";
   zipcode = 19090;
  }  

 public int getid()
   {
    return id;
   }
 public String getname()
   {
    return name;
   }
 public int getzipcode()
 	{
	 return zipcode;
	 }
 public void setid(int newid)
   {
    id = newid;
   }
 public void setname(String newname)
   {
    name = newname;
   }
 public void setzipcode(int zip)
 	{
	 zipcode = zip;
	 }
 public String toString()
   {
     String result = Integer.toString(id)+" "+name+" "+zipcode;
     return result;
   }
}
class TestStudent1
{  
 public static void main(String args[])
  {
   Student s0=new Student(); 
   System.out.println(s0); 
   Student s1=new Student();  
   s1.setid(312);
   s1.setname("Patrick");
   System.out.println("ID is " + s1.getid());
   System.out.println("The student name is " + s1.getname());
   System.out.println("The Zip Code is " + s1.getzipcode());
  }  
}  
