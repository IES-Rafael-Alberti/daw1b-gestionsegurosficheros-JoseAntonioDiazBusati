package model

class SeguroHogar : Seguro {

    private val metrosCuadrados: Double
    private val valorContenido: Double
    private val direccion: String
    private val anioConstruccion: Double

    constructor(
        dniTitular: String,
        importe: Double,
        metrosCuadrados: Double,
        valorContenido: Double,
        direccion: String,
        anioConstruccion: Double
    ) : super(numPoliza = ++numPolizaHogar, dniTitular, importe) {
        this.metrosCuadrados = metrosCuadrados
        this.valorContenido = valorContenido
        this.direccion = direccion
        this.anioConstruccion = anioConstruccion
    }

    private constructor(
        numPoliza: Int,
        dniTitular: String,
        importe: Double,
        metrosCuadrados: Double,
        valorContenido: Double,
        direccion: String,
        anioConstruccion: Double
    ) : super(numPoliza, dniTitular, importe) {
        this.metrosCuadrados = metrosCuadrados
        this.valorContenido = valorContenido
        this.direccion = direccion
        this.anioConstruccion = anioConstruccion
    }

    companion object {
        private var numPolizaHogar: Int = 100000

        val PORCENTAJE_INCREMENTO_ANIOS = 0.02

        val CICLO_ANIOS_INCREMENTO = 5.0

        fun crearSeguro(datos: List<String>): SeguroHogar? {
            try {
                return SeguroHogar(
                    datos[0].toInt(),
                    datos[1],
                    datos[2].toDouble(),
                    datos[3].toDouble(),
                    datos[4].toDouble(),
                    datos[5],
                    datos[6].toDouble()
                )
            } catch (e: IllegalArgumentException) {
                println("Datos no válidos!!!")
            }
            return null
        }
    }


    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        if (anioConstruccion < CICLO_ANIOS_INCREMENTO) {
            return interes
        } else {
            return (((anioConstruccion / CICLO_ANIOS_INCREMENTO) * PORCENTAJE_INCREMENTO_ANIOS) * interes) + interes
        }
    }


    override fun serializar(separador: String): String {
        return super.serializar(separador)
    }

    override fun toString(): String {
        return super.toString()
    }
}