#language:es
@Login
Característica: Inicio de Sesion
  yo como usuario inicio sesion en www.phptravels.net/admin

  Esquema del escenario: logueo exitoso
    Dado que ingreso a la pagina y digito mi usuario, contrasena
    Y realizo el login correctamente
      | correo   | clave   |
      | <correo> | <clave> |
		Entonces doy click en iniciar sesion
		
    Ejemplos: 
      | correo               | clave     |
      | admin@phptravels.com | demoadmin |

      