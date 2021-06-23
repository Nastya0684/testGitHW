public class MainClass {

    public static void main(String[] args) {
        arrayPeople();
    }


    public static void arrayPeople() {
        Employee[] arrComp = new Employee[5];
        arrComp[0] = new Employee("Sergey", "Stepanov", "Sergeevich", "Secretary", "stepanov@gmail.com", "89113333333", 20000, 20);
        arrComp[1] = new Employee("Roman", "Vasnetzov", "Romanovich", "Manager", "vasnetzov@gmail.com", "89112222222", 30000, 25);
        arrComp[2] = new Employee("Roman", "Lim", "Ivanovich", "Director", "lim@gmail.com", "89114444444", 60000, 60);
        arrComp[3] = new Employee("Denis", "Tivirev", "Denisovich", "Accountant", "tivirev@gmail.com", "89115555555", 40000, 30);
        arrComp[4] = new Employee("Andrey", "Mazin", "Andreevich", "Main Accountant", "mazin@gmail.com", "89116666666", 50000, 50);

        for (int i = 0; i < arrComp.length; i++)
            if (arrComp[i].getAge() > 40) {
                System.out.println(arrComp[i].getName() + " " + arrComp[i].getSurname() + " " + arrComp[i].getMiddleName() + " " + arrComp[i].getPosition() + " " + arrComp[i].getEmail() + " " + arrComp[i].getPhone() + " " + arrComp[i].getSalary() + " " + arrComp[i].getAge());
            }
    }


}
