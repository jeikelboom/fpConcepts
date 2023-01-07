package fp.concepts


// compiler had difficulty with % as mod
fun Int.modulo(divider: Int) = this - divider * this.div(divider)

fun gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a.modulo(b))

