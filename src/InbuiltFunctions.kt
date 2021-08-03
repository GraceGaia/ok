fun main(args: Array<String>) {
    motto()
    mission()
    avg(1, 34.5, 6453f)
    rectangle_area(45.2, 34.5)
    cylinder("Grace", 70.0, 10.0)
}

fun motto(){
    println("Hey, it worked")
}

fun mission(){
    println("Hey this is our mission")
}
fun avg( x:Int, y:Double, z:Float){
    var average = (x+y+z)/3.0
    println("Your average is $average")
}

fun rectangle_area(l:Double, w:Double){
    var area = l * w
    println("Your area is $area")
}

fun cylinder(n:String, r:Double, h:Double){
    var volume = Math.PI * Math.pow(r,2.0) * h
    if (volume<10000){
        println("Hi $n, your volume is $volume and this is a small cylinder")
    }else{
        println("Hi $n, your volume is $volume and this is a large cylinder")
    }
}