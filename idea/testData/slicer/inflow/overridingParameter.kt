// FLOW: IN

open class A {
    open val foo = 1
}

open class B(override val foo: Int) : A()

class C : B() {
    override val foo = 3
}

fun test(a: A, b: B, c: C) {
    val x = a.foo
    val <caret>y = b.foo
    val z = c.foo
}