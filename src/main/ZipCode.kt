package main

fun main (args: Array<String>) {

val zipCount = mutableMapOfString<Int, Int>()
Read in the file of zip codes

File("src/zipcodes.txt").forEachLine {
val previous = zipCount.getOrDefault(it, 0)
zipCount.put(it, previous + 1)
}

}