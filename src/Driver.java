
public class Driver {

	public static Patient patient;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("PatientData");

patient =  new Patient();
	
	String pID = "ABC";
	String pFirst ="JIHO";
	String pLast = "Yoo";
	String pCity = "Toronto";
	String pProvince = "ON";
	String pPostalCode = "M4C 1L9";
	
	patient.setPatientID(pID);
	patient.setFirstName(pFirst);
	patient.setLastName(pLast);
	patient.setCity(pCity);
	patient.setProvince(pProvince);
	patient.setPostalCode(pPostalCode);
	patient.getPatientInfo();
	
	}

}
