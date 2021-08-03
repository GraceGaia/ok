import java.util.*

fun main(args: Array<String>) {
    //Create a logic that will capture both the names and the
    //admission numbers of any number of students
    var retrieve = Scanner(System.`in`)
    println("How many names do you have?")
    var name_numbers = retrieve.nextInt()
    //enter names with their corresponding admission numbers
    var majina = arrayOfNulls<String>(name_numbers)
    var admissions = arrayOfNulls<String>(name_numbers)

    var position = 0
    while (position < name_numbers){
        majina[position] = retrieve.next()
        admissions[position] = retrieve.next()
        position++
    }
    var print_position = 0
    while (print_position < name_numbers){
        println("Name is"+majina[print_position]+"....ADM Number is"+admissions[print_position])
        print_position++
    }
}