package common

interface Day {
    fun part1(): Any
    fun part2(): Any

    fun solve(){
        println(part1())
        println(part2())
    }

    fun resourceAsString(name: String) = this::class.java.getResource(name)!!.readText()

    /**
     * Reads the resource as a list of lines
     * Example: resourceAsLines("/resourcePath").forEachIndexed { index, line -> println("$index: $line") }
     */
    fun resourceAsLines(name: String) = resourceAsString(name).lines()
}