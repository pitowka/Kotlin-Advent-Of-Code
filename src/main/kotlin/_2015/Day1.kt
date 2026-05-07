package _2015

import common.Day

class Day1: Day{
    override fun part1(): Int {
        return resourceAsString("/_2015/day1")
            .asSequence()
            .sumOf { if (it == '(') 1 else -1 }
    }

    override fun part2(): Int {
        return resourceAsString("/_2015/day1")
            .asSequence()
            .map { if (it == '(') 1 else -1 }
            .runningFold(0) { acc, next -> acc + next }
            .indexOfFirst { it == -1 }
    }
}

fun main() {
    Day1().solve()
}