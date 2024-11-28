package com.sirketismi.kasimturkcellcompose



fun CenteredBox() {
}

data class User(val name : String, var surname : String, val imgId : Int)

fun getUsers(): List<User> {
    var list = mutableListOf<User>()
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    list.add(User("Sefa", "Ayçicek", R.drawable.ic_launcher_background))
    return list
}