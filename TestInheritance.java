class Employee
{ private String name;
  private int age;
  private String address;
  private int salary;
  public void setName(String name)
  { this.name=name;
  }
  public void setAge(int age)
  { this.age=age;
  }
  public void setAddress(String address)
  { this.address=address;
  }
  public void setSalary(int salary)
  { this.salary=salary;
  }
  public String getName()
  { return name;
  }
  public int getAge()
  { return age;
  }
  public String getAddress()
  { return address;
  }
  public int getSalary()
  { return salary;
  }
  public void printSalary()
  { System.out.println("Salary using printSalary:"+849348);
  }
}

class Officer extends Employee
{ private String specialization;
  public void setSpecialization(String specialization)
  { this.specialization=specialization;
  }
  public String getSpecialization()
  { return specialization;
  }
}

class Manager extends Employee
{ private String department;
  public void setDepartment(String department)
  { this.department=department;
  }
  public String getDepartment()
  { return department;
  }
}

class TestInheritance
{ public static void main(String args[])
	{ Officer o=new Officer();
	  o.setName("Thejus");
	  o.setAge(19);
	  o.setAddress("TVM");
	  o.setSalary(9000000);
	  o.setSpecialization("Developer");
	  Manager m=new Manager();
	  Employee e=new Employee();
	  m.setName("Neeraj");
	  m.setAge(19);
	  m.setAddress("TVM");
	  m.setSalary(8000000);
	  m.setDepartment("Testing");
	  System.out.println("OFFICER DETAILS");
	  System.out.println("Name:"+o.getName());
	  System.out.println("Age:"+o.getAge());
      System.out.println("Address:"+o.getAddress());
	  System.out.println("Salary using getSalary:"+o.getSalary());
	  e.printSalary();
	  System.out.println("Specialization:"+o.getSpecialization());
	  System.out.println("MANAGER DETAILS");
	  System.out.println("Name:"+m.getName());
	  System.out.println("Age:"+m.getAge());
	  System.out.println("Address:"+m.getAddress());
	  System.out.println("Salary using getSalary:"+m.getSalary());
	  e.printSalary();
	  System.out.println("Department:"+m.getDepartment());
	}
}