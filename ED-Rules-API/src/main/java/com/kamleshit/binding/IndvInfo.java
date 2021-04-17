package com.kamleshit.binding;

public class IndvInfo 
{
	private String CaseNum;
	private Integer age;
	private String planname;
	private String isEmployed;
	private String employmentincome;
	private String unemploymentincome;
	private Integer kidscount;
	private String isgraduate;
	
	private PlanInfo planInfo;

	public String getCaseNum() {
		return CaseNum;
	}

	public void setCaseNum(String caseNum) {
		CaseNum = caseNum;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getIsEmployed() {
		return isEmployed;
	}

	public void setIsEmployed(String isEmployed) {
		this.isEmployed = isEmployed;
	}

	public String getEmploymentincome() {
		return employmentincome;
	}

	public void setEmploymentincome(String employmentincome) {
		this.employmentincome = employmentincome;
	}

	public String getUnemploymentincome() {
		return unemploymentincome;
	}

	public void setUnemploymentincome(String unemploymentincome) {
		this.unemploymentincome = unemploymentincome;
	}

	public Integer getKidscount() {
		return kidscount;
	}

	public void setKidscount(Integer kidscount) {
		this.kidscount = kidscount;
	}

	public String getIsgraduate() {
		return isgraduate;
	}

	public void setIsgraduate(String isgraduate) {
		this.isgraduate = isgraduate;
	}

	public PlanInfo getPlanInfo() {
		return planInfo;
	}

	public void setPlanInfo(PlanInfo planInfo) {
		this.planInfo = planInfo;
	}
	
	

}
