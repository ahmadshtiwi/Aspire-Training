import java.util.Optional;

public class Main {

    public static void main(String[] args) {


        /*using Exception      (checked) */

        StudentException studentException=new StudentException("1");

        try {
            String s=studentException.getStudentId();
            System.out.println(s);
        } catch (StudentException e) {

            e.printStackTrace();
        }



        /* using Runtime Exception      (unchecked)*/
        StudentRuntimeException studentRuntimeException =new StudentRuntimeException("1");

        String studentId = studentRuntimeException.getStudentId();

        System.out.println(studentId);


        StudentOptional studentOptional=new StudentOptional("0");

        Optional<String> studentId1 = studentOptional.getStudentId();
        System.out.println(studentId1);


    }
}
