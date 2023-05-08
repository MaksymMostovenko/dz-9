/*

Описати класи Man і Woman, що наслідують клас Person.

Обидва класи мають властивості:

--> firstName

--> lastName

--> age

--> partner

--> інші властивості, які ви вважаєте необхідними

Обидва класи мають методи:

--> конструктор, який включає всі поля

--> сеттер і геттер на полі age, та інші властивості, де це необхідно

--> isRetired (повертає true, якщо вік більше пенсійного порогу 60 для жінок та 65 для чоловіків)

--> registerPartnership (мається на увазі, що дружина приймає прізвище чоловіка)

--> deregisterPartnership (як вхідний параметр приймає boolean: повернення до попереднього прізвища)

За бажанням доповнити один або обидва класи будь-якими властивостями та/або методами.

*/

public class Main {
    public static void main(String[] args){
        System.out.println("Hi!");
        Female Natali = new Female("Natali", "Buzok", 16);
        Male George = new Male("George", "Miller", 28);
        Male Paul = new Male("Paul", "Stanly", 33);
        Paul.setInfertile();
        System.out.printf("%s %s and %s %s got merried!\s", Natali.getFirstName(), Natali.getLastName(), George.getFirstName(), George.getLastName());
        Natali.setPartner(George);
        Natali.registerPartnership(Paul);
        System.out.printf("%s met %s at girls party. They feel stong magnetism. ;)\n", Natali.getFirstName(), Paul.getFirstName());
        Natali.makePregnant(Paul);
        Natali.makePregnant(George);
        System.out.printf("%s got know about %s adultery. They had a fight. %s want a divorce.\n", George.getFirstName(), Natali.getFirstName(), Natali.getFirstName());
        Natali.deregisterPartnership(George);
        if (Natali.getPregnancy())
            System.out.print("But Natali feel sick. This because she's pregnant\n");
    }
}
