package Chapter2.ch24;

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student (int studentId, String studentName){
        this.studentId=studentId;
        this.studentName=studentName;

        subjectList=new ArrayList<>();
    }

    public void addSubject(String subjectName, int score){
        Subject subject = new Subject();
        subject.setScore(score);
        subject.setName(subjectName);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total=0;
        for (Subject subject : subjectList){
            total+=subject.getScore();
            System.out.println(studentName + "학생의 " +subject.getName() + "과목의 성적은 " + subject.getScore() + "점 입니다.");

        }
        System.out.println(studentName+ "학생의 총점은 " + total +"점 입니다.");
    }

}
