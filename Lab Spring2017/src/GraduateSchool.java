/*
 * Lab 19 part 3
 */
public class GraduateSchool extends CollegeApplicant{
	private String collegeOrigin;

	public GraduateSchool(String collegeOrigin){
		this.collegeOrigin = collegeOrigin;
	}
	public String college(){
		if(this.collegeOrigin.equals(getCollegeApplied())){
			return "from inside";
		}
		else return "from outside";
	}
	public String getCollegeOrigin(){
		return this.collegeOrigin;
	}
}