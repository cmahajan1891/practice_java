import java.util.*;

interface CheckPerson {
  boolean test(Person p);
}
// This is the class that implements the CheckPerson interface;
class CheckPersonForSelectedCriteriaService implements CheckPerson{
  public boolean test(Person p){
    // if (p.age>=10 && p.sex == "M") {
    //   return tre
    // }
    return p.age >= 10 && p.sex.equals("M");
  }
}

public class Person {

  int age;
  String sex;
  String location;

  public Person(int age, String sex, String loc) {
    this.age = age;
    this.sex = sex;
    location = loc;
  }

  public void printPerson(){
    System.out.println(this.age + " " + this.sex + " " + this.location);
  }

  public static void printPersons(List<Person> list, CheckPerson tester){
    for (Person p : list) {
      if (tester.test(p)) {
        p.printPerson();
      }

    }
  }

 public static void main(String[] args) {
   List<Person> persons = new ArrayList<>();

   persons.add(new Person(25, "M", "Washington DC"));
   persons.add(new Person(8,  "F", "Maryland"));
   persons.add(new Person(25, "M", "Virginia"));

   //printPersons(persons,new CheckPersonForSelectedCriteriaService());

   //Now calling the function printPersons with the anonymous class;
   printPersons(persons, new CheckPerson(){
     public boolean test(Person p) {
       return p.age <= 10 && p.sex.equals("F");
     }
   });

   //Now specifying search criteria with the help of Lambda Expression.
   printPersons(
      persons,
      p -> p.age >= 15 && p.sex.equals("M")
  );

 }
}
