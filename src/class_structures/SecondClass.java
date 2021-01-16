// Every single Java file should start with package keyword and package name
// So package keyword's is simple to declare under which package this class is created in
//
package class_structures;


    //public -> access modifier
    //access modifier -> is a keyword which defines in which classes this class or method can be used
    //access modifier types ->
    //1.public
    //2. default (we don't type anything)
    //3. protected
    //4. private

    //for classes we can only use two access modifiers -. public and default.
    //what is the access level of this class? Default
//if your class is public, your class name must match with the fileName. otherwise int not gonna work
//file format -> every program uses certain type of file formats.
 // order must be as follows:
//access modifier class ClassName {
//curly braces ({}) always come in pairs -> they define the scope of a class, method, statement.
//Dynamic -> it can change.
//static -> it cannot change

//what is tmain method?
//every program must have at least one main method.
//main method is a starting point of an application.
// methods are functionalities
//when we start the program java behind the scenes(under the hood)
//looks for a method with name main
//main - short cut as well as psvm - but dont use them often
//semi colons are used to end a statement.
//statement as a sentence and semi as a period.
// print out to console
//IDE -> Integrated Development Environment
// to insert double quots we are using System.out.println("\"df\"")
  public class SecondClass {
 public static void main(String[] args) {
System.out.println("My favorite quote is \"When you focus on the good, The good gets better\"");


 }
}
