import { Component } from '@angular/core';

@Component({
  selector: 'app-empleado',
  templateUrl: './empleado.component.html',
  styleUrl: './empleado.component.css'
})
export class EmpleadoComponent {
nombre="Edgardo";
apellido="Cozzo";
edad=33;
oli=false;
usuRegistrado=false;

llamaEmpresa(value:String){
}

getRegistroUsuario(){
  this.usuRegistrado=true;
}


// empresa="quinto";

// getEdad(){
//   return this.edad;
// }

}
