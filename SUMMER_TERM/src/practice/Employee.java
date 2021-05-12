package practice;
public class Employee{
int empno;
String empname;
String email;
Address address;
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
public int getEmpno() {
return empno;
}
public void setEmpno(int empno) {
this.empno = empno;
}
public String getEmpname() {
return empname;
}
public void setEmpname(String empname) {
this.empname = empname;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
@Override
public String toString() {
return "Employee [empno=" + empno + ", empname=" + empname + ", email=" + email + ", address=" + address + "]";
}
}