
package advanced.two;

import java.time.LocalDate;


public class Person {
    
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthday;

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
   
    public int getAge(){
        LocalDate currentDate = LocalDate.now();//trnutni datum
        int years = currentDate.until(currentDate).getYears();
        return years;
    }
}
