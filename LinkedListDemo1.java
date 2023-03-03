import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> futureSubj=new LinkedList<>();
        futureSubj.add("Selenium");
        futureSubj.add("Testing");
        futureSubj.add("Cucumber");
        futureSubj.add("SQL");
        futureSubj.add("APIs");
        futureSubj.add("Jenkins");

        LinkedList<String> allSubjects = new LinkedList<>();


        allSubjects.addAll(subjects);


        allSubjects.addAll(futureSubj);
        System.out.println(allSubjects);

        }
//adds both list in one list and prints addAll method


    }


