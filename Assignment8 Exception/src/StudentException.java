public class StudentException extends  Exception{


    final String studentID;
    public StudentException(String studentID,String  cause)
    {
        super(cause);
        this.studentID=studentID;
    }

    public StudentException(String studentID)
    {
        this.studentID=studentID;
    }

    public String getStudentId() throws StudentException {
        if(this.studentID.equals("0"))
            throw new StudentException(this.studentID , "Student Id is Zero");
        else
            return this.studentID;
    }
}
