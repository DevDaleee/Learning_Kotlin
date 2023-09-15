fun main(){
    var neverNull: String = "This can't be null"
    //neverNull = null
    
    var nullable: String? = "You can keep a null here"
    nullable = null
    
    var inferredNonNull = "The compliler asumes non-null"
    //inferredNonNull = null
    
    fun strLength(notNull: String?):Int{
        return notNull?.length ?: 0
    }
    
    strLength(neverNull)
    strLength(nullable)
}