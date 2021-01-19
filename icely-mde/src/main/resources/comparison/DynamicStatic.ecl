rule Project 
	match l : Dynamicview!Project with r : Staticview!Project {
	compare : l.name = r.name and
		l.basePath = r.basePath
}

rule Application 
	match l : Dynamicview!Application with r : Staticview!Application {

	compare : l.name = r.name
}

rule Aggregate
	match l : Dynamicview!Aggregate with r : Staticview!Aggregate {

	compare : l.name = r.name
}

rule Resource
	match l : Dynamicview!Resource with r : Staticview!Resource {

	compare : l.name = r.name
}

rule PrimitiveType
	match l : Dynamicview!PrimitiveType with r : Staticview!PrimitiveType {

	compare : l.type = r.type
}

rule ComplexType
	match l : Dynamicview!ComplexType with r : Staticview!ComplexType {

	compare : l.type = r.type
}

@greedy
rule Resource
	match l : Dynamicview!Resource with r : Staticview!Resource {

	compare : l.name = r.name
}

@greedy
rule DomainObject
	match l : Dynamicview!DomainObject with r : Staticview!DomainObject {

	compare : l.name = r.name
}

/*
rule  Entity
	match l : Dynamicview!Entity with r : Staticview!Entity {

	compare : l.name = r.name
}

rule  Enumeration
	match l : Dynamicview!Enumeration with r : Staticview!Enumeration {

	compare : l.name = r.name
}

rule  
	match l : Dynamicview!ValueObject with r : Staticview! {

	compare : l.name = r.name
}

rule  
	match l : Dynamicview! with r : Staticview! {

	compare : l.name = r.name
}
*/