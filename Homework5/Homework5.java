package GeekBrainsJava1;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Alex Nurse", "Nurse", "iamnurse@mail.ru",
                93005689, 45000, 24);
        employee[1] = new Employee("Ivan Bolvar", "CEO", "ib@ceo.org",
                45612378, 109500, 42);
        employee[2] = new Employee("Olga Frost", "Lawyer", "offlaw@law.law",
                553468, 85000, 26 );
        employee[3] = new Employee("Mark Afrojack", "Engineer", "golden@hands.ok",
                7891230, 58790, 34);
        employee[4] = new Employee("Roberto Carlos", "Janitor", "allis@clean.check",
                2213985, 56250, 43);

        for (int i = 0; i <employee.length; i++) {
            if (employee[i].getAge() > 40)
                System.out.println(employee[i].toString());

        }
        }
    }

