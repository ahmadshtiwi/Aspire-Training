public class StudentRuntimeException extends RuntimeException{


    final String studentID;
    public StudentRuntimeException(String studentID,String  cause)
    {
        super(cause);
        this.studentID=studentID;
    }

    public StudentRuntimeException(String studentID)
    {
        this.studentID=studentID;
    }

    public String getStudentId() {
        if(this.studentID.equals("0"))
            throw new StudentRuntimeException(this.studentID , "Student Id is Zero");
        else
            return this.studentID;
    }
}
