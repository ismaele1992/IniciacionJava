public class Television {
    private boolean boton_encendido = false;
    private boolean pulsar_subir_volumen = false;
    private boolean boton_bajar_volumen = false;
    private int canal_seleccionado = 0;
    private int nivel_volumen = 0;
    private int nivel_brillo = 0;
    private boolean boton_cambiar_canal = false;
    // TODO: Añadir atributo de clase que almacene el canal seleccionado
    // TODO: Añadir atributo que almacene el nombre del canal seleccionado

    public boolean isBoton_encendido() {
        return boton_encendido;
    }

    public void setBoton_encendido(boolean boton_encendido) {
        this.boton_encendido = boton_encendido;
    }

    public boolean isPulsar_subir_volumen() {
        return pulsar_subir_volumen;
    }

    public void setPulsar_subir_volumen(boolean pulsar_subir_volumen) {
        this.pulsar_subir_volumen = pulsar_subir_volumen;
    }

    public boolean isBoton_bajar_volumen() {
        return boton_bajar_volumen;
    }

    public void setBoton_bajar_volumen(boolean boton_bajar_volumen) {
        this.boton_bajar_volumen = boton_bajar_volumen;
    }

    public int getCanal_seleccionado() {
        return canal_seleccionado;
    }

    public void setCanal_seleccionado(int canal_seleccionado) {
        this.canal_seleccionado = canal_seleccionado;
    }

    public int getNivel_volumen() {
        return nivel_volumen;
    }

    public void setNivel_volumen(int nivel_volumen) {
        this.nivel_volumen = nivel_volumen;
    }

    public boolean isBoton_cambiar_canal() {
        return boton_cambiar_canal;
    }

    public void setBoton_cambiar_canal(boolean boton_cambiar_canal) {
        this.boton_cambiar_canal = boton_cambiar_canal;
    }

    public void subir_brillo(){
        if (nivel_brillo < 100){
            nivel_brillo++;
        }
    }

    public void bajar_brillo(){
        if (nivel_brillo > 0){
            nivel_brillo--;
        }
    }

    public void subir_volumen(){
        if (nivel_volumen < 100 && pulsar_subir_volumen){
            nivel_volumen++;
        }
    }

    public void bajar_volumen(){

    }

    // TODO: Añadir método que cambie de canal y almacene el canal actual. El canal tiene que tener un valor entre 1 y 255

    // TODO: Añadir método que almacene el texto del canal seleccionado. Sólo almacenar el texto de los canales del 1 al 9. Los demás canales tendrán el texto en blanco
    // Nota: Buscar información sobre como se implementa una estructura switch

    // TODO: Añadir método que devuelva el nombre del canal que está seleccionado
}
