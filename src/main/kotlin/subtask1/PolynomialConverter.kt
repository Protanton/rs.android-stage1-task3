package subtask1

import java.lang.StringBuilder
import kotlin.math.abs

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        return if (numbers.isEmpty()) null
        else {
            val res = StringBuilder()
            var last_num = numbers.lastIndex

            for (i in numbers.indices) {
                if (numbers[i] != 0) {
                    if (abs(numbers[i]) != 1)
                        res.append(abs(numbers[i]))
                } else {
                    last_num--
                    continue
                }
                if (last_num > 0) {
                    res.append(if (last_num == 1) "x" else "x^$last_num")
                    for (j in i + 1 until numbers.size)
                        if (numbers[j] != 0) {
                            res.append(if (numbers[j] > 0) " + " else " - ")
                            break
                        }
                }
                last_num--
            }
            res.toString()
        }
    }
}
