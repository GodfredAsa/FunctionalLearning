package StreamsLearningExercise;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        System.out.println("Application of the functional interface in Java");
         people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                 .forEach(System.out::println);

//         PRINTS THE LENGTH OF NAME OF EACH PERSON
         people.stream()
                 .map(person -> person.name)
                 .mapToInt(String::length)
                 .forEach(System.out::println);

//         EXTRACTING FEMALES FROM THE LIST OF NAMES
        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);


//        System.out.println(genderPeople);

    }

    static class Person{
        private final  String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name  = name;
            this.gender = gender;

        }

        @Override
        public  String toString() {
            return "Person{ " + name + ", " + gender + "}";
        }
    }

      enum Gender{ MALE, FEMALE }


}
