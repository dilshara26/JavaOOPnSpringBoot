public class ScholStudent extends Student{
    String scholType;
    ScholStudent(String name, String email, int studentID, String scholType) {
        super(name, email, studentID);
        this.scholType = scholType;
    }
}
