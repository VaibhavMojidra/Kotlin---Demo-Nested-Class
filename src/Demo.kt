//Kotlin nested class is by default static, hence, it can be accessed without creating any object of that class but with the help of . dot operator. Same time we cannot access members of the outer class inside a nested class.

class Outer {
   class Nested {
      fun foo() = "Vaibhav Mojidra"
   }
}

fun main(args: Array<String>) {
   val obj = Outer.Nested()

   print(obj.foo())
}
