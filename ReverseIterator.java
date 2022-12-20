import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {
    int index;
    private StudentGroup studentList;
    
    public ReverseIterator(StudentGroup studentList) {
        this.studentList = studentList;
        this.index = studentList.getSize();
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return index > 0;
    }

    @Override
    public Student next() {
        index--;
        return studentList.get(index);
    }
    
    
}
