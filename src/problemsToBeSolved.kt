import java.util.*


fun main(){
    val x = problemsToBeSolved()


        val numbers: List<Any?> = listOf(1, 2,listOf(4,3), null, 4)
        val nonNullNumbers = numbers.filterNotNull()



        val flatList = mutableListOf<Int>()
        x.flattenList(nonNullNumbers, flatList)
        println("Flattened : " + flatList)







}



class problemsToBeSolved() {


    fun onlyOnce(listA: List<Int>) {

        for (i in listA.indices) {
            var counter = 0
            for (element in listA) {
                if (listA[i] == element) {
                    counter++
                }
            }
            if (counter == 1) {
                println(listA[i])
            }
        }

    }

   fun changeUpperAndLower(myString: String) {
    for (i in myString) {
        when {
            i.isLowerCase() -> print(i.toUpperCase())
            i.isUpperCase() -> print(i.toLowerCase())
            else -> print(i)
        }
    }


        }

    fun closingPair(theString: String): Boolean {
        val theStack = Stack<Char>()
        for (element in theString) {
            if (element == '[' || element == '{' || element == '(') theStack.push(element)
            else if (element == ']' || element == '}' || element == ')') {
                if (theStack.empty()) return false
                when (element) {
                    ']' -> if (theStack.pop() != '[') return false
                    '}' -> if (theStack.pop() != '{') return false
                    ')' -> if (theStack.pop() != '(') return false
                    else -> {}
                }
            }
        }
        return theStack.empty()
    }
    fun flattenList(nestList: List<Any>, flatList: MutableList<Int>) {
        for (e in nestList)
            if (e is Int)
                flatList.add(e)
            else
                flattenList(e as List<Any>, flatList)
    }






    }



