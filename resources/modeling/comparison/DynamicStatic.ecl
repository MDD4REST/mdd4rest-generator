rule Project 
	match l : DynamicPIM!Project with r : Staticview!Project {
	compare : l.name = r.name and
		l.basePath = r.basePath
}

rule Application 
	match l : DynamicPIM!Application with r : Staticview!Application {

	compare : l.name = r.name
}

rule Aggregate
	match l : DynamicPIM!Aggregate with r : Staticview!Aggregate {

	compare : l.name = r.name
}

rule Resource
	match l : DynamicPIM!Resource with r : Staticview!Resource {

	compare : l.name = r.name
}

rule PrimitiveType
	match l : DynamicPIM!PrimitiveType with r : Staticview!PrimitiveType {

	compare : l.type = r.type
}

rule ComplexType
	match l : DynamicPIM!ComplexType with r : Staticview!ComplexType {

	compare : l.type = r.type
}

@greedy
rule Resource
	match l : DynamicPIM!Resource with r : Staticview!Resource {

	compare : l.name = r.name
}

@greedy
rule DomainObject
	match l : DynamicPIM!DomainObject with r : Staticview!DomainObject {

	compare : l.name = r.name
}

/*
rule  Entity
	match l : DynamicPIM!Entity with r : Staticview!Entity {

	compare : l.name = r.name
}

rule  Enumeration
	match l : DynamicPIM!Enumeration with r : Staticview!Enumeration {

	compare : l.name = r.name
}

rule  
	match l : DynamicPIM!ValueObject with r : Staticview! {

	compare : l.name = r.name
}

rule  
	match l : DynamicPIM! with r : Staticview! {

	compare : l.name = r.name
}
*/