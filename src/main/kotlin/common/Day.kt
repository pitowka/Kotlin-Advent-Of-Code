package common

import _2015.Day1

interface Day {
    fun part1()
    fun part2()

    fun solve(){
        part1()
        part2()
    }

    fun resourceAsString(name: String) = this::class.java.getResource(name)!!.readText()

    /**
     * Reads the resource as a list of lines
     * Example: resourceAsLines("/resourcePath").forEachIndexed { index, line -> println("$index: $line") }
     */
    fun resourceAsLines(name: String) = resourceAsString(name).lines()
}