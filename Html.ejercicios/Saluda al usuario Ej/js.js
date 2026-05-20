function saludar() {

  // Obtener el valor del input
  let nombre = document.getElementById("usuario").value;

  // Obtener el párrafo
  let mensaje = document.getElementById("mensaje");

  // Validar si está vacío
  if (nombre.trim() === "") {

    mensaje.innerHTML = "No me has dicho tu nombre!!";

  } else {

    mensaje.innerHTML = "Hola " + nombre + ", ¿Cómo estás?";
  }
}