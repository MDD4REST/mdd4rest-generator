package com.github.icelyframework.generator.pim.inputParser;

public class YamlConstraint {
	public String Operator;
	public YamlOperand RightOperand;
	public YamlOperand LeftOperand;

	
	public YamlConstraint() {

	}
	
	public YamlConstraint(String Operator) {
		this.Operator = Operator;
	}
	
	public YamlConstraint(String Operator, YamlOperand RightOperand) {
		this.Operator = Operator;
		System.out.println("RightOperand:: "+RightOperand);
		this.RightOperand = RightOperand;
	}

	public YamlConstraint(String Operator, YamlOperand RightOperand, YamlOperand LeftOperand) {
		this.Operator = Operator;
		System.out.println("RightOperand:: " + RightOperand);
		this.RightOperand = RightOperand;
		this.LeftOperand = LeftOperand;
	}

	
	@Override
	public String toString() {
		return Operator + "(RightOperand = " + RightOperand + ", LeftOpeand=" + LeftOperand + ")";
	}

	public String toYAMLString() {
		String all = "  - Operator: " + Operator;
		all += "\n    RightOperand: " + RightOperand;
		all += "\n    RightOperand: " + LeftOperand;
		return all;
	}

	
	public String getOperator(){
		return this.Operator;
	}
	
	public YamlOperand getRightOperand(){
		return this.RightOperand;
	}
	
	public YamlOperand getLeftOperand(){
		return this.LeftOperand;
	}
}
