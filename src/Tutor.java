class Tutor extends User{
    String subject;

    public Tutor(String name, String email, String subject) {
        super(name,email);
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
