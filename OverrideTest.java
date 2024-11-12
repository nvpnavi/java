class Person
{ private String name;
  private int age;
  public void setName(String name)
  { 
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public void setAge(int age)
  { 
    this.age=age;
  }
  public int getAge()
  { 
    return age;
  }
  public void display()
  { 
    System.out.println("name="+name);
	System.out.println("age="+age);
  }
}

class Employee extends Person
{ private int empId;
  public void setEmpId(int empId)
  { this.empId=empId;
  }
  public int getEmpId()
  { return empId;
  }
  public void display()
  { super.display();
    System.out.println("EmpId="+empId);
  }
}

class OverrideTest
{ public static void main(String args[])
	{ Employee e=new Employee();
	  e.setName("Thejus");
	  e.setAge(19);
	  e.setEmpId(849);
	  e.display();
	}
}