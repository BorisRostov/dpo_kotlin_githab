class Stack<T>{

    var stack = mutableListOf<T>()

    fun push(item : T) {
        stack.add(item)
    }

    fun pop(): T? {
        return if(stack.isNotEmpty()) {
            stack.removeLast()
        } else null
    }

    fun isEmpty(): Boolean{
        return stack.size  <= 0
    }

}
