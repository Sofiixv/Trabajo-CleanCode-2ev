import exceptions.EdadNotValid;
import model.DatosUsuario;
import model.OperacionesUsuario;
import model.Usuario;

public class App {
    public static void main(String[] args)  {
       /* USO INCORRECTO
        Usuario usuario = new Usuario();
        usuario.nombre = "Juan";
        usuario.edad = 30;
        
        String nombreUsuario = OperacionesUsuario.obtenerNombreUsuario(usuario);
        System.out.println(nombreUsuario);*/


        Usuario usuario = new Usuario("Juan", 16);
        String nombreUsuario = OperacionesUsuario.obtenerNombre(usuario);
        System.out.println(nombreUsuario);

        // if (OperacionesUsuario.validarEdad(usuario.getEdad())) {
        //     System.out.println("La edad es correcta");
        // }
        // else{
        //     System.out.println("La edad es incorrecta");
        // }

            try {
                OperacionesUsuario.validarEdad(usuario.getEdad());
                System.out.println("La edad es correcta");
            } catch (EdadNotValid e) {
                
                e.getMessage();
            }

            
    }
    }

