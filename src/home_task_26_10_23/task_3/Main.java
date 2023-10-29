package home_task_26_10_23.task_3;
/*3. Создайте иерархию учебных предметов (Subject -> Natural sciences/exact sciences/humanities ->
Biology, Chemistry / Physics, Mathematics / Literature, Philology). Напишите класс Student,
параметризируемый предметом. Создайте классы студентов по каждому из направлений
(Natural sciences/exact sciences/humanities),
укажите в наследуемом параметре конкретный тип */
public class Main {
    public static void main(String[] args) {
        Biology biology = new Biology("Biology");
        Student<Biology> biologyStudent = new Student<>("Alice", biology);
        System.out.println(biologyStudent.getName() + " is studying " + biologyStudent.getSubject().getName());

        Physic physic = new Physic("Physic");
        Student<Physic> physicStudent = new Student<>("Kiwi", physic);
        System.out.println(physicStudent.getName() + " is studying " + physicStudent.getSubject().getName());

        Literature literature = new Literature("Literature");
        Student<Literature> literatureStudent = new Student<>("Charlie", literature);
        System.out.println(literatureStudent.getName() + " is studying " + literatureStudent.getSubject().getName());

    }
}
