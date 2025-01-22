package com.example.beans;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {
	@Autowired
	ApplicationArguments appArgs;
	public void showArgs() {
		System.out.println("non option arguments");
		System.out.println("-------------");
		List<String> nonOptionList=appArgs.getNonOptionArgs();
		nonOptionList.forEach(str->System.out.println(str));
		System.out.println("Option Arguments");
		System.out.println("--------------------");
		Set<String> optionArguments=appArgs.getOptionNames();
		optionArguments.forEach(str->{
			System.out.println(str+"=");
			appArgs.getOptionValues(str).forEach(v->System.out.println(v+""));
		});
	}

}
