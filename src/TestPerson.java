/* tjudge3 - This was one of the assignments for the final making sure we understood inheritance */
class Member {
   private String name, location;
   public Member() 
   {
   }
   public Member(String nm, String lc) 
   {
       name = nm;
       location = lc;
   }
   public void setName(String nm) 
   {
       name = nm;
   }
   public void setLocation(String lc) 
   {
	   location = lc;
   }
   public String getName() 
   {
       return name;
   }
   public String getLocation() 
   {
       return location;
   }
   public String toString() {
       return "\nName: " + name + "\nLocation: " + location;
   }
}
class General extends Member
   {
   private String idnum, role;
   private int startyr;
   public General() 
   {
   }
   public General(String nm, String id, String lc, String rl, int sy)
   {
       super(nm, lc);
       idnum = id;
       role = rl;
       startyr = sy;
   }
   public void setIdnum(String id)
   {
       idnum = id;
   }
   public void setRole(String rl)
   {
       role = rl;
   }
   public void setStartyr(int sy)
   {
       startyr = sy;
   }
   public String getRole()
   {
       return role;
   }
   public String getIdnum()
   {
       return idnum;
   }
   public int getStartyr()
   {
       return startyr;
   }
   public String toString()
   {
       return super.toString() + "\nID Number: " + idnum + "\nRole: " + role + "\nStart Year: " + startyr;
   }
}
public class TestPerson 
{
public static void main(String[] args) 
{
   Employee s = new Employee("Bill ", "0005551212 ", "Main Campus ", "Professor ", 2006);
   System.out.println(s);
}
}
