package javaOptionals;

public class JudithOptionals {

    public static void main(String[] args) {
        Student judith  = new Student("Judith", "judith@epals.com");
        Student fred  = new Student("Fred", null);

        System.out.println(judith.getEmail());
        System.out.println(fred.getEmail());
    }

    static class Student{
        private String name;
        private String email;

        public Student(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }


}

