package data

import model.Perfil
import model.Usuario

class RepoUsuariosMem: IRepoUsuarios {

    val usuarios = mutableListOf<Usuario>()

    override fun agregar(usuario: Usuario): Boolean {
        if (buscar(usuario.nombre)== null){
            usuarios.add(usuario)
            return true
        }
        return false
    }

    override fun buscar(nombreUsuario: String): Usuario? {
        TODO("Not yet implemented")
    }

    override fun eliminar(usuario: Usuario): Boolean {

        return true
    }

    override fun eliminar(nombreUsuario: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun obtenerTodos(): List<Usuario> {
        TODO("Not yet implemented")
    }

    override fun obtener(perfil: Perfil): List<Usuario> {
        TODO("Not yet implemented")
    }

    override fun cambiarClave(usuario: Usuario, nuevaClave: String): Boolean {
        TODO("Not yet implemented")
    }
}