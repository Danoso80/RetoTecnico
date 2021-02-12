# language:es
@AgregarCategoria
Característica: Agregar categoria nueva
  yo como usuario quiero agregar una categoria y validar que esta se haya creado

  Antecedentes: Logeo en la pagina
    Dado que ingreso a la pagina y digito mi usuario, contrasena

  Esquema del escenario: Creacion de una nueva categoria
    Y realizo el login correctamente
      | correo   | clave   |
      | <correo> | <clave> |
    Entonces doy click en iniciar sesion
    Y selecciono las opciones para ingresar al formulario
    Entonces ingreso los datos solicitados en los formularios
      | categoria   | nViet   | nRuso   | nArabe   | nFarsi   | nTurco   | nFrances   | nEsp   | nAleman   |
      | <categoria> | <nViet> | <nRuso> | <nArabe> | <nFarsi> | <nTurco> | <nFrances> | <nEsp> | <nAleman> |
    Y hago click en el boton agregar
    Entonces valido que aparezca la nueva categoria
      | validacion   |
      | <validacion> |

    Ejemplos: 
      | correo               | clave     | categoria | nViet    | nRuso | nArabe        | nFarsi  | nTurco  | nFrances  | nEsp    | nAleman | validacion |
      | admin@phptravels.com | demoadmin | Pruebas   | Kiem tra | Тect  | alaikhtibarat | Pruebas | Testler | Des tests | Pruebas | Tests   | Pruebas    |
