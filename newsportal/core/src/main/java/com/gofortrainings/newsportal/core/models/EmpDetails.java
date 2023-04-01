package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class EmpDetails {
	@ValueMapValue
	private int empId;
	
	@ValueMapValue
	private int empName;
	
	@ValueMapValue
	private int empSalary;

	public int getEmpId() {
		return empId;
	}

	public int getEmpName() {
		return empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

}
