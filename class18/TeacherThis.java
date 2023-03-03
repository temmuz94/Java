package class18;

public class TeacherThis {
    String name;
    int teacherId;
    String subj;
   TeacherThis(String name,int teacherId){
       this.name=name;
       this.teacherId=teacherId;

   }
    TeacherThis(String name,int teacherId,String subj){
       this(name,teacherId);
       this.subj=subj;

    }
}
