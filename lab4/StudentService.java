// ===== StudentService классы =====
static class StudentService {
    void printStudent(main.Student s) {
        System.out.println("StudentService арқылы:");
        s.showInfo();
    }

    void changeMajor(main.Student s, String newMajor) {
        s.setMajor(newMajor);
    }
}