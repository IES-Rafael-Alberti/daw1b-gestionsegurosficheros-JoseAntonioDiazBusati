package model

class SeguroAuto:Seguro {

    private val descripcion: String
    private var combustible: Double
    private val tipoAuto: Auto
    private val cobertura: Cobertura
    private val asistenciaCarretera: Boolean
    private val numPartes: Int



    companion object{
        var numPolizasAuto: Int = 400000
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        TODO("Not yet implemented")
    }

    override fun tipoSeguro(): String {
        TODO("Not yet implemented")
    }

    override fun serializar(separador: String): String {
        return super.serializar(separador)
    }

    override fun toString(): String {
        return super.toString()
    }
}