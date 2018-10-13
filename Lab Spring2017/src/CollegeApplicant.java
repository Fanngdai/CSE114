/*
 * Lab 19 part 3
 */
public abstract class CollegeApplicant {
	protected String applicantName;
	protected String collegeApplied;
	
	public void setApplicantName(String applicantName){
		this.applicantName = applicantName;
	}
	
	public void setCollegeApplied(String collegeApplied){
		this.collegeApplied = collegeApplied;
	}
	
	public String getApplicantName(){
		return this.applicantName;
	}
	
	public String getCollegeApplied(){
		return this.collegeApplied;
	}
}