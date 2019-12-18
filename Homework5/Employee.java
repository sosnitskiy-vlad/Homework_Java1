package GeekBrainsJava1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }
//добавил условия на мин. ЗП и возраст
    public void setSalary(int salary) {
        if (salary >= 20000) this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) this.age = age;
    }

//конструктор "карточки сотрудника"
    public Employee(String name, String position, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
//метод, который выводит данные в консоль
    public String toString(){
        return "ФИО: " + name + "; Position: " + position + "; E-mail: " + email +
                "; Phone Number: " + phoneNumber + "; Salary = " + salary + "; Age = " + age + ".";
    }

}
