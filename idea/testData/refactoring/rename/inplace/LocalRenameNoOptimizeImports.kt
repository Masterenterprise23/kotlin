package foo

import foo.A

fun f() {
    val <caret>x = 5
    println(x + x * x)
}

class A

// NAME: y