document.addEventListener("DOMContentLoaded", function() {
    const mesas = document.querySelectorAll(".mesa");
    const mesaSeleccionadaUl = document.getElementById("mesaSeleccionada");
    const deseleccionarTodoBtn = document.getElementById("deseleccionarTodo");
  
    mesas.forEach(mesa => {
      mesa.addEventListener("click", function() {
        if (mesa.classList.contains("disponible")) {
          // Cambiar de disponible a seleccionada
          mesa.classList.remove("disponible");
          mesa.classList.add("seleccionada");
          agregarSeleccion(mesa.textContent);
          Swal.fire({
            title: 'Mesa Elegida',
            text: `Haz elegido la mesa número ${mesa.textContent}`,
            icon: 'success',
            confirmButtonText: 'Aceptar'
          });
        }
      });
    });
  
    // agregar una mesa a la lista de seleccion
    function agregarSeleccion(mesaTexto) {
      const li = document.createElement("li");
      li.textContent = mesaTexto;
      li.setAttribute("data-mesa", mesaTexto);
      mesaSeleccionadaUl.appendChild(li);
    }
  
    // deseleccionar todas las mesas
    deseleccionarTodoBtn.addEventListener("click", function() {
      mesas.forEach(mesa => {
        if (mesa.classList.contains("seleccionada")) {
          mesa.classList.remove("seleccionada");
          mesa.classList.add("disponible");
        }
      });
      // limpiar la lista de seleccion
      mesaSeleccionadaUl.innerHTML = "";
    });
  });
  