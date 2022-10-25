sealed class FireType(val shotlength: Int) {
    object SingleShot: FireType(1)
    class MultiShot(shotlength: Int) : FireType(shotlength)

    fun isEmpty(stack : Stack<Ammo>): Boolean{
        stack.isEmpty() && shotlength >= stack.stack.size
        return true

    }

}

//         if (shotlength >= stack.stack.size)