import org.jetbrains.annotations.NotNull;

public class Female extends Person {
    private boolean fertile;
    private boolean isPregnant;
    private final String maidenName;

    public Female(String fName, String sName, int age) {
        super(fName, sName, age);
        this.personGender = Gender.FEMALE;
        this.fertile = true;
        this.isPregnant = false;
        this.maidenName = sName;
        System.out.printf("her age is %d.\n", this.getPersonAge());
    }

    public void makeUnfertile(){
        this.fertile = false;
    }

    public void makePregnant( Male man){
        if (man.isFertile() && this.fertile && !this.isPregnant){
            isPregnant = true;
            System.out.printf("%s is pregnant. The father is %s %s\n", this.getFirstName(), man.getFirstName(), man.getLastName());
        }
        else
            System.out.printf("%s and %s had a good time. :)\n", this.getFirstName(), man.getFirstName());
    }
    public Person giveChild(String fName, String sName, Gender gender){
        if ( isPregnant && gender.equals(Gender.MALE) )
            return new Male(fName, sName, 0);
        else if ( isPregnant && gender.equals(Gender.FEMALE) )
            return new Female(fName, sName, 0);
        return null;
    }
    public void registerPartnership(Male husband){
        setLastName(husband.getLastName());
    }

    public boolean getPregnancy(){
        System.out.printf("%s %s",this.getFirstName(), this.isPregnant ? "is pregnant.\n" : "ate too much ousters.\n");
        return this.isPregnant;
    }

    public void deregisterPartnership(Male husband){
        this.divorce(husband);
        setLastName(maidenName);
    }
}
