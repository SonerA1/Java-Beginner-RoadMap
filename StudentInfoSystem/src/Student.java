public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    void addBulkCourseGrade(int matGrade,int fzkGrade, int kmyGrade){
        if (matGrade >= 0 && matGrade <= 100){
            this.mat.courseGrade = matGrade;
        }
        if (fzkGrade >= 0 && fzkGrade <= 100){
            this.fizik.courseGrade = fzkGrade;
        }
        if (kmyGrade >= 0 && kmyGrade <= 100){
            this.kimya.courseGrade = kmyGrade;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notes not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage : " + this.avarage);
            if (this.isPass) {
                System.out.println("You passed the class. ");
            } else {
                System.out.println("You are not passed the class.");
            }
        }
    }

    public void calcAvarage() {
        double fzk = (this.fizik.note * 0.80)+(this.fizik.note * 0.20);
        double mat = (this.mat.note * 0.80)+(this.mat.note * 0.20);
        double kmy = (this.kimya.note * 0.80)+(this.kimya.note * 0.20);
        this.avarage = (fzk + mat + kmy)/ 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.mat.note);
        System.out.println("Physics Note : " + this.fizik.note);
        System.out.println("Chemical Note : " + this.kimya.note);
    }

}
