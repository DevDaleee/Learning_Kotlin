class MutableLeStack<E>(vararg items: E){
    private val elements = items.toMutableList()
    
    fun push(element: E) = elements.add(element)
    
    fun peek():E = elements.last()
    
    fun pop(): E = elements.removeAt(elements.size - 1)
    
    fun isEmpty() = elements.isEmpty()
    
    fun size() = elements.size
    
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main(){
    val stack = MutableLeStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)
}