package com.kamleshit.Service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.kamleshit.binding.CitizenInfo;
import com.kamleshit.binding.IndvInfo;
import com.kamleshit.binding.PlanInfo;

@Service
public class DetermineEligibilityService 
{
	public PlanInfo determineEligibility(CitizenInfo citizenInfo) throws Exception
	{
		IndvInfo indvInfo = new IndvInfo();	
		BeanUtils.copyProperties(citizenInfo, indvInfo);
		
		String planname = citizenInfo.getPlanname();
		String drlFile = null;
		if(planname.equals("SNAP"))
		{
			drlFile="com/ed/rules/SNAP.drl";
		}
		
		if(planname.equals("CCAP"))
		{
			drlFile ="com/ed/rules/SNAP.drl";
		}
		
		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/com/rule/rules.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();


		workingMemory.insert(indvInfo);
		workingMemory.fireAllRules();

		
		return indvInfo.getPlanInfo();
		
	}

}
