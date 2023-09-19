public class Fila {
    static Fila Instance = null; //Propertie

    private Fila(){} //Constructor

    //Methods
    public static Fila getInstance(){
        if(Instance == null) {
            Instance = new Fila();
        }
        return Instance;
    }

    public static void ImprimeteDocumento(){}
    public static void RemoveDocumento(){}
    public static void RemoveTodosDocumentos(){}
}
