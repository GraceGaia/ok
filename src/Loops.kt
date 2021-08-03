fun main(args: Array<String>) {
    var x = 6
    while (x <=5){
        println(x)
        x++
    }

    var y = 16
    do {
        println(y)
        y++
    }while (y <=15)

    var numbers = 45..50
    for(nambari in numbers){
        println(nambari)
    }

    var numerals = 90 downTo 80
    for (nambari in numerals){
        println(nambari)
    }

    var names = arrayOf("Grace","Mariga","Isaack","Liz","Abdullahi","Ahmed")
    for (jina in names){
        println(jina)
    }
    var z = 10
    repeat(10){
        println(z)
    }
}
