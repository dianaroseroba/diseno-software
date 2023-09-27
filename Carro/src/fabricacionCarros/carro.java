package fabricacionCarros;

class Llanta {
    private String tamaño;
    private String tipo;

    public Llanta(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getDetalles() {
        return "Tamaño: " + tamaño + ", Tipo: " + tipo;
    }
}

class Chasis {
    private double peso;
    private String material; // Aluminio o Acero

    public Chasis(double peso, String material) {
        this.peso = peso;
        this.material = material;
    }

    public String getDetalles() {
        return "Peso: " + peso + ", Material: " + material;
    }
}

class Carro {
    private Llanta llantas;
    private Chasis chasis;
    private String color;

    public Carro(Llanta llantas, Chasis chasis, String color) {
        this.llantas = llantas;
        this.chasis = chasis;
        this.color = color;
    }

    public String getDetalles() {
        return "Llantas: [" + llantas.getDetalles() + "], Chasis: [" + chasis.getDetalles() + "], Color: " + color;
    }
}

class Planta {
    private String tamañoLlantas;
    private String tipoLlantas;
    private double pesoChasis;
    private String materialChasis; // Aluminio o Acero
    private String[] colores;

    public Planta(String tamañoLlantas, String tipoLlantas, double pesoChasis, String materialChasis, String[] colores) {
        this.tamañoLlantas = tamañoLlantas;
        this.tipoLlantas = tipoLlantas;
        this.pesoChasis = pesoChasis;
        this.materialChasis = materialChasis;
        this.colores = colores;
    }

 
}


