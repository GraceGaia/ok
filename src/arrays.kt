fun main(args: Array<String>) {
    var names = arrayOf("King","Grace","Mariga","Issack","Ahmed","Abdullahi")
    for (x in names){
        println(x)
    }

    var ages = arrayOfNulls<Int>(5)
    ages[0] = 105
    ages[1] = 768
    ages[2] = 521
    ages[3] = 687
    ages[4] = 901
    for(mwaka in ages){
        println(mwaka)
    }


}