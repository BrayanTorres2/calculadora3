package Mundo

//controlador
fun suma(a:Int,b:Int):Int{
    return a+b
}
fun resta(a:Int,b:Int):Int{
    return a-b
}
fun multiplicar(a:Int,b:Int):Int{
    return a*b
}
fun dividir(a:Int,b:Int):Double{
    return (a.toDouble()/b.toDouble())
}
//comentario para prueba
fun potencia(a:Int,b:Int): Double {
    return Math.pow(a.toDouble(),b.toDouble())
}