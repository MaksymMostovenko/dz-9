public class Male extends Person {
    private boolean isFertile;

    public Male(String fName, String sName, int age) {
        super(fName, sName, age);
        this.isFertile = true;
        personGender = Gender.MALE;
        System.out.printf("his age is %d\n", this.getPersonAge());
    }
    public boolean isFertile(){
        return isFertile;
    }

    public void setInfertile(){
        this.isFertile = false;
    }
}