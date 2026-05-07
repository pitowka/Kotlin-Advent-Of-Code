package _2015

import common.Day

class Day2: Day {
    class Box(val x: Int, val y: Int, val z: Int) {
        companion object {
            operator fun invoke(box: String) = box.split("x")
                .map { it.toInt() }
                .let { (a, b, c) -> Box(a, b, c) }
        }

//        companion object {
//            operator fun invoke(box: String): Box {
//                val (a, b, c) = box.split("x").map { it.toInt() }
//                return Box(a, b, c)
//            }
//        }

        fun wrappingPaper(): Int {
            return 2 * (x * y + x * z + y * z) +
                listOf(x, y, z)
                    .sorted()
                    .take(2)
                    .reduce { acc, next -> acc * next }
        }
        fun ribbonLength(): Int {
            return listOf(x, y, z)
                .sorted()
                .take(2)
                .sum() * 2 +
                x * y * z
        }
    }

    override fun part1(): Int {
        return resourceAsLines("/_2015/day2")
            .sumOf { Box(it).wrappingPaper() }
    }

    override fun part2(): Int {
        return resourceAsLines("/_2015/day2")
            .sumOf { Box(it).ribbonLength() }
    }
}

fun main() {
    Day2().solve()
}