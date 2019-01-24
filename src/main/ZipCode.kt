

package main

import java.io.File


fun main(args: Array<String>) {

    val zipCodeCount = mutableMapOf<String, Int>()
    File("src/zipcodes.txt").forEachLine {
    // var firstDigit = zip / ((pow(10, log(zip) as Int)) as Int)
        val previous = zipCodeCount.getOrDefault(it, 1)
        zipCodeCount.put(it, previous + 1)
        println(zipCodeCount)
        println("here")
    }
    var maxZip  = zipCodeCount.keys.first()
    var maxCount = 0

//     firstDigit(zipCodeCount:Int):Int {
//        while (x > 9) {
//            x /= 10
//        }
//        return x
//    }
   

    for ((zip, count) in zipCodeCount.entries){
        if (count > maxCount) {
                maxCount = count
                maxZip = zip
            }
    }

}

