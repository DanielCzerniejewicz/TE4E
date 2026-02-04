fun Zad1(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (x != y) {
        if (x > y) x = x - y
        else y = y - x
    }
    return x
}

fun Zad2(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = x % y
        x = y
        y = temp
    }
    return x
}

fun Zad3(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    var a = 0
    var b = 1
    for (i in 2 until n) {
        val c = a + b
        a = b
        b = c
    }
    return b
}

fun Zad4(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return Zad4(n - 1) + Zad4(n - 2)
}

fun Zad5(n: Int): Int {
    var wynik = 1
    for (i in 1 until n) {
        wynik = wynik * i
    }
    return wynik
}

fun Zad6(n: Int): Int {
    if (n == 0) return 1
    return n * Zad6(n - 1)
}

fun Zad7(a: IntArray, x: Int): Int {
    var wynik = 0
    for (i in a) {
        wynik = wynik * x + a[i]
    }
    return wynik
}


fun Zad8(n: Int): Int {
    var x = n
    var suma = 0
    while (x > 0) {
        suma = suma + (x % 10)
        x = x / 10
    }
    return suma
}

fun Zad9(n: Int, m: Int) {
    for (i in n until m) {
        if (i > 1) {
            var pierwsza = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    pierwsza = false
                }
            }
            if (pierwsza) {
                println(i)
            }
        }
    }
}

fun Zad10(x: Int, k: Int, l: Int) {
    for (i in k..l) {
        if (i != 0 && x % i == 0) {
            println(i)
        }
    }
}
