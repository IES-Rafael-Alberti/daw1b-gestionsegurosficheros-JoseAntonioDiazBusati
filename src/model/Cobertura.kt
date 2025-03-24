package model

enum class Cobertura (val descripcion: String) {
    TERCEROS (""),
    TERCEROS_AMPLIADO (""),
    FRANQUICIA_200 (""),
    FRANQUICIA_300 (""),
    FRANQUICIA_400 (""),
    FRANQUICIA_500 (""),
    TODO_RIESGO ("");

    companion object{
        fun getCobertura(valor:String){}
    }
}