


fun main(args: Array<String>) {

    val ipToCount = mutableMapOf<String, Int>()
    File("src/zipcodes.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }
}