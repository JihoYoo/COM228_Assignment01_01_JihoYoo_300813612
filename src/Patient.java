
public class Patient {

	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++
		private String _patientID;
		private String _firstName;
		private String _lastName;
		private String _city;
		private String _province;
		private String _postalCode;
		
		// PROPERTIES +++++++++++++++++++++++++++++++++++++++++++++++
		public String getPatientID() {
			return this._patientID;
		}
		public void setPatientID(String patientID) {
			this._patientID = patientID;
		}
		
		public String getFirstName() {
			return this._firstName;
			
		}
		public void setFirstName(String firstName) {
			this._firstName = firstName;
		}
		
		public String getLastName() {
			return this._lastName;
			
		}
		public void setLastName(String lastName) {
			this._lastName = lastName;
		}
		
		public String getCity() {
			return this._city;
			
		}
		public void setCity(String city) {
			this._city = city;
		}
		
		public String getProvince() {
			return this._province;
			
		}
		public void setProvince(String province) {
			this._province = province;
		}
		
		public String getPostalCode() {
			return this._postalCode;
			
		}
		public void setPostalCode(String postalCode) {
			this._postalCode = postalCode;
		}
		
		
		// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++
		public Patient(){
		}
		
		
        // PUBLIC METHODS +++++++++++++++++++++++++++++++++++++++++++
			
		public void getPatientInfo(){
			System.out.printf("%s,%s,%s,%s,%s,%s", 
					this.getPatientID(),this.getFirstName(),
					this.getLastName(),this.getCity(), 
					this.getProvince(),this.getPostalCode());
		
		}
		
		}
	


