fun main(){
    words("Codehive")
    var x=div(5,3)
    println(x)
    var r=para("effence",24)
    println(r)
    var w=take("waithera")
    println(w)

}
fun words(word:String){
    var results=word[4].toString()+word[5]+word[6]+word[7]
    println(results)
}
fun div(num1:Int,num2:Int):Int{
    var m=num1%num2
    return m
}
fun para(name:String,age:Int):String{
    var sentence="Hi my name is $name and i am $age years old "
    return sentence

}
fun take(name:String):Int{
    var word=name.length
    return word
}