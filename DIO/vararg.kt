fun main() {
    fun printAll(vararg messages: String){
        for(m in messages) println(m)
    }
    
    printAll("Hello", "Hallo", "Salut", "Hola","Olá")
    
	fun printAllWithPrefix(vararg messages: String, prefix: String){
        for(m in messages) println(prefix + m)
    }
    printAllWithPrefix(
    		"Hello", "Hallo", "Salut", "Hola","Olá",
        	prefix = "Greeting: "
    )
    
    fun log(vararg entries: String){
        printAll(*entries)  // Passa como Vararg não como array
    }
    
    log("Hello", "Hallo", "Salut", "Hola","Olá")
}