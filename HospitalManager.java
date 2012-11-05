//Ex6x3: File 2 of 2; almost there, but how do I delete the first element?

public class HospitalManager
{
	private Patient patientListStart = null;

	public static void main(String[] args)
	{
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}

	private void launch()
	{

		System.out.println("Please wait while patients are loaded");
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		Patient yetAnotherPatient = new Patient("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient Patient2012Nov0001 = new Patient("Alex", 12, "Measles");
		patientListStart.addPatient(Patient2012Nov0001);
		Patient Patient2012Nov0002 = new Patient("Babs", 23, "Broken leg");
		patientListStart.addPatient(Patient2012Nov0002);
		Patient Patient2012Nov0003 = new Patient("Carl", 34, "Broken arm");
		patientListStart.addPatient(Patient2012Nov0003);
		Patient Patient2012Nov0004 = new Patient("Dave", 45, "Hernia");
		patientListStart.addPatient(Patient2012Nov0004);
		Patient Patient2012Nov0005 = new Patient("Eric", 56, "Stomach cancer");
		patientListStart.addPatient(Patient2012Nov0005);
		Patient Patient2012Nov0006 = new Patient("Fred", 67, "Hip replacement");
		patientListStart.addPatient(Patient2012Nov0006);
		Patient Patient2012Nov0007 = new Patient("Gina", 78, "Shingles");
		patientListStart.addPatient(Patient2012Nov0007);
		Patient Patient2012Nov0008 = new Patient("Hart", 89, "Broken hip");
		patientListStart.addPatient(Patient2012Nov0008);

		System.out.println("Current list of patients");
		patientListStart.printList(firstPatient);

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

		System.out.println("Updated list of patients");
		patientListStart.printList(firstPatient);

		if (patientListStart.deletePatient(firstPatient))
		{
			System.out.println("Patient firstPatient discharged today.");
		}
		else
		{
			System.out.println("Unable to find and delete firstPatient from system.");
		}

		System.out.println("Updated list of patients");
		patientListStart.printList(firstPatient);

		//patientListStart = firstPatient.nextPatient;

		//System.out.println("Updated list of patients");
		//patientListStart.printList(firstPatient);

	}

}


