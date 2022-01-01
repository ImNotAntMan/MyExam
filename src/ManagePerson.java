import java.util.*;
public class ManagePerson {
	ArrayList<Person> personList;
	
	public ManagePerson() {
		personList = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		personList.add(person);
	}
	
	public void removePerson(int personId) {
		for(Person tmp : personList) {
			if(tmp.getpersonId() == personId) {
				personList.remove(tmp);
			}
		}
	}

	public void removePerson(String personName) {
		for(Person tmp : personList) {
			if(tmp.getPersonName().equals(personName)) {
				personList.remove(tmp);
			}
		}
	}
	
	public void modifyPersonName(int personId, String personName) {
		for(int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getpersonId() == personId) {
				personList.get(i).setPersonName(personName);
			}
		}
	}
	
	public void modifyPersonEmail(int personId, String personEmail) {
		for(int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getpersonId() == personId) {
				personList.get(i).setPersonEmail(personEmail);
			}
		}		
	}
	
	public void modifyPersonId(int personId, int s) {
		for(int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getpersonId() == personId) {
				personList.get(i).setPersonId(s);
			}
		}
	}
	
	public void showAllPerson() {
		for(Person tmp : personList) {
			System.out.println(tmp.getpersonId() + " " + tmp.getPersonName() + " " + tmp.getPersonEmail());
			tmp.doWork();
		}
	}
}
