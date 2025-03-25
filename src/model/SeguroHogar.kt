package model

class SeguroHogar: Seguro{
   /*
   constructor(
        private val metrosCuadrados: Double,
        private val valorContenido: Double,
        private val direccion: String,
        private val anioConstruccion:Double,
    )
    */

    private constructor(
        numPoliza: Int,
        dniTitular: String,
        importe: Double
    ):super(numPoliza,dniTitular, importe)

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

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}