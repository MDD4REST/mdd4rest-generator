rule Project 
	match l : DynamicPIM!Project with r : StaticPIM!Project {
	compare : l.name = r.name and
		l.basePath = r.basePath
}

rule Application 
	match l : DynamicPIM!Application with r : StaticPIM!Application {

	compare : l.name = r.name
}

rule Aggregate
	match l : DynamicPIM!Aggregate with r : StaticPIM!Aggregate {

	compare : l.name = r.name
}

rule Resource
	match l : DynamicPIM!Resource with r : StaticPIM!Resource {

	compare : l.name = r.name
}

rule PrimitiveType
	match l : DynamicPIM!PrimitiveType with r : StaticPIM!PrimitiveType {

	compare : l.type = r.type
}

rule ComplexType
	match l : DynamicPIM!ComplexType with r : StaticPIM!ComplexType {

	compare : l.type = r.type
}

@greedy
rule Resource
	match l : DynamicPIM!Resource with r : StaticPIM!Resource {

	compare : l.name = r.name
}

@greedy
rule DomainObject
	match l : DynamicPIM!DomainObject with r : StaticPIM!DomainObject {

	compare : l.name = r.name
}

/*
rule  Entity
	match l : DynamicPIM!Entity with r : StaticPIM!Entity {

	compare : l.name = r.name
}

rule  Enumeration
	match l : DynamicPIM!Enumeration with r : StaticPIM!Enumeration {

	compare : l.name = r.name
}

rule  
	match l : DynamicPIM!ValueObject with r : StaticPIM! {

	compare : l.name = r.name
}

rule  
	match l : DynamicPIM! with r : StaticPIM! {

	compare : l.name = r.name
}
*/