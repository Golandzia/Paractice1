import java.lang.Math.sqrt
import java.lang.Math.pow
import kotlin.math.pow

fun main(args: Array<String>) {
    //Ex1
    val exercises: Short = 13
    var exercisesSolved: Short = 0
    exercisesSolved++

    //Ex2
    val age: Int = 18
    exercisesSolved++

    //Ex3
    var ageAverage: Double = 18.0
    ageAverage = (ageAverage + 30) / 2
    exercisesSolved++

    //Ex4
    val testNumber: Short = 3
    val evenOdd: Int = testNumber%2
    /*В задании написано "Теперь ИЗМЕНИТЕ testNumber на какое-то другое число."
      Но ранее говорилось "Создайте КОНСТАНТУ под названием testNumber"
      Нельзя переназначить константу
    */
    exercisesSolved++

    //Ex5
    var answer: Int = 0
    answer++
    answer=+10
    answer *= 10
    answer = answer shr 3
    println("Ex5 answer: $answer")
    exercisesSolved++

    //Ex6
    //var age: Short
    //Ранее уже была объявлена константа age, строка 8
    //Испольуется ключевое слово var, т.к. значение в дальнейшем изменяется
    exercisesSolved++

    //Ex7
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a*100) + b
    val answer2: Int = (a*100) + (b*100)
    val answer3: Int = (a*100) + (b/10)
    println("Ex7 \n In 1 case: $answer1 \n In 2 case: $answer2 \n In 3 case: $answer3")
    exercisesSolved++

    //Ex8
    println("Ex8 Result: " + ( (5*3)-(4/2*2) ) )
    exercisesSolved++

    //Ex9
    //Константы с именами a и b были ранее объявлены в строках 41-42, поэтому назовём их а1 и b1
    val a1: Double = 3.78
    val a2: Double = 19.765
    val average: Double = (a1+a2)/2
    println("Ex9 Result: $average")
    exercisesSolved++

    //Ex10
    val fahrenheit: Double = 100.0
    val celcius: Double = (fahrenheit -32) * 5/9
    println("Ex10 Result: $celcius")
    exercisesSolved++

    //Ex11
    val position: Short = 30
    val row: Int = (position/8)
    val column: Int = (position - (row*8))
    println("Ex11 If point on $position position:\n Column: $column\n Row: $row")
    exercisesSolved++

    //Ex12
    val degrees: Double = 90.0
    val radians: Double = degrees * Math.PI / 180
    println("Ex12 $degrees degrees = $radians radians")
    exercisesSolved++

    //Ex13
    val x1: Double = 1.0
    val y1: Double = 1.0
    val x2: Double = 3.0
    val y2: Double = 3.0
    val distance: Double = sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))
    println("Ex 13 Distance approximately = $distance")
    exercisesSolved++
}