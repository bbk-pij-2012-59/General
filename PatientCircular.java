//Ex6x5: File 1 of 2

public class PatientCircular
{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public PatientCircular(String name, int age, String illness)
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public void addPatient(PatientCircular newPatient)
	{
		if (this.nextPatient == null)
		{
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
		}
		else
		{
			this.nextPatient.addPatient(newPatient);
		}
	}


	public boolean deletePatient(PatientCircular patient)
	// returns true if the patient was found and removed, false otherwise
	{
		if (this.nextPatient == null)
		{
			// patient to remove was not found
			return false;
		}
		else if (this.nextPatient.name.equals(patient.name))
		{
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient;
			return true;
		}
		else
		{
			return this.nextPatient.deletePatient(patient);
		}
	}

	public void printList(PatientCircular patient)
	{
		System.out.println(this.name + ", age " + this.age + ", suffering from " + this.illness);
		if (this.nextPatient == null)
		{
			return;
		}
		else
		{
			this.nextPatient.printList(nextPatient);
		}
	}

}
