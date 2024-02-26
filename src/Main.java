import java.util.*;

public class Main {

    public static HashMap<String, String> Diccionario = new HashMap<String, String>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion=1;
        while (opcion<4 && opcion> 0){
            System.out.println("------------Menu----------");
            System.out.println("1) Crear diccionario");
            System.out.println("2) Agregar o actualizar palabra");
            System.out.println("3) Hacer prueba");
            System.out.println("4) Mostrar diccionario");
            System.out.println("5) Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    crearDiccionario();
                    break;
                case 2:
                    agregarActualizarPalabra();
                    break;
                case 3:
                    prueba();
                    break;
                case 4:
                    mostrar();
                    break;
                default:
                    break;
            }

        }
    }

    public static void  crearDiccionario(){
        Diccionario.put("Casa","House");
        Diccionario.put("Dormitorio","Bedroom");
        Diccionario.put("Baño","Bathroom");
        Diccionario.put("Comedor","Dining room");
        Diccionario.put("Cocina","Kitchen");
        Diccionario.put("Sala de estar","Living room");
        Diccionario.put("Perro","Dog");
        Diccionario.put("Árbol","Tree");
        Diccionario.put("Libro","Book");
        Diccionario.put("Sol","Sun");
        Diccionario.put("Tiempo","Time");
        Diccionario.put("Amigo","Friend");
        Diccionario.put("Agua","Water");
        Diccionario.put("Computadora","Computer");
        Diccionario.put("Feliz","Happy");
        Diccionario.put("Montaña","Mountain");
        Diccionario.put("Trabajo","Work");
        Diccionario.put("Jugar","Play");
        Diccionario.put("Cielo","Sky");
        Diccionario.put("Gato","Cat");

    }
    public static void agregarActualizarPalabra() {
        System.out.println("Digite la palabra en español");
        String espanol = sc.next();

        System.out.println("Digite la traduccion en ingles");
        String ingles = sc.next();

        Diccionario.put(espanol, ingles);
    }
    public static void prueba(){
        int aciertos = 0;
        int fallos = 0;

        for(int i = 1; i<=5;i++){

            List<String> valuesList = new ArrayList<String>(Diccionario.keySet().stream().toList());
            int random = new Random().nextInt(valuesList.size());
            String espanol = valuesList.get(random);
            String ingles = Diccionario.get(espanol);

            System.out.println("Digite la traduccion en ingles de la palabra "+ espanol);
            String traduccion = sc.next();

            if(ingles.equalsIgnoreCase(traduccion)){
                aciertos = aciertos + 1;
            }   else{
                fallos = fallos + 1;
            }
        }

        System.out.println("numero de aciertos = " + aciertos);
        System.out.println("numero de errores = " + fallos);
    }
    public static void mostrar(){
        Diccionario.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });
    }

}
