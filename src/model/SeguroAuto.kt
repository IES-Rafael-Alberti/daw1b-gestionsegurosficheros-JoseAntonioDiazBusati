package model

class SeguroAuto(
    numPoliza: Int,
    dniTitular: String,
    importe: Double
):Seguro(numPoliza, dniTitular, importe) {

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