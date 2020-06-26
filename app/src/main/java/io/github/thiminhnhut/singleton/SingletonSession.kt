package io.github.thiminhnhut.singleton

class SingletonSession private constructor(){
    private lateinit var username: String

    init {
        println("Create Object with Singleton")
    }

    private object Holder {
        val instance = SingletonSession()
    }

    companion object {
        val instance: SingletonSession by lazy { Holder.instance }
    }

    fun getUsername(): String {
        return username
    }

    fun setUsername(username: String) {
        this.username = username
    }
}