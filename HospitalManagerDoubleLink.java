//Ex6x4: File 2 of 2; almost there, but how do I know what is the last element?

public class HospitalManagerDoubleLink
{
	private PatientDoubleLink patientListStart = null;

	public static void main(String[] args)
	{
		HospitalManagerDoubleLink hmdl = new HospitalManagerDoubleLink();
		hmdl.launch();
	}

	private void launch()
	{

		System.out.println("Please wait while patients are loaded");
		PatientDoubleLink firstPatient = new PatientDoubleLink("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		PatientDoubleLink yetAnotherPatient = new PatientDoubleLink("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		PatientDoubleLink Patient2012Nov0001 = new PatientDoubleLink("Alex", 12, "Measles");
		patientListStart.addPatient(Patient2012Nov0001);
		PatientDoubleLink Patient2012Nov0002 = new PatientDoubleLink("Babs", 23, "Broken leg");
		patientListStart.addPatient(Patient2012Nov0002);
		PatientDoubleLink Patient2012Nov0003 = new PatientDoubleLink("Carl", 34, "Broken arm");
		patientListStart.addPatient(Patient2012Nov0003);
		PatientDoubleLink Patient2012Nov0004 = new PatientDoubleLink("Dave", 45, "Hernia");
		patientListStart.addPatient(Patient2012Nov0004);
		PatientDoubleLink Patient2012Nov0005 = new PatientDoubleLink("Eric", 56, "Stomach cancer");
		patientListStart.addPatient(Patient2012Nov0005);
		PatientDoubleLink Patient2012Nov0006 = new PatientDoubleLink("Fred", 67, "Hip replacement");
		patientListStart.addPatient(Patient2012Nov0006);
		PatientDoubleLink Patient2012Nov0007 = new PatientDoubleLink("Gina", 78, "Shingles");
		patientListStart.addPatient(Patient2012Nov0007);
		PatientDoubleLink Patient2012Nov0008 = new PatientDoubleLink("Hart", 89, "Broken hip");
		patientListStart.addPatient(Patient2012Nov0008);
		//add lines
		PatientDoubleLink lastPatient = new PatientDoubleLink("Xerxes", 98, "Dementia");
		patientListStart.addPatient(lastPatient);

		System.out.println("");
		System.out.println("Current list of patients in order admitted");
		patientListStart.printList(firstPatient);

		//add lines
		System.out.println("");
		System.out.println("Current list of patients in reverse order");
		lastPatient.printListBackwards(lastPatient);


		System.out.println("");
		System.out.println("Please wait while discharged patients are removed from system");
		if (patientListStart.deletePatient(Patient2012Nov0002))
		{
			System.out.println("Patient 2012Nov0002 discharged today.");
		}
		else
		{
			System.out.println("Unable to find and delete Patient2012Nov0002 from system.");
		}

		if	(patientListStart.deletePatient(Patient2012Nov0003))
		{
			System.out.println("Patient 2012Nov0003 discharged today.");
		}
		else
		{
			System.out.println("Unable to find and delete Patient 2012Nov0003 from system.");
		}

		if (patientListStart.deletePatient(Patient2012Nov0002))
		{
			System.out.println("Patient 2012Nov0002 discharged today.");
		}
		else
		{
			System.out.println("Unable to find and delete Patient 2012Nov0002 from system.");
		}

		System.out.println("");
		System.out.println("Updated list of patients");
		patientListStart.printList(firstPatient);

		//add lines
		System.out.println("");
		System.out.println("Updated list of patients in reverse order");
		lastPatient.printListBackwards(lastPatient);

	}

}


