package arreglosunidensionalesbidimensionales;

public class ArreglosUnidensionalesBidimensionales {

    public static void main(String[] args) {

        Arreglo matriz = new Arreglo(3, 3);
        matriz.fill(1, 10);
        Arreglo matriz2 = new Arreglo(3, 3);
        matriz2.fill(1, 10);  
        System.out.println("--------------MATRIZ 1------------------------");
        Arreglo.print(matriz);
        System.out.println("--------------MATRIZ 2------------------");
        Arreglo.print(matriz2);
        
        System.out.println("--------------MULTIPLICACION DE MATRICES------------------");
        if (matriz2.getRen() == matriz.getCol()) {
            Arreglo matriz3 = new Arreglo(matriz.getRen(), matriz2.getCol());
            matriz3.multiplicarmatriz(matriz, matriz2, matriz3);
            Arreglo.print(matriz3);
        } else {
            System.out.println("Imposible Multiplicar Matrices");
        }

        /* matriz.setData(1);
        matriz.setArray(new int[]{7,14,125,21,208,-2,42,56,540});
        for (int object : matriz.search(0)) {
            System.out.println(" "+object);
        }
  matriz.search(0);
        
        matriz.print();
        
        //matriz2.fill(1, 101);
        matriz2.print();*/
    }

}
