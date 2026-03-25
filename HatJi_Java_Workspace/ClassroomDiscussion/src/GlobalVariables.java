
public class GlobalVariables {
/* Multi line Comment
 * A variable is considered as an Identifier
 * Identifier Rules:
 * 1. It should not start with number but can contain numbers
 * 2. It cannot be a Java Keyword
 * 3. It cannot have any space between the words
 * 4. Only $ and _ are allowed symbols
 * 
 * class South Africa {} x
 * class 5GNetwork {} x
 * class java {} valid
 * class javac {} valid
 * class For {} valid
 * 
 * Syntax:
 * [access_specifier][access_modifier]<datatype><variablename>[=literals];
 * public final double PIE = 3.14;
 * 		  final int MT_EVEREST_HEIGHT = 8848;
 * 				int age = 12;
 * 				boolean isTrue;
 * 
 * Access Specifiers:
 * 	public, private, protected, default (implicit)
 * 
 * Access Modifiers:
 * final, static
 * 
 * A global variable is directly declared inside the class.
 * A global variable can have access specifier and access modifier.
 * It is not mandatory to initialize the global variables.
 * A global variable when not initialized, takes the default value based on the datatype
 * Datatype						DefaultValues
 * Primitives:
 * int, byte, short, long		0
 * float, double					0.0
 * boolean						false
 * char							
 * Non-Primitives
 * String, ArrayList,Employee	null
 * */
// Single line comment
	public final double PIE = 3.14;
	final int MT_EVEREST_HEIGHT = 8848;
	int age = 12;
	boolean isTrue;
	
/* In case of a class the identifier should be named as follows:
 * 1. It should be a noun
 * 2. It cannot be an acronym
 * 3. In case of Multiple words, use Regular or UpperCamelCase
 * 
 * In case of methods:
 * 1. It should be a verb
 * 2. Follow lower camel case startExecution()
 * 
 * In case of variables:
 * 1. It should be an adjective
 * 2. Use _ in case of multiple words
 * */
	

	/*Methods
	 * 
	 * Syntax:
	 * [access_specifier][access_modifier]<return_type><methodname>([Param1, Param2, .....]){
	 * [<return value>]
	 * }
	 * 
	 * public final void method1(String a){
	 * }
	 * 
	 * final void method2(String s){
	 * }
	 * 
	 * void method3(String a){
	 * }
	 * 
	 * void method4(){
	 * }
	 * 
	 * 1. Method that takes zero arguments and returns nothing
	 * void add(){}
	 * 2. Method that takes zero arguments and returns something
	 * String display(){return null;}
	 * 3. Method that takes arguments and returns nothing
	 * void method(int a){}
	 * 4. Method that takes arguments and returns something
	 * int calculate(int a, int b){return a+b}
	 * 
	 * */
	

}
