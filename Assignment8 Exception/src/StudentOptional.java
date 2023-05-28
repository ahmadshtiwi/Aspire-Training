import java.util.Optional;

public class StudentOptional{

    final String studentID;
   public StudentOptional(String studentID)
    {
        this.studentID=studentID;
    }


    public Optional<String> getStudentId()
    {
    return  this.studentID.equals("0")
            ?
            Optional.of("The Student Id is Zero")
            :
            Optional.of(this.studentID);

    }

}
