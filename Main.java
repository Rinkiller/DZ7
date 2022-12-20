import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

// Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

// Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Andrey", 6.3);
        Student st2 = new Student("Roman", 4.3);
        Student st3 = new Student("Uriy", 6.3);
        Student st4 = new Student("Sergey", 4.8);
        Student st5 = new Student("Aleksey", 7.8);
        List<Student> studentList = Arrays.asList(new Student[]{st1, st2, st3, st4, st5});
        StudentGroup group = new StudentGroup(studentList);
        for(int i = 0; i < group.getSize();i++){
            System.out.println(group.get(i));
        }
        System.out.println();
        Iterator it = new ReverseIterator(group);
        for(Student st : group){
            System.out.println(it.next());
        }
       
    }
}
