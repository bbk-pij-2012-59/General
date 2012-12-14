//Ex6x4: File 1 of 2;

public class PatientDoubleLink
{
	private String name;
	private int age;
	private String illness;
	private PatientDoubleLink nextPatient;
	//new line
	private PatientDoubleLink previousPatient;

	public PatientDoubleLink(String name, int age, String illness)
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		//new line
		this.previousPatient = null;
	}

	public void addPatient(PatientDoubleLink newPatient)
	{
		if (this.nextPatient == null)
		{
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
			//new line
			this.nextPatient.previousPatient = this;
		}
		else
		{
			this.nextPatient.addPatient(newPatient);
		}
	}


	public boolean deletePatient(PatientDoubleLink patient)
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
			//new line
			nextPatient.nextPatient.previousPatient = this;
			return true;
		}
		else
		{
			return this.nextPatient.deletePatient(patient);
		}
	}

	public void printList(PatientDoubleLink patient)
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

	//add method
	public void printListBackwards(PatientDoubleLink patient)
	{
		System.out.println(this.name + ", age " + this.age + ", suffering from " + this.illness);
		if (this.previousPatient == null)
		{
			return;
		}
		else
		{
			this.previousPatient.printListBackwards(previousPatient);
		}
	}
}
