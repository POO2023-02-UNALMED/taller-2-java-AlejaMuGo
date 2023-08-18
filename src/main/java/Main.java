package test;

class Asiento {
    public String color;
    public int precio;
    public int registro;
    public void cambiarColor(String color){
        if (color == "rojo" || color == "verde"|| color=="amarillo"||color=="negro"||color=="blanco"){
            this.color=color;
        }
    }
}



class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;

    public void cambiarRegistro(int registro){
        this.registro = registro;
    }
    public void asignarTipo(String tipo){
        if (tipo == "gasolina"||tipo == "electrico" ){
            this.tipo = tipo;
        }
    }
}


class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos() {
        int contador = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        boolean iguales = true;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                if (asientos[i].registro == registro && asientos[i].registro == motor.registro) {
                    iguales = true;
                } else {
                    iguales = false;
                }
            }
        }
        if (iguales == true){
            return "Auto original";
        }
        else {
            return "Las piezas no son originales";
        }
    }
}

