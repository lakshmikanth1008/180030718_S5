package classes;

public class Patient {
	String PatientName;
	double height;
	double width;

	public Patient(String patientName, double height, double width) {
		super();
		PatientName = patientName;
		this.height = height;
		this.width = width;
	}
	double computBMI()
	{
		double c=height*height;
		double d=height/c;
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient("lakshmi",7,8);
		System.out.println(p.computBMI());
	}

}
