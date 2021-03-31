package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

	@Size(min=2)
	private String skillDescription;

	@ManyToMany(mappedBy = "skills")
	private final List<Job> jobs= new ArrayList<>();

	public Skill(String skillDescription) {
		this.skillDescription= skillDescription;
	}

	public Skill(){}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public List<Job> getJobs() {
		return jobs;
	}
}