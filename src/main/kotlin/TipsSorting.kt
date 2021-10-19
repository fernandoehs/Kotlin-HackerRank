
fun main(){
    val frutas = mutableListOf("Manzana","Platano","Papaya", "Sandía", "Piña","Fresa")

    frutas.sortWith (
        compareBy <String> {it .length } . thenBy {it}
    )
    print(frutas.joinToString()) //Piña, Fresa, Papaya, Sandía, Manzana, Platano
}