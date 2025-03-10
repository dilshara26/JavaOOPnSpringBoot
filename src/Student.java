class Student extends User {
    int studentID;

    Student(String name, String email, int studentID) {
        super(name,email);
        this.studentID = studentID;
    }

    void requestSession() {
        System.out.println(name + " requested a tutoring session.");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("ID: "+ studentID);
    }



}