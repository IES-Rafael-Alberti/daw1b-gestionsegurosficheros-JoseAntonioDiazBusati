package model

enum class Perfil () {
    ADMIN, // Puede gestionar seguros y usuarios
    GESTION, // Puede gestionar seguros pero no puede crearlos o eliminarlos
    CONSULTA; // Solo puede ver informacion

    companion object{
        fun getPerfil(valor: String):Perfil{
            return when{
                valor.lowercase() == "admin" -> ADMIN
                valor.lowercase() == "gestion" -> GESTION
                valor.lowercase() == "consulta" -> CONSULTA
                else -> CONSULTA
            }
        }
    }
}