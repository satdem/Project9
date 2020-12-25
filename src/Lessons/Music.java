package Lessons;

import Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Music  extends LessonClass{
    private ArrayList<String> topicList=new ArrayList<>();

    public Music(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList.add("Peacemaking Skills for Little Kids");
        topicList.add("Learning Through Literature");
        topicList.add("");
        topicList.add("");
        topicList.add("");
        return null;
    }

    /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Music class is the child of the LessonClass

      add following values to arrayList(topicList) in the override method that comes from the abstract class

     Peacemaking Skills for Little Kids
     Learning Through Literature
     Creative Conflict Solving
     Creating Peace, Building Community
     WinWin!
     return topicList
     */


     /*

   Bu sınıf LessonClass sınıfının child sınıfıdır

    topicList isminde private String Arraylist oluşturun

    Music sınıfı LessonClass sınıfının child sınıfı


   abstract sınıftan gelen override methodunda  arrayList'e (topicList) aşağıdaki değerleri ekleyin

    Peacemaking Skills for Little Kids
     Learning Through Literature
     Creative Conflict Solving
     Creating Peace, Building Community
     WinWin!
    return topicList

     */


}
