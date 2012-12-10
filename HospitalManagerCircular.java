//Ex6x5: File 2 of 2;

public class HospitalManagerCircular
{
	private PatientCircular patientListStart = null;

	public static void main(String[] args)
	{
		HospitalManagerCircular hmc = new HospitalManagerCircular();
		hmc.launch();
	}

	private void launch()
	{

		System.out.println("Please wait while patients are loaded");
		PatientCircular firstPatient = new PatientCircular("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		PatientCircular yetAnotherPatient = new PatientCircular("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		PatientCircular Patient2012Nov0001 = new PatientCircular("Alex", 12, "Measles");
		patientListStart.addPatient(Patient2012Nov0001);
		PatientCircular Patient2012Nov0002 = new PatientCircular("Babs", 23, "Broken leg");
		patientListStart.addPatient(Patient2012Nov0002);
		PatientCircular Patient2012Nov0003 = new PatientCircular("Carl", 34, "Broken arm");
		patientListStart.addPatient(Patient2012Nov0003);
		PatientCircular Patient2012Nov0004 = new PatientCircular("Dave", 45, "Hernia");
		patientListStart.addPatient(Patient2012Nov0004);
		PatientCircular Patient2012Nov0005 = new PatientCircular("Eric", 56, "Stomach cancer");
		patientListStart.addPatient(Patient2012Nov0005);
		PatientCircular Patient2012Nov0006 = new PatientCircular("Fred", 67, "Hip replacement");
		patientListStart.addPatient(Patient2012Nov0006);
		PatientCircular Patient2012Nov0007 = new PatientCircular("Gina", 78, "Shingles");
		patientListStart.addPatient(Patient2012Nov0007);
		PatientCircular Patient2012Nov0008 = new PatientCircular("Hart", 89, "Broken hip");
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


