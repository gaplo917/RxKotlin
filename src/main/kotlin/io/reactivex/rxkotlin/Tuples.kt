package io.reactivex.rxkotlin

import java.io.Serializable

data class Tuple4<out T1, out T2, out T3, out T4>(
        val first: T1,
        val second: T2,
        val third: T3,
        val fourth: T4
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth)"
}

fun <T> Tuple4<T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth)


data class Tuple5<out T1, out T2, out T3, out T4, out T5>(
        val first: T1,
        val second: T2,
        val third: T3,
        val fourth: T4,
        val fifth: T5
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth, $fifth)"
}

fun <T> Tuple5<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth)

data class Tuple6<out T1, out T2, out T3, out T4, out T5, out T6>(
        val first: T1,
        val second: T2,
        val third: T3,
        val fourth: T4,
        val fifth: T5,
        val sixth: T6
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth)"
}

fun <T> Tuple6<T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth)

data class Tuple7<out T1, out T2, out T3, out T4, out T5, out T6, out T7>(
        val first: T1,
        val second: T2,
        val third: T3,
        val fourth: T4,
        val fifth: T5,
        val sixth: T6,
        val seventh: T7
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh)"
}

fun <T> Tuple7<T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh)

data class Tuple8<out T1, out T2, out T3, out T4, out T5, out T6, out T7, out T8>(
        val first: T1,
        val second: T2,
        val third: T3,
        val fourth: T4,
        val fifth: T5,
        val sixth: T6,
        val seventh: T7,
        val eighth: T8
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth)"
}

fun <T> Tuple8<T, T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth)

data class Tuple9<out T1, out T2, out T3, out T4, out T5, out T6, out T7, out T8, out T9>(
        val first: T1,
        val second: T2,
        val third: T3,
        val fourth: T4,
        val fifth: T5,
        val sixth: T6,
        val seventh: T7,
        val eighth: T8,
        val ninth: T9
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth, $ninth)"
}

fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

