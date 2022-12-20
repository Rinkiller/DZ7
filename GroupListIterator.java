
import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student>{
    private int index = -1;
    private StudentGroup studentList;
    public GroupListIterator(StudentGroup studentList) {
        this.studentList = studentList;
    }
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return index < studentList.getSize() - 1;
    }
    @Override
    public boolean hasPrevious() {
        // TODO Auto-generated method stub
        return index > 0;
    }
    @Override
    public Student next() {
        index++;
        return studentList.get(index);
    }
    @Override
    public int nextIndex() {
        index++;
        return index;
    }
    @Override
    public Student previous() {
        index--;
        return studentList.get(index);
    }
    @Override
    public int previousIndex() {
        index--;
        return index;
    }
    @Override
    public void add(Student e) {
        studentList.add(e);
        
    }
    @Override
    public void set(Student e) {
        
        studentList.set( e);
    }
    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }
    
    
    

}
