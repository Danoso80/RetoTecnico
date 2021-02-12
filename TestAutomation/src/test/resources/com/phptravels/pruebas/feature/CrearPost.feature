# language:es
@CrearPost
Característica: Crear un nuevo Post
  yo como usuario quiero crear un nuevo post con mi categoria

  Antecedentes: Logeo en la pagina
    Dado que ingreso a la pagina y digito mi usuario, contrasena

  Esquema del escenario: Creacion de un nuevo post
    Y realizo el login correctamente
      | correo   | clave   |
      | <correo> | <clave> |
    Entonces doy click en iniciar sesion
    Y selecciono las opciones para ingresar formato
    Entonces ingreso los datos necesarios para continuar
      | titulo   | permalink   | bodytext   | keywords   | descripcion   |
      | <titulo> | <permalink> | <bodytext> | <keywords> | <descripcion> |
    Y selecciono la categoria creada y el post relacionado
      | categoria   | rela   |
      | <categoria> | <rela> |
    Y subo la imagen y doy click en Summit

    Ejemplos: 
      | correo               | clave     | titulo             | permalink       | bodytext                                                           | keywords                            | descripcion           | categoria | rela  |
      | admin@phptravels.com | demoadmin | Mi post de pruebas | MiPostDePruebas | Post creado con el fin de demostrar la habilidad de automatizacion | Automatizacion, test, Selenium, Bot | Automatizacion basica | Pruebas   | Hotel |
