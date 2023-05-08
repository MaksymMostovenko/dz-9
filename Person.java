public abstract class Person {
    private String firstName;
    private String lastName;
    private int personAge;
    private Person partner;
    protected Gender personGender;

    private static final int MALE_RETIREMENT_AGE = 65;
    private static final int FEMALE_RETIREMENT_AGE = 60;

    public Person(String fName, String sName, int age){
        this.firstName = fName;
        this.lastName = sName;
        this.personAge = age;
        this.partner = null;
        System.out.printf("This is %s %s ", fName, sName);
    }

    public void addPartner(Person anotherPerson){
        this.partner = anotherPerson;
    }

    public int getPersonAge() {
        return personAge;
    }

    public String getPartner() {
        return "%s %s".formatted(partner.firstName, partner.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPartner(Person newPartner) {
        this.partner = newPartner;
        System.out.printf("%s has new partner %s /\n", this.getFirstName(), newPartner.getFirstName(), newPartner.getLastName());
    }

    protected void divorce(Person partner){
        this.partner = null;
        partner.partner = null;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public boolean isRetired(){
        if (this.personGender.equals(Gender.MALE) && this.personAge >= MALE_RETIREMENT_AGE)
            return true;
        else return this.personGender.equals(Gender.FEMALE) && this.personAge >= FEMALE_RETIREMENT_AGE;
    }
}
